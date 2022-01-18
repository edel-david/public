import java.util.*;

public class Steuererklaerung {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib das Bruttoeinkommen in Talern ein:");
        double brutto=sc.nextDouble();
        
        double steuer;
        double netto;


        if(brutto<=100.0){
            steuer=0;
            netto=brutto;

        }
        else if(brutto<=500){
            steuer=((brutto-100.0)*brutto)/1000.0;
            netto=brutto-steuer;
            
        }
        else{
            steuer=(brutto-100.0)*0.5;
            netto=brutto-steuer;

        }
        System.out.println("Das Nettoeinkommen Beträgt: "+ Double.toString(netto) );
        System.out.println("Die Steuer beträgt: "+ Double.toString(steuer) );



    }
}