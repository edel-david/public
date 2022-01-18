import java.lang.Math;

public class Geldanlage {
    int t0;
    int tend;
    double B;
    double z;
    public Geldanlage(int t0, int tend, double B, double z){
        this.t0=t0;
        this.tend=tend;
        this.B=B;
        this.z=z;

    }

    double auszahlung(int jahr){
        if(jahr==t0){
            return (B*-1);
        }
        else if(jahr==tend){
            return Math.pow((1+z),tend-t0)*B;
        }
        return 0;
    }
}
