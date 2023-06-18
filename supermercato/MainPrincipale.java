package supermercato;

import java.util.Scanner;

public class MainPrincipale {
    static Scanner input = new Scanner(System.in);
    static  Supermercato conad = new Supermercato();
    static Carrello carrello = new Carrello(conad);

    public static void main(String[] args) {

        String scelta = "";
        Cliente clienteScelto = null;

        while(true) {
            System.out.println("** Benvenuto alla  CONAD **");
            System.out.println("********* M E N U *********");
            System.out.println("1) Inserisci cliente ");
            System.out.println("2) Stampa clienti ");
            System.out.println("3) Scegli cliente che deve fare la spesa ");
            System.out.println("4) Rimuovi cliente ");
            System.out.println("5) Inventario ");
            System.out.println("6) Fornisci magazzino ");
            System.out.println("altro per uscire ");
            System.out.print("scelta : ");
            scelta = input.nextLine();
            switch (scelta){
                case "1": {
                    inserisciCliente();
                    break;
                }
                case "2": {
                    stampaClienti();
                    break;
                }
                case "3":{
                    clienteScelto = scegliCliente();
                    input.nextLine();
                    break;
                }
                case "4":{
                    rimuoviClente(scegliCliente());
                    input.nextLine();
                    break;
                }
                case "5": {
                    conad.inventario();
                    break;
                }
                case "6": {
                    fornisciMagazzino();
                    input.nextLine();
                    break;
                }
                default:
                    System.out.println("Arrivederci dal vostro supermercato di fiducia CONAD !!!");
                    return;
            }

            while (clienteScelto != null) {
                try {

                    System.out.println("1) Aggiungi prodotti carrello ");
                    System.out.println("2) Vai alla cassa ");
                    System.out.println("3) Ritiro Premio");
                    System.out.println("altro per uscire");
                    System.out.print("scelta ");
                    scelta = input.nextLine();
                    //input.nextLine();

                    switch (scelta) {

                        case "1": {
                            carrello = aggiungiProdottiCarrello(carrello);
                            input.nextLine();
                            break;
                        }
                        case "2": {
                            double totaleDaPagare = conad.vaiAllaCassa(carrello, clienteScelto);
                            System.out.println("IL cliente " + clienteScelto + " deve pagare " + totaleDaPagare);
                            break;
                        }
                        case "3":{
                            ritiroPremio(clienteScelto);
                        }
                        default:{
                            clienteScelto = null;
                            break;
                        }
                    }

                } catch (Exception e) {
                    System.out.println("Ops, qualcosa e' andato storto !!!!! ANOMALIA");
                    input.nextLine();
                }
            }
        }
    }

    private static void ritiroPremio(Cliente clienteScelto) {
        if(clienteScelto.getPuntiFedelityCard() >= 50) {
            clienteScelto.setPuntiFedelityCard(clienteScelto.getPuntiFedelityCard() - 50);
            System.out.println("grazie per la tua fedeltà .....Ritira il premio alla cassa!!!!");
        }else System.out.println("Punti carta insufficienti");
        System.out.println("punti carta attuali " + clienteScelto.getPuntiFedelityCard());
    }

    private static void rimuoviClente(Cliente cliente) {
        conad.clienti.remove(cliente);
        System.out.println("Ci dispiace che "+ cliente.getNome() + " "+ cliente.getCognome()+ " ci ha lasciato");
    }

    private static Cliente scegliCliente() {
        Cliente cliente;
        int count = 1;
        System.out.println("Selezionare il cliente" );
        for(Cliente c: conad.clienti){
            System.out.println(count + ") " + c.getNome() + " " + c.getCognome()+ " " + c.getCodiceFiscale());
            count++;
        }
        return conad.clienti.get(input.nextInt() - 1);
    }

    private static Carrello aggiungiProdottiCarrello(Carrello carrello) throws Exception {

        int count = 1;
        System.out.println("Selezionare il prosotto da inserire al carrello tra i seguenti" );
        for(Prodotto p : conad.prodottiMagazzino){
            System.out.println(count + ") " + p.getNomeProdotto());
            count++;
        }
        System.out.println("scelgi");
        Prodotto prodottoScelto = conad.prodottiMagazzino.get(input.nextInt() - 1);
        System.out.println("Quanti ne vuoi aggiungere ?");
        int quantita = input.nextInt();
        carrello.aggiungiProdotto(prodottoScelto, quantita);

        return carrello;
    }

    private static void stampaClienti() {
        System.out.println("I clienti della CONAD");
        for (Cliente c : conad.clienti) {
            System.out.println(c);
            System.out.println("--------------------------");
        }
    }

    private static void inserisciCliente() {
        boolean fidelityCard = false;
        System.out.print("Inserisci nome cliente ");
        String nome = input.nextLine();
        System.out.print("Inserisci cognome cliente ");
        String cognome = input.nextLine();
        System.out.print("Inserisci codice fiscale cliente ");
        String codiceFiscale = input.nextLine();
        System.out.print("Fidelity Card 1) si / 2) no ");
        int scelta = input.nextInt();
        if(scelta == 1)
            fidelityCard = true;
        input.nextLine();
        Cliente cliente = new Cliente(nome, cognome, codiceFiscale, fidelityCard );
        conad.aggiungiCliente(cliente);
        System.out.println("Benvenuto tra i nostri clienti ");
    }

    public static void fornisciMagazzino(){
        System.out.println("Inserici prodotti in magazzino");
        System.out.println("Inserici categoria merceologica ");
        int count = 1;
        for(Prodotto.Categoria c : Prodotto.Categoria.values()){
            System.out.println(count + ") " + c);
            count++;
        }

        Prodotto.Categoria categoria = null;
        String scelta = input.nextLine();
        switch (scelta){
            case "1":{
                categoria = Prodotto.Categoria.FRUTTA_E_VERDURA;
                break;
            }
            case "2":{
                categoria = Prodotto.Categoria.SURGELATI;
                break;
            }
            case "3":{
                categoria = Prodotto.Categoria.GENERI_ALIMENTARI;
                break;
            }
            case "4":{
                categoria = Prodotto.Categoria.DETERSIVI;
                break;
            }
            case "5":{
                categoria = Prodotto.Categoria.MACELLERIA;
                break;
            }
        }
//        System.out.print(Prodotto.Categoria.DETERSIVI + ", ");
//        System.out.print(Prodotto.Categoria.MACELLERIA + ", ");
//        System.out.print(Prodotto.Categoria.FRUTTA_E_VERDURA + ", ");
//        System.out.print(Prodotto.Categoria.SURGELATI + ", ");
//        System.out.print(Prodotto.Categoria.GENERI_ALIMENTARI + " ");
//        Prodotto.Categoria categoria = Prodotto.Categoria.valueOf(input.next());
       // System.out.println(categoria);


        System.out.print("Inserici codice prodotto ");
        String codiceProdotto = input.nextLine();
        System.out.print("Inserici nome prodotto ");
        String nomeprodotto = input.nextLine();
        System.out.print("Inserici prezzo ");
        double prezzo = input.nextDouble();
        System.out.print("Inserici quantità ");
        int quantita =input.nextInt();

        Prodotto prodotto = new Prodotto(categoria, codiceProdotto,nomeprodotto,prezzo,quantita);
        conad.fornisciMagazzino(prodotto);
    }
}
