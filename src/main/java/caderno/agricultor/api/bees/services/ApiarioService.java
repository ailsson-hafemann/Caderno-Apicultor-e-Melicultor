package caderno.agricultor.api.bees.services;

import caderno.agricultor.api.bees.dtos.ApiarioDTOInput;
import caderno.agricultor.api.bees.dtos.ApiarioDTOOutput;
import caderno.agricultor.api.bees.entities.ApiarioEntity;
import caderno.agricultor.api.bees.repository.ApiarioRepository;
import caderno.agricultor.api.bees.validators.ValidadorApiario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
