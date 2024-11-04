package opgave2;

public class KontoApp {
    public static void main(String[] args) {
        kontotype kt1 = new kontotype("Ungekonto", "Konto for unge mennesker", "Der må ikke hæves");
        Konto konto1 = new Konto(kt1, 1234);
        konto1.opretTransaktion(200);
        // saldo = 200
        konto1.printKonto("Børneopsparing");
        konto1.hævBeløb(100);
        System.out.println("=========================================");
        //saldo = 100
        konto1.printKonto("Børneopsparing");
        System.out.println("=========================================");
        //prøver at lukke, uden saldo = 0
        konto1.lukKonto();
        System.out.println("========================================");
        // tester at status stadig er åben
        konto1.printKonto("Børneopsparing");
        System.out.println("=============================");
        konto1.printKonto("Børneopsparing");
        konto1.printKonto("Børneopsparing");
        System.out.println("===========================================");
        // sæt saldo til 0
        konto1.setSaldo(0);
        //prøver at lukke konto
        konto1.lukKonto();
        // tester at status er lukket
        konto1.printKonto("Børneopsparing");
    }

}
