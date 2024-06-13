package caderno.agricultor.api.bees.Apiario.validator;

import caderno.agricultor.api.bees.Apiario.dtos.ApiarioDTOInput;
import caderno.agricultor.api.bees.Apiario.repository.ApiarioRepository;
import caderno.agricultor.api.bees.infra.exception.ValidadorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorApiarioDuplicado implements ValidadorApiario{

    @Autowired
    ApiarioRepository apiarioRepository;

    @Override
    public void validar(ApiarioDTOInput dados) {

        var apiarioExistente = apiarioRepository.existsByRuaAndNumeroAndBairroAndCidadeAndUfAndPais(dados.rua(),
                                            dados.numero(), dados.bairro(), dados.cidade(), dados.uf(), dados.pais());
        if (apiarioExistente){
            throw new ValidadorException("Já existe um apiário no endereço informado");
        }
    }
}
