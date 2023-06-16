package supermercato;

public class Prodotto {
    enum Categoria {FRUTTA_E_VERDURA, SURGELATI, GENERI_ALIMENTARI, DETERSIVI, MACELLERIA}

    private Categoria genereAlimentare;

    private int codiceProdotto;
    private String nomeProdotto;
    private double prezzo;
    private int quantita ;


    public Prodotto(Categoria genereAlimentare, int codiceProdotto, String nomeProdotto, double prezzo, int quantita) {
        this.genereAlimentare = genereAlimentare;
        this.codiceProdotto = codiceProdotto;
        this.nomeProdotto = nomeProdotto;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public Categoria getGenereAlimentare() {
        return genereAlimentare;
    }

    public void setGenereAlimentare(Categoria genereAlimentare) {
        this.genereAlimentare = genereAlimentare;
    }

    public int getCodiceProdotto() {
        return codiceProdotto;
    }

    public void setCodiceProdotto(int codiceProdotto) {
        this.codiceProdotto = codiceProdotto;
    }

    public String getNomeProdotto() {
        return nomeProdotto;
    }

    public void setNomeProdotto(String nomeProdotto) {
        this.nomeProdotto = nomeProdotto;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Prodotto[");
        sb.append("Genere: "+genereAlimentare);
        sb.append(" Nome: "+nomeProdotto);
        sb.append("Prezzo: "+prezzo);
        return sb.toString();
    }
}
