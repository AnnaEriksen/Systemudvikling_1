package KontoSystem;

public class KontoApp {
    public static void main(String[] args) {
        Konto konto1 = new Konto("Opsparing", 1234);
        konto1.indsætBeløb(200);
        // saldo = 200
        konto1.printKonto();
        konto1.hævBeløb(100);
        System.out.println("=========================================");
        //saldo = 100
        konto1.printKonto();
        System.out.println("=========================================");
        //prøver at lukke, uden saldo = 0
        konto1.lukKonto();
        System.out.println("========================================");
        // tester at status stadig er åben
        konto1.printKonto();
        System.out.println("=============================");
        konto1.setKontoType("Børneopsparing");
        konto1.printKonto();
        System.out.println("===========================================");
        // sæt saldo til 0
        konto1.setSaldo(0);
        //prøver at lukke konto
        konto1.lukKonto();
        // tester at status er lukket
        konto1.printKonto();
    }

}
