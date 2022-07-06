package br.com.lightandromeda.LightAndromeda.core.domain.repository;

import br.com.lightandromeda.LightAndromeda.core.domain.entity.Usuario;

import java.util.Optional;

public interface UsuarioRepository {

    Usuario saveAndFlush(Usuario usuario);

    Optional<Usuario> findById(Long id);

    void delete(Usuario usuario);

}
