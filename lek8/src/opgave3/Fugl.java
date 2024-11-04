package opgave3;

public class Fugl extends Dyr {
    private String ægStørrelse;
    private double vingeFang;

    public Fugl(String habitat, int levealder, boolean rovdyr, String ægStørrelse, double vingeFang) {
        super(habitat, levealder, rovdyr);
        this.ægStørrelse = ægStørrelse;
        this.vingeFang = vingeFang;
    }

    public String getÆgStørrelse() {
        return ægStørrelse;
    }

    public void setÆgStørrelse(String ægStørrelse) {
        this.ægStørrelse = ægStørrelse;
    }

    public double getVingeFang() {
        return vingeFang;
    }

    public void setVingeFang(double vingeFang) {
        this.vingeFang = vingeFang;
    }

    public void udskrivDyr(){
        super.udskrivDyr();
        System.out.println("Dyret er en fugl!");
        System.out.println("Fuglens æg er: " + getÆgStørrelse());
        System.out.println("Fuglens vingefang er: " + getVingeFang());


    }
}
