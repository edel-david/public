/**
 * Statistik
 */
import java.util.*;
public class Statistik {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        System.out.println("Wie viele Zahlen willst du eingeben?");
        int n=sc.nextInt();
        double[] feld=einlesen(n);
        double mini=min(feld);
        double maxi=max(feld);
        double mwert=mittelwert(feld);
        double streu=streuung(feld, mwert);
        System.out.println("Das minimum ist: "+mini);
        System.out.println("Das maximum ist: "+maxi);
        System.out.println("Der Mittelwert ist: "+mwert);
        System.out.println("Die Streuung ist: "+streu);

    }
    public static double[] einlesen(int n){
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        double[] feld=new double[n];
        for(int i=0;i<n;i++){
            System.out.println("Gib die nächste Zahl ein"); 
            feld[i]=sc.nextDouble();
        }
        return feld;
    }
    public static double min(double[] feld){
        double minimum=feld[0];
        for(int i=1;i<feld.length;i++){
            if (feld[i]<minimum){
                minimum=feld[i];
            }
        }
        return minimum;
    }
    public static double max(double[] feld){
        double maximum=feld[0];
        for(int i=1;i<feld.length;i++){
            if (feld[i]>maximum){
                maximum=feld[i];
            }
        }
        return maximum;
    }
    public static double mittelwert(double[] feld){
        double mittelwert=0;
        for(int i=0;i<feld.length;i++){
            mittelwert+=feld[i]/feld.length;
        }
        return mittelwert;
    }
    public static double streuung(double[] feld,double mwert){
        double streuungq = 0;
        for(int i=0;i<feld.length;i++){
            
            streuungq+=Math.pow(feld[i]-mwert,2.0)/(feld.length-1);
            System.out.println("add ist: "+streuungq);
        }

        return Math.sqrt(streuungq);
    }

}