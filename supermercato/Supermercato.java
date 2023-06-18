package supermercato;

import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.floor;

public class Supermercato implements Promozioni{  ;
  List<Cliente> clienti = new LinkedList<>();//clienti in possesso della fidelitycard
  List<Prodotto> prodottiMagazzino = new LinkedList<>();


  public Supermercato(){

  }

  public void aggiungiCliente(Cliente cliente){
    NomeValidator nomeValidator = new NomeValidator();
    CodiceFiscaleValidator codiceFiscaleValidator = new CodiceFiscaleValidator();
    if(nomeValidator.validate(cliente) && codiceFiscaleValidator.validate(cliente))
          clienti.add(cliente);
    else System.out.println("I dati fornti non sono validi ");

  }

  public void fornisciMagazzino(Prodotto prodotto){
    CodiceProdottoValidator codiceProdottoValidator = new CodiceProdottoValidator();
    NomeProdottoValidator nomeProdottoValidator = new NomeProdottoValidator();
    if(nomeProdottoValidator.validate(prodotto) && codiceProdottoValidator.validate(prodotto))
        prodottiMagazzino.add(prodotto);
    else System.out.println("I dati forniti non sono validi");
  }

  public double vaiAllaCassa(Carrello carrello, Cliente cliente){
    double conto = carrello.costoSpesa();
    //applica la promozione e aggiorno i punti sulla sua carta fedeltà

    if(cliente.isFedelityCard()) {
      conto = prezzoScontato(conto);
      cliente.setPuntiFedelityCard((int) (cliente.getPuntiFedelityCard() + floor(conto/5))); //ogni 5 € di spesa gli aggiungo 1 punto

    }

    return conto; //generare lo scontrino
  }


  @Override
  public double prezzoScontato(double conto) {
    return conto - (conto * 3)/100; //applico lo sconto del 3%

  }

  public void inventario() {
    System.out.println("Inventario");
    for (Prodotto p : prodottiMagazzino) {
      System.out.println(p);
    }
  }
}



//TODO implementare anche i metodi dell' interfaccia con le varie promozioni
// ed in base al prodotto in carrello applicare gli sconti sempre per i clienti fedelitycard







