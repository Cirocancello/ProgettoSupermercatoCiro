package supermercato;

public class Prodotto {
    enum Categoria {FRUTTA_E_VERDURA, SURGELATI, GENERI_ALIMENTARI, DETERSIVI, MACELLERIA}

    private Categoria tipoProdotto;

    private String codiceProdotto;
    private String nomeProdotto;
    private double prezzo;
    private int quantita;


    public Prodotto(Categoria tipoProdotto, String codiceProdotto, String nomeProdotto, double prezzo, int quantita) {
        this.tipoProdotto = tipoProdotto;
        this.codiceProdotto = codiceProdotto;
        this.nomeProdotto = nomeProdotto;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public Categoria getTipoProdotto() {
        return tipoProdotto;
    }

    public void setTipoProdotto(Categoria tipoProdotto) {
        this.tipoProdotto = tipoProdotto;
    }

    public String getCodiceProdotto() {
        return codiceProdotto;
    }

    public void setCodiceProdotto(String codiceProdotto) {
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
        sb.append("Genere : " + tipoProdotto + ", ");
        sb.append("prodotto : " + nomeProdotto + ", ");
        sb.append("Prezzo : " + prezzo + ", ");
       sb.append("Quantità in magazzino : " + quantita);
        return sb.toString();
    }
}
