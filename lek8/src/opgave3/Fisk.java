package opgave3;

public class Fisk extends Dyr{
    private boolean saltvand;
    private double dybte;

    public Fisk(String habitat, int levealder, boolean rovdyr, boolean saltvand, double dybte) {
        super(habitat, levealder, rovdyr);
        this.saltvand = saltvand;
        this.dybte = dybte;
    }

    public boolean isSaltvand() {
        return saltvand;
    }

    public void setSaltvand(boolean saltvand) {
        this.saltvand = saltvand;
    }

    public double getDybte() {
        return dybte;
    }

    public void setDybte(double dybte) {
        this.dybte = dybte;
    }

    public void udskrivDyr(){
        super.udskrivDyr();
        System.out.println("Dyret er en fisk!");
        System.out.println("Fisken lever i saltvand: " + isSaltvand());
        System.out.println("Fisken lever i en dybte: " + getDybte());
    }
}
