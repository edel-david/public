import java.util.*;
// import java.lang.Math.*;
public class KubischeGleichung {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib die 4 Koeffizienten ein:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double p=((3.0*a*c)-(b*b))/(9.0*a*a);
        double q=(1.0/2)*((2.0*b*b*b)/(27.0*a*a*a)-(b*c)/(3*a*a)+(d)/(a));
        double D=(q*q)+(p*p*p);
        System.out.println(p);
        System.out.println(q);
        System.out.println(D);
        if ( p >= 0 || D > 0 ) return;

        else{
            double r=Math.signum(q)*Math.sqrt(-p);
            double s=Math.acos(q/(r*r*r));

            double x1=(-2.0*r*Math.cos(s/3.0)-(b/(3*a)));
            double x2=(2.0*r*Math.cos((Math.PI-s)/3)-(b/(3*a)));
            double x3=(2.0*r*Math.cos((Math.PI+s)/3)-(b/(3*a)));;


            System.out.println(x1);
            System.out.println(x2);
            System.out.println(x3);
        }
        
    }
}
