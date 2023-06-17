package supermercato;

public class Cliente {
    private String nome;
    private String cognome;

    private String codiceFiscale;
    private boolean fidelityCard; //nel caso la si possiede si applica uno sconto come da interfaccia
    private int puntiFidelityCard;

    public Cliente(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.fidelityCard = true;
        this.puntiFidelityCard = 0; // creo un cliente la cui carta inizialmente ha 0 punti
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
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

    public int getPuntiFidelityCard() {
        return puntiFidelityCard;
    }

    public void setPuntiFidelityCard(int puntiFidelityCard) {
        this.puntiFidelityCard = puntiFidelityCard;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome : " + nome + "\n");
        sb.append("Cognome :" + cognome + "\n");
        sb.append("Codice fiscale: " + codiceFiscale + "\n");
        sb.append("Punti carta " + puntiFidelityCard);
        return sb.toString();
    }
}
