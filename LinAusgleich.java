import java.util.*;

public class LinAusgleich {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // double[] x=vektorEinlesen();
        // double[] y=vektorEinlesen();
        double[] x= {104.0,113.0,130.0,137.0,152.0,178.0,191.0,208.0,227.0,238.0};
        double[] y= {10.4,10.4,11.8,13.0,15.5,19.0,19.0,21.6,31.0,32.4};
        double[][] A=new double[x.length][2];
        for(int i=0;i<x.length;i++){
            A[i]= new double[] {1.0,x[i]};
        }

        double[][] At=matrixTransposition(A);
        matrixAusgeben(At);
        double[][] AtA=matrixProdukt(At,A); //[[10.0, 1678.0], [1678.0, 301960.0]
        matrixAusgeben(AtA);
        double[][] AtAi=matrixInversion(AtA);
        matrixAusgeben(AtAi);          // [[1.4808058220051394, -0.00822887855783754], [-0.00822887855783754, 4.903980070224995E-5]]
        double[] Aty=matrixVektorProdukt(At, y);
        vektorAusgeben(Aty);    
        double[] s=matrixVektorProdukt(AtAi, Aty);
        vektorAusgeben(s);
    }

    public static void matrixAusgeben(double[][] matrix){
        System.out.println(Arrays.deepToString(matrix));
    }

    public static double[] vektorEinlesen(){
        System.out.println("Wie viele Einträge hat der Vektor?");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        double[] vektor=new double[N];
        for (int i=0;i<N;i++){
            System.out.println("gib die nächste Zahl ein");
            vektor[i]=sc.nextDouble();    
        }
        return vektor;
    
    }

    public static void vektorAusgeben(double[] vektor){
        String ret="";
        for (int i=0;i<vektor.length;i++)
        {
            ret+=vektor[i];
            ret+=" ";
        }
        System.out.println(ret);
    }
    public static double[][] matrixProdukt(double[][] matrix1, double[][] matrix2){
        for(int i=0;i<matrix1.length;i++){
            if (matrix1[i].length==matrix2.length){
                // alles gut
            }
           else{
            System.out.println("Die matrizen haben nicht die richtige form");
            return new double[matrix1.length][matrix1[0].length];
           }
        }
           var ret=new double[matrix1.length][matrix2[0].length];
           for(int i=0;i<matrix1.length;i++){                        //loop over zeilen matrix1 
                for (int j=0; j < matrix2[0].length;j++){           //loop over spalten matrix2
                    double sum=0;
                    for (int k=0;k<matrix1[i].length;k++){                //loop over index in zeile in matrix1
                        sum+=matrix1[i][k]*matrix2[k][j];
                    
                    }
                    ret[i][j]=sum;
               }
           }
           return ret;
        }
    public static double[] matrixVektorProdukt(double[][] matrix, double[] vektor){
        //do asserts:
        for(int i=0;i<matrix.length;i++){
            if (matrix[i].length==vektor.length){

            }
            else{
                System.out.println("Die matrix und der Vektor haben nicht die passende Form");
                vektorAusgeben(vektor);
                return new double[vektor.length];
            }
        }
        //matrix multiplication
        double[] ret=new double[matrix.length];
        for(int i=0;i<matrix.length;i++){
            double sum=0;
            for (int j=0;j<vektor.length;j++){
                sum+=matrix[i][j]*vektor[j];
            }
            ret[i]=sum;
        }
        return ret;
        }

    public static double[][] matrixTransposition(double[][] matrix){
        double[][] ret=new double[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ret[j][i]=matrix[i][j];

            }
        }
        return ret;
    }

    public static double[][] matrixInversion(double[][] matrix){
        
        if( (matrix.length==2 && matrix[0].length==2 && matrix[1].length==2) != true){
            System.out.println("Die Matrix ist keine 2x2 matrix");
            return new double[2][2];
        }
        double det=(matrix[0][0]*matrix[1][1] - matrix[1][0]* matrix[0][1]);
        if(det==0){
            System.out.println("Die Determinante ist 0, keine Inverse möglich");
            return new double[2][2];
        }

        double[][] ret=new double[2][2];
        ret[0][0]=(1.0/(det))*matrix[1][1];
        ret[0][1]=(1.0/(det))*matrix[0][1] * -1.0;
        ret[1][0]=(1.0/(det))*matrix[1][0] * -1.0;
        ret[1][1]=(1.0/(det))*matrix[0][0];

        return ret;
        }

}

