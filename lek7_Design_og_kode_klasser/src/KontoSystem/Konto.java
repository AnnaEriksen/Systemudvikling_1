package KontoSystem;

public class Konto {
    private int nr;
    private int saldo;
    private String kontoType;
    private String status;

    public Konto(String kontoType, int nr){
        this.nr = nr;
        this.kontoType = kontoType;
        saldo = 0;
        status = "Åben";

    }

    public void indsætBeløb (int beløb){
        if(status.equals("Åben")) {
            saldo += beløb;
        }
    }

    public void hævBeløb(int beløb){
        if(status.equals("Åben")) {
            saldo -= beløb;
        }
    }

    public void setKontoType(String kontotype){
        this.kontoType = kontotype;
    }

    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public void lukKonto(){
        if (saldo == 0) {
            status = "Lukket";
        }
        else {
            System.out.println("Du kan ikke lukke en konto, hvor Saldo ikke er 0");
        }
    }

    public void printKonto(){
        System.out.println("konto nr " + nr);
        System.out.println("konto Type " + kontoType);
        System.out.println("Saldo " + saldo);
        System.out.println("status " + status);
    }

}
