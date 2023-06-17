package supermercato;

public class CodiceFiscaleValidator extends ClienteValidator {
    private final String regex = "^[a-zA-Z0-9\\s]+$";

    @Override
    public boolean validate(Cliente cliente) {
        return cliente.getNome().matches(regex);
    }
}
