package supermercato;

public class NomeProdottoValidator extends ProdottoValidator{
    private final String regex = "^[a-zA-Z\\s]+$";
    @Override
    public boolean validate(Prodotto prodotto) {
        return prodotto.getNomeProdotto().matches(regex);
    }
}
