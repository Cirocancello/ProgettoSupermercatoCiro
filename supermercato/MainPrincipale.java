package supermercato;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class MainPrincipale {
    static Scanner input = new Scanner(System.in);
    static  Supermercato conad = new Supermercato();

    public static void main(String[] args) {

        int scelta = 0;

        while (scelta != 7) {
            try {
                System.out.println("1) Inserisci cliente ");
                System.out.println("2) Aggiungi prodotti carrello ");
                System.out.println("3) Vai alla cassa ");
                System.out.println("4) Inventario ");
                System.out.println("5) Stampa clienti ");
                System.out.println("6) Fornisci magazzino ");
                System.out.println("7) esci");
                System.out.print("scelta ");
                scelta = input.nextInt();
                input.nextLine();

                switch (scelta) {
                    case 1: {
                        inserisciCliente();
                        break;
                    }
                    case 2: {
                        aggiungiProdottiCarrello();
                        break;
                    }
                    case 3: {
                        conad.vaiAllaCassa(carello,);
                    }
                    case 4: {
                        conad.inventario();
                        break;
                    }
                    case 5: {
                        stampaClienti();
                        break;
                    }
                    case 6: {
                        fornisciMagazzino();
                        break;
                    }
                    case 7:
                        System.out.println("Arrivederci dal vostro supermercato di fiducia CONAD !!!");
                        break;

                }

            } catch (Exception e){
                System.out.println("Ops, qualcosa e' andato storto !!!!! ANOMALIA");
                input.nextLine();
            }
        }

    }

    private static void aggiungiProdottiCarrello() throws Exception {
        Carrello carrello = new Carrello(conad);

        System.out.println("Inserici prodotti nel carrello");
        System.out.print("Inserici categoria merceologica ");
        System.out.print(Prodotto.Categoria.DETERSIVI + ", ");
        System.out.print(Prodotto.Categoria.MACELLERIA + ", ");
        System.out.print(Prodotto.Categoria.FRUTTA_E_VERDURA + ", ");
        System.out.print(Prodotto.Categoria.SURGELATI + ", ");
        System.out.print(Prodotto.Categoria.GENERI_ALIMENTARI + " ");
        Prodotto.Categoria categoria = Prodotto.Categoria.valueOf(input.next());
        System.out.println(categoria);
        input.nextLine();
        System.out.print("Inserici codice prodotto ");
        String codiceProdotto = input.nextLine();
        System.out.print("Inserici nome prodotto ");
        String nomeprodotto = input.nextLine();
        System.out.print("Inserici prezzo ");
        double prezzo = input.nextDouble();
        System.out.print("Inserici quantità ");
        int quantita =input.nextInt();
        Prodotto prodotto = new Prodotto(categoria, codiceProdotto,nomeprodotto,prezzo,quantita);
        carrello.aggiungiProdotto(prodotto, quantita);
    }

    private static void stampaClienti() {
        for (Cliente c : conad.clienti) {
            System.out.println(c);
        }
    }

    private static void inserisciCliente() {
        System.out.print("Inserisci nome cliente ");
        String nome = input.nextLine();
        System.out.print("Inserisci cognome cliente ");
        String cognome = input.nextLine();
        System.out.print("Inserisci codice fiscale cliente ");
        String codiceFiscale = input.nextLine();

        Cliente cliente = new Cliente(nome, cognome, codiceFiscale);
        conad.aggiungiCliente(cliente);
    }

    public static void fornisciMagazzino(){
        System.out.println("Inserici prodotti in magazzino");
        System.out.print("Inserici categoria merceologica ");
        System.out.print(Prodotto.Categoria.DETERSIVI + ", ");
        System.out.print(Prodotto.Categoria.MACELLERIA + ", ");
        System.out.print(Prodotto.Categoria.FRUTTA_E_VERDURA + ", ");
        System.out.print(Prodotto.Categoria.SURGELATI + ", ");
        System.out.print(Prodotto.Categoria.GENERI_ALIMENTARI + " ");
        Prodotto.Categoria categoria = Prodotto.Categoria.valueOf(input.next());
        System.out.println(categoria);
        input.nextLine();
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
