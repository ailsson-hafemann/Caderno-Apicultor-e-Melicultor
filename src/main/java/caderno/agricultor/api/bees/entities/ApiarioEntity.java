package caderno.agricultor.api.bees.entities;

import caderno.agricultor.api.bees.dtos.ApiarioDTOInput;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "apiario")
@Table(name = "apiario")
@EqualsAndHashCode(of = "id")
public class ApiarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    @Column(name = "quantidade_colmeias")
    private int quantidadeColmeias;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String pais;


    public ApiarioEntity(ApiarioDTOInput apiarioDTOInput){
        this.nome = apiarioDTOInput.nome();
        this.rua = apiarioDTOInput.rua();
        this.numero = apiarioDTOInput.numero();
        this.bairro = apiarioDTOInput.bairro();
        this.cidade = apiarioDTOInput.cidade();
        this.uf = apiarioDTOInput.uf();
        this.pais = apiarioDTOInput.pais();
        this.quantidadeColmeias = 0;
    }
}
