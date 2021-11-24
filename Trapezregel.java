import java.util.*;
public class Trapezregel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Gib a ein:");
        double a=sc.nextDouble();
        System.out.println("Gib b ein:");
        double b=sc.nextDouble();  
        int n;
        double Inew=0;
        for(n=5;n<=100;n+=5){
            double Iold=Inew;    
            Inew=Trapez(a, b, n);
            System.out.println("Index n= " + n+ "  Naeherung In = "+ Inew);
            if (Math.abs((Iold-Inew)/Inew)<0.000001){
                return;
            }
        }
    }
    
    public static double f(double x){
    if (x>-1){
        double fx=Math.exp(x)*(1.0/(Math.sqrt(1.0+Math.pow(x,3))));
            return fx;
    }
    else{
        System.out.println("Auswertung hier nicht möglich");
        System.exit(1);
    }
    return 0.0;
}
    public static double Trapez(double a, double b, int n){
        double h=(b-a)/n;
        double In=0;
        for(int i=0;i <= n;i++){
            In+=2.0*f(a+i*h);


        }
        In-=f(a);
        In-=f(a+n*h);
        In*=(h/2.0);
        return In;
    }


}
