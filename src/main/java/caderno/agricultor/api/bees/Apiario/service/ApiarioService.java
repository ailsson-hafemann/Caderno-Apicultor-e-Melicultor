package caderno.agricultor.api.bees.Apiario.service;

import caderno.agricultor.api.bees.Apiario.dtos.ApiarioDTOInput;
import caderno.agricultor.api.bees.Apiario.dtos.ApiarioDTOOutput;
import caderno.agricultor.api.bees.Apiario.Entity.ApiarioEntity;
import caderno.agricultor.api.bees.Apiario.repository.ApiarioRepository;
import caderno.agricultor.api.bees.Apiario.validator.ValidadorApiario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class ApiarioService {

    @Autowired
    private ApiarioRepository repository;

    @Autowired
    private List<ValidadorApiario> validadores;

    @Transactional
    public ApiarioDTOOutput criarApiario(ApiarioDTOInput dadosApiario){
        validadores.forEach(validador -> validador.validar(dadosApiario));

        var apiario = new ApiarioEntity(dadosApiario);
        repository.save(apiario);

        return new ApiarioDTOOutput(apiario.getId().toString(), apiario.getNome(), apiario.getRua(), apiario.getNumero(), apiario.getBairro(), apiario.getCidade(), apiario.getUf(), apiario.getPais());
    }
}
