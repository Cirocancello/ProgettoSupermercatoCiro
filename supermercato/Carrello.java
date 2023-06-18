package supermercato;

import java.util.HashMap;
import java.util.Map;

public class Carrello {
    private  Supermercato supermercato;
    Map<Prodotto, Integer> listaProdotti = new HashMap<>(); // prodotti distinti nel carrello (prodotto e quantità)


    public Carrello(Supermercato supermercato) {// creo il carrello vuoto e lo associo al supermercato
        this.supermercato = supermercato;
    }


    public void aggiungiProdotto(Prodotto prodotto, int quantita) throws Exception {
        //aggiungo il prodotto al carrello
        if(quantita < prodotto.getQuantita()){
            listaProdotti.put(prodotto, quantita);
            //decrfemento la quantita in magazzino
            supermercato.prodottiMagazzino.get(supermercato.prodottiMagazzino.indexOf(prodotto)).setQuantita(prodotto.getQuantita()-quantita);

        }
        else throw new Exception("quantità prodotto maggiore di quella in magazzino");

    }



    public double costoSpesa(){
        double conto = 0;

        for (Map.Entry<Prodotto, Integer> map: listaProdotti.entrySet()) {
            conto += map.getKey().getPrezzo() * map.getValue();        }

        return  conto;
    }
}
