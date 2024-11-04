package opgave3;

public class Dyr {
    private String habitat;
    private int levealder;
    private boolean rovdyr;

    public Dyr(String habitat, int levealder, boolean rovdyr) {
        this.habitat = habitat;
        this.levealder = levealder;
        this.rovdyr = rovdyr;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getLevealder() {
        return levealder;
    }

    public void setLevealder(int levealder) {
        this.levealder = levealder;
    }

    public boolean isRovdyr() {
        return rovdyr;
    }

    public void setRovdyr(boolean rovdyr) {
        this.rovdyr = rovdyr;

    }
    public void udskrivDyr(){
        System.out.println("Dyret lever i: " + getHabitat());
        System.out.println("Dyrets levealder er: " + getLevealder());
        System.out.println("Dyret er et rovdyr: " + isRovdyr());




    }
}
