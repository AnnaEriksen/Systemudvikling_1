package opgave3;


public class Pattedyr extends Dyr{
    private int antalLevendeUnger;

    public Pattedyr(String habitat, int levealder, boolean rovdyr, int antalLevendeUnger) {
        super(habitat, levealder, rovdyr);
        this.antalLevendeUnger = antalLevendeUnger;

    }

    public int getAntalLevendeUnger() {
        return antalLevendeUnger;
    }

    public void setAntalLevendeUnger(int antalLevendeUnger) {
        this.antalLevendeUnger = antalLevendeUnger;
    }

    public void udskrivDyr(){
        super.udskrivDyr();
        System.out.println("Dyret er et pattedyr!");
        System.out.println("Pattedyret har " + getAntalLevendeUnger() + " unger");

    }
}
