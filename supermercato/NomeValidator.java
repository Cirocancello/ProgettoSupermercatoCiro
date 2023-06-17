package supermercato;

public class NomeValidator extends ClienteValidator {
    private final String regex = "^[a-zA-Z\\s]+$";

    @Override
    public boolean validate(Cliente cliente) {
        return cliente.getNome().matches(regex);
    }
}
