package br.com.lightandromeda.LightAndromeda.core.service;

import br.com.lightandromeda.LightAndromeda.core.domain.entity.Usuario;

public interface UsuarioService {

    //serviço de crud de usuário
    public Usuario cadastrarUsuario(Usuario usuario);
    public void deletarUsuario(Long id);
    public Usuario atualizarUsuario(Usuario usuario);
    public Usuario buscarUsuarioPorId(Long id);

}
