
package rectangle;


public class RctglClass {
    
    double s,d,pole,obwod,przekatna;

    public RctglClass(double s, double d, double pole, double obwod, double przekatna) {
        this.s = s;
        this.d = d;
        this.pole = pole;
        this.obwod = obwod;
        this.przekatna = przekatna;
    }

    public double getS() {
        return s;
    }

    public double getD() {
        return d;
    }

    public double getPole() {
        return pole = s * d;
    }

    public double getObwod() {
        return obwod = 2*(s+d) ;
    }

    public double getPrzekatna() {
        return przekatna = Math.sqrt((s * s + d * d));
    }
     
}
