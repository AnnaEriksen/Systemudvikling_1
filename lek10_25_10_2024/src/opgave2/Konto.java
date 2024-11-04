package opgave2;

import java.util.ArrayList;

public class Konto {
    private int nr;
    private String status;
    private kontotype kontotype;
    private ArrayList<Transaktion> transaktioner;

    public Konto(kontotype kontoType, int nr){
        this.nr = nr;
        this.kontotype = kontoType;
        status = "Åben";
        transaktioner = new ArrayList<Transaktion>();

    }

    public void opretTransaktion(int beløb){
        if(status.equals("Åben")) {
            Transaktion transaktion = new Transaktion(beløb);
            transaktioner.add(transaktion);
        }
    }

    public void hævBeløb(int beløb){
        if(status.equals("Åben")) {
        }
    }


    //Koden beregner den samlede saldo ved at gå gennem en liste af transaktioner og lægge hvert beløb til den samlede sum.
    public int beregnSaldo(){
        int sum = 0;
        for(Transaktion transaktion: transaktioner){
            sum += transaktion.getBeløb();
        }
        return sum;
    }

    public void lukKonto(){
        status = "Lukket";
    }

    public void printKonto(String børneopsparing){
        System.out.println("konto nr " + nr);
        System.out.println("konto Type " + kontotype.getNavn());
        System.out.println("Saldo " + beregnSaldo());
        System.out.println("status " + status);
    }


    public void setSaldo(int i) {
    }
}


