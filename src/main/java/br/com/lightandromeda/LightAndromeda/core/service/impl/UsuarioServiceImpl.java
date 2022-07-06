package br.com.lightandromeda.LightAndromeda.core.service.impl;

import br.com.lightandromeda.LightAndromeda.core.domain.entity.Usuario;
import br.com.lightandromeda.LightAndromeda.core.domain.repository.UsuarioRepository;
import br.com.lightandromeda.LightAndromeda.core.service.UsuarioService;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        return usuarioRepository.saveAndFlush(usuario);
    }

    @Override
    public void deletarUsuario(Long id) {
        usuarioRepository.delete(buscarUsuarioPorId(id));
    }

    @Override
    public Usuario atualizarUsuario(Usuario usuario) {
        return usuarioRepository.saveAndFlush(usuario);
    }

    @Override
    public Usuario buscarUsuarioPorId(Long id) {
        //TODO: Lançar exceção caso não encontre o usuário
        return usuarioRepository.findById(id).orElseThrow();
    }
}
