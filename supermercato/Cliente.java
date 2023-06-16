package supermercato;

public class Cliente {
    private String nomeCognome;

    private String codiceFiscale;
    private boolean fidelityCard; //nel caso la si possiede si applica uno sconto come da interfaccia
    public Cliente(String nomeCognome,  String codiceFiscale) {
        this.nomeCognome = nomeCognome;
        this.codiceFiscale = codiceFiscale;
        this.fidelityCard = true;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public void setNomeCognome(String nomeCognome) {
        this.nomeCognome = nomeCognome;
    }



    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public boolean isFidelityCard() {
        return fidelityCard;
    }

    public void setFidelityCard(boolean fidelityCard) {
        this.fidelityCard = fidelityCard;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente[");
        sb.append("Nome e cognome: " + nomeCognome);
        sb.append("Codice fiscale: " + codiceFiscale);
        return sb.toString();
    }
}
