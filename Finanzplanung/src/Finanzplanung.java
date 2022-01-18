public class Finanzplanung {
    static void main(){
        Geldanlage[] portfolio = {new Geldanlage(2,5,100.0,0.03),new Geldanlage(4,8,200.0,0.025),new Geldanlage(6, 9, 150.0, 0.017)};
        
        for(int year=1;year<=10;year++){
            double auszahlung_pro_jahr=0;
            for(int anlage_index=0;anlage_index<portfolio.length;anlage_index++){
                auszahlung_pro_jahr+=portfolio[anlage_index].auszahlung(year);
            }
            System.out.println(auszahlung_pro_jahr);    
        }
    }
}
