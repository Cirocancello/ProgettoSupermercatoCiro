package supermercato;

public class CognomeValidator extends ClienteValidator{
    private final String regex = "^[a-zA-Z\\s]+$";

    @Override
    public boolean validate(Cliente cliente) {
        return cliente.getCognome().matches(regex);
    }
}
