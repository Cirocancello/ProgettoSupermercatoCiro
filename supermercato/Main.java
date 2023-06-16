package supermercato;

public class Main {

    public static void main(String[] args) {

        Prodotto prod1 = new Prodotto(Prodotto.Categoria.FRUTTA_E_VERDURA,1,"mele",1.5,10);
        Prodotto prod3 = new Prodotto(Prodotto.Categoria.FRUTTA_E_VERDURA,2,"banane",2.5,10);
        Prodotto prod4 = new Prodotto(Prodotto.Categoria.MACELLERIA,3,"manzo",1.5,30);
        Prodotto prod2 = new Prodotto(Prodotto.Categoria.MACELLERIA,9,"pollo",1.5,20);

        Prodotto prod5 = new Prodotto(Prodotto.Categoria.SURGELATI,4,"baccala'",3.5,40);
        Prodotto prod6 = new Prodotto(Prodotto.Categoria.DETERSIVI,5,"candegina",1.0,10);
        Prodotto prod7 = new Prodotto(Prodotto.Categoria.GENERI_ALIMENTARI,6,"pasta",1.5,20);
        Prodotto prod8 = new Prodotto(Prodotto.Categoria.GENERI_ALIMENTARI,7,"pane",1.0,20);
        Prodotto prod9 = new Prodotto(Prodotto.Categoria.GENERI_ALIMENTARI,8,"latte",1.5,20);

        Cliente cliente1 = new Cliente("Manuel", "mnm123");
        Cliente cliente2 = new Cliente("Marco", "mar342");
        Cliente cliente3 = new Cliente("Simone", "sim123");
        Cliente cliente4 = new Cliente("Debora", "deb123");
        Cliente cliente5 = new Cliente("Gianmarco", "gia123");
        Cliente cliente6 = new Cliente("Luca", "luc123");

        Supermercato conad = new Supermercato();

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

        


    }
}
