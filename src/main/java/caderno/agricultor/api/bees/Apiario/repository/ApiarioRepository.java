package caderno.agricultor.api.bees.Apiario.repository;

import caderno.agricultor.api.bees.Apiario.Entity.ApiarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ApiarioRepository extends JpaRepository<ApiarioEntity, UUID> {

    boolean existsByRuaAndNumeroAndBairroAndCidadeAndUfAndPais(String rua, String numero, String bairro, String cidade, String uf, String pais);
}
