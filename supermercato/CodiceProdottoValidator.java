package supermercato;

public class CodiceProdottoValidator extends ProdottoValidator{
    private final String regex = "[a-zA-Z0-9\\s]+$";
    @Override
    public boolean validate(Prodotto prodotto) {
        return prodotto.getCodiceProdotto().matches(regex);
    }
}
