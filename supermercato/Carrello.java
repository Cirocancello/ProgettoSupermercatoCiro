package supermercato;

import java.util.LinkedList;
import java.util.List;

public class Carrello {
    List<Prodotto> listaProdotti = new LinkedList<>(); // prodotti distinti nel carrello

    public Carrello() {// creo il carrello vuoto

    }


    public void aggiungiProdotto(Prodotto prodotto){
        listaProdotti.add(prodotto);
        for(Prodotto p:listaProdotti){

        }
    }

    public int costoSpesa(){
        int conto = 0;
        for(Prodotto p : listaProdotti){
            conto+= p.getPrezzo();
        }

        return  conto;
    }
}
