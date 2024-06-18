package caderno.agricultor.api.bees.Apiario.dtos;

import jakarta.validation.constraints.NotBlank;

public record ApiarioDTOInput(

        @NotBlank
        String nome,
        @NotBlank
        String rua,
        @NotBlank
        String numero,
        @NotBlank
        String cidade,
        @NotBlank
        String bairro,
        @NotBlank
        String uf,
        @NotBlank
        String pais) {
}
