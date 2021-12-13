import java.util.*;

public class LinAusgleich {
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    }
    public double[] vektorEinlesen(){
        System.out.println("Wie viele Einträge hat der Vektor?");
        int N=sc.nextInt();
        double[] vektor=new double[N];
        for (int i=0;i<N;i++){
            System.out.println(String.format("Gib die %ste Zahl ein", i));
        }
        return vektor;
    }
    public void vektorAusgeben(double[] vektor){
        String ret="";
        for (int i=0;i<vektor.length;i++)
        {
            ret+=vektor[i];
            ret+=" ";
        }
        System.out.println(ret);
    }
    public void matrixProdukt(double[][] matrix1, double[][] matrix2){
        if (matrix1.length!=matrix2[0].length){
            System.out.println("Die Matrizen haben keine Kompatible größe");
            double[][]
        }

    }

}
