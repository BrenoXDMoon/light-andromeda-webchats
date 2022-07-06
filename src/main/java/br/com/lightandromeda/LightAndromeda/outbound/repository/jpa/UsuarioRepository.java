package br.com.lightandromeda.LightAndromeda.outbound.repository.jpa;

import br.com.lightandromeda.LightAndromeda.core.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>, br.com.lightandromeda.LightAndromeda.core.domain.repository.UsuarioRepository {

    Usuario saveAndFlush(Usuario usuario);

    Optional<Usuario> findById(Long id);

    void delete(Usuario usuario);

}
