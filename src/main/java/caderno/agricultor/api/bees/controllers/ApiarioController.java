package caderno.agricultor.api.bees.controllers;

import caderno.agricultor.api.bees.dtos.ApiarioDTOOutput;
import caderno.agricultor.api.bees.dtos.ApiarioDTOInput;
import caderno.agricultor.api.bees.services.ApiarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apiario")
public class ApiarioController {

    @Autowired
    private ApiarioService services;

    @PostMapping
    public ResponseEntity<ApiarioDTOOutput> adicionarApiario(@RequestBody @Valid ApiarioDTOInput dados){
        var retornoApiario = services.criarApiario(dados);
        return ResponseEntity.ok(retornoApiario);

    }
}
