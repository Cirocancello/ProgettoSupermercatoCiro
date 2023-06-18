package supermercato;

import java.util.Map;

public class MainDiProva {
    static Supermercato conad = new Supermercato();

    public static void main(String[] args) throws Exception {

        Prodotto prod1 = new Prodotto(Prodotto.Categoria.FRUTTA_E_VERDURA, "A", "mele", 5.0, 100);
        Prodotto prod3 = new Prodotto(Prodotto.Categoria.FRUTTA_E_VERDURA, "B", "banane", 2.5, 100);
        Prodotto prod4 = new Prodotto(Prodotto.Categoria.MACELLERIA, "C", "manzo", 1.5, 100);
        Prodotto prod2 = new Prodotto(Prodotto.Categoria.MACELLERIA, "D", "pollo", 1.5, 100);

        Prodotto prod5 = new Prodotto(Prodotto.Categoria.SURGELATI, "E", "baccala", 3.5, 100);
        Prodotto prod6 = new Prodotto(Prodotto.Categoria.DETERSIVI, "F", "candegina", 1.0, 100);
        Prodotto prod7 = new Prodotto(Prodotto.Categoria.GENERI_ALIMENTARI, "G", "pasta", 1.5, 100);
        Prodotto prod8 = new Prodotto(Prodotto.Categoria.GENERI_ALIMENTARI, "H", "pane", 1.0, 100);
        Prodotto prod9 = new Prodotto(Prodotto.Categoria.GENERI_ALIMENTARI, "I", "latte", 1.5, 100);

        Cliente cliente1 = new Cliente("Manuel", "Galati" ,"mnm123",true);
        Cliente cliente2 = new Cliente("Marco", "Marchi","mar342", true);
        Cliente cliente3 = new Cliente("Simone", "Simoni","sim123",true);
        Cliente cliente4 = new Cliente("Debora", "Dbhoram","deb123",true);
        Cliente cliente5 = new Cliente("Gianmarco", "Gianmarchi","gia123",true);
        Cliente cliente6 = new Cliente("Luca", "Galli","luc123",true);



        conad.aggiungiCliente(cliente1);
        conad.aggiungiCliente(cliente2);
        conad.aggiungiCliente(cliente3);
        conad.aggiungiCliente(cliente4);
        conad.aggiungiCliente(cliente5);
        conad.aggiungiCliente(cliente6);

        conad.fornisciMagazzino(prod1);
        conad.fornisciMagazzino(prod2);
        conad.fornisciMagazzino(prod3);
        conad.fornisciMagazzino(prod4);
        conad.fornisciMagazzino(prod5);
        conad.fornisciMagazzino(prod6);
        conad.fornisciMagazzino(prod7);
        conad.fornisciMagazzino(prod8);
        conad.fornisciMagazzino(prod9);

        for (Cliente c : conad.clienti) {
            System.out.println(c);
        }

        conad.inventario();

        Carrello carrello1 = new Carrello(conad);
        carrello1.aggiungiProdotto(prod1, 50);
        carrello1.aggiungiProdotto(prod2, 30);
        System.out.println("------------------------------");
        System.out.println("prodotto nel carrello del cliente " + cliente1);
        for (Map.Entry<Prodotto, Integer> map : carrello1.listaProdotti.entrySet()) {
            System.out.println(map);
        }

        double totaleDaPagare = conad.vaiAllaCassa(carrello1,cliente1);
        System.out.println("IL cliente " + cliente1 + " deve pagare " + totaleDaPagare);

//        Cliente clienteNonFedele = new Cliente("Giovanni","Cancello","cnc123", false);
//        Carrello carrello2 = new Carrello(conad);
//        carrello2.aggiungiProdotto(prod1, 5);
//        carrello2.aggiungiProdotto(prod2, 5);
//        System.out.println("prodotto nel carrello del cliente "+ clienteNonFedele);
//        for (Map.Entry<Prodotto, Integer> map : carrello2.listaProdotti.entrySet()) {
//            System.out.println(map);
//        }
//
//        double totaleDaPagare1 = conad.vaiAllaCassa(carrello2,clienteNonFedele);
//        System.out.println("IL cliente " + clienteNonFedele + " deve pagare " + totaleDaPagare1);

        ritiroPremio(cliente1);
    }
    private static void ritiroPremio(Cliente clienteScelto) {
        if(clienteScelto.getPuntiFedelityCard() >= 50) {
            clienteScelto.setPuntiFedelityCard(clienteScelto.getPuntiFedelityCard() - 50);
            System.out.println("grazie per la tua fedeltà .....Ritira il premio alla cassa!!!!");
        }
        else System.out.println("Punti carta insufficienti");
        System.out.println("punti carta attuali " + clienteScelto.getPuntiFedelityCard());
    }


}

