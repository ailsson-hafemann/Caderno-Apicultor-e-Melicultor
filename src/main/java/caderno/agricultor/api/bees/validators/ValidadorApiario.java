package caderno.agricultor.api.bees.validators;

import caderno.agricultor.api.bees.dtos.ApiarioDTOInput;

public interface ValidadorApiario {

    public void validar(ApiarioDTOInput dados);
}
