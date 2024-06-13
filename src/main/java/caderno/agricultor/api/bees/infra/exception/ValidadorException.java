package caderno.agricultor.api.bees.infra.exception;

public class ValidadorException extends RuntimeException{

    public ValidadorException(String message) {
        super(message);
    }
}
