package opgave3;

public class DyrApp {
    public static void main(String[] args) {
        Fisk fisk = new Fisk("Havet", 2, true, true, 100);
        fisk.udskrivDyr();

        Fugl stær = new Fugl("træer", 5, true, "lille", 3);
            stær.udskrivDyr();


    }
}
