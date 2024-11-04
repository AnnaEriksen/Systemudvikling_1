package opgave2;

public class kontotype {
    private String navn;
    private String beskrivelse;
    private String betingelser;

    public kontotype(String navn, String beskrivelse, String betingelser) {
        this.navn = navn;
        this.beskrivelse = beskrivelse;
        this.betingelser = betingelser;
    }

    public String getNavn() {
        return navn;
    }


    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public String getBetingelser() {
        return betingelser;
    }

}
