package supermercato;

import java.util.LinkedList;
import java.util.List;

public class Supermercato implements Promozioni{
  List<Carrello> carrelli = new LinkedList<>();
  List<Cliente> clienti = new LinkedList<>();
  List<Prodotto> prodottiMagazzino = new LinkedList<>();

  public Supermercato(){

  }

  public void aggiungiCliente(Cliente cliente){
    clienti.add(cliente);

  }

  public void fornisciMagazzino(Prodotto prodotto){
    prodottiMagazzino.add(prodotto);
  }

  public double vaiALlaCassa(Carrello carrello, Cliente cliente){
    double conto = carrello.costoSpesa();

    if(clienti.contains(cliente)){
      //applica la promozione
      prezzoScontato(carrello.listaProdotti.size(),conto);
    }else{
      prezzoDaPagare(carrello.listaProdotti.size(),conto);
    }

    return conto;
  }

  private double prezzoDaPagare(int quantita, double conto) {
    double quantitaprodotti = quantita * conto;

    return conto;
  }

  @Override
  public double prezzoScontato(int quantita, double conto) {
    double quantitaprodotti = quantita * conto;
    double prezzoScontato = (quantitaprodotti * 10)/100; //applico lo sconto del 10%
    return prezzoScontato;
  }

  public void aggiungiMagazzino(Prodotto prodotto){
    prodottiMagazzino.add(prodotto);
  }



}




