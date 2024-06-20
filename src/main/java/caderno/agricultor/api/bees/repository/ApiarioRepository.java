package caderno.agricultor.api.bees.repository;

import caderno.agricultor.api.bees.entities.ApiarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ApiarioRepository extends JpaRepository<ApiarioEntity, UUID> {

    boolean existsByRuaAndNumeroAndBairroAndCidadeAndUfAndPais(String rua, String numero, String bairro, String cidade, String uf, String pais);
}
