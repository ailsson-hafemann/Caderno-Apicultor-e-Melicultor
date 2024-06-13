package caderno.agricultor.api.bees.controller;

import caderno.agricultor.api.bees.Apiario.dtos.ApiarioDTOOutput;
import caderno.agricultor.api.bees.Apiario.dtos.ApiarioDTOInput;
import caderno.agricultor.api.bees.Apiario.service.ApiarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apiario")
public class ApiarioController {

    @Autowired
    private ApiarioService services;

    @PostMapping
    public ResponseEntity<ApiarioDTOOutput> adicionarApiario(@RequestBody ApiarioDTOInput dados){
        var retornoApiario = services.criarApiario(dados);
        return ResponseEntity.ok(retornoApiario);

    }
}
