package supermercato;

public class Cliente {
    private Carrello carrello;
    private String nome;
    private String cognome;

    private String codiceFiscale;
    private boolean fedelityCard; //nel caso la si possiede si applica uno sconto come da interfaccia
    private int puntiFedelityCard;

    public Cliente(String nome, String cognome, String codiceFiscale, boolean fedelityCard) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.fedelityCard = fedelityCard;
        this.puntiFedelityCard = 0; // creo un cliente la cui carta inizialmente ha 0 punti

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

    public boolean isFedelityCard() {
        return fedelityCard;
    }

    public void setFedelityCard(boolean fedelityCard) {
        this.fedelityCard = fedelityCard;
    }

    public int getPuntiFedelityCard() {
        return puntiFedelityCard;
    }

    public void setPuntiFedelityCard(int puntiFidelityCard) {
        this.puntiFedelityCard = puntiFidelityCard;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome : " + nome + ", ");
        sb.append("Cognome :" + cognome + ", ");
        sb.append("Codice fiscale: " + codiceFiscale + ", ");
        sb.append("Punti carta " + puntiFedelityCard+ ", ");
        sb.append("Fidelity Card " + fedelityCard);
        return sb.toString();
    }
}
