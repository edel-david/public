import java.util.*;

/**
 * Binom
 */
public class Binom {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib n ein:");
        long n=sc.nextLong();
        System.out.println("Gib k ein:");
        long k=sc.nextLong();      
        long fak_k=1;
        long countprod=1;

        for(long i=n,j=1;j<=k;i--,j++){
            countprod*=i;
            fak_k*=j;
        }
        
        long noverk=countprod/fak_k;
        System.out.println("Der binomialkoeffizient ist;");
        System.out.println(noverk);

    }
    
}
