package br.com.lightandromeda.LightAndromeda.inbound.facade;

import br.com.lightandromeda.LightAndromeda.inbound.facade.dto.UsuarioDTO;

public interface UsuarioFacade {

    public UsuarioDTO cadastrarUsuario(UsuarioDTO usuario);
    public void deletarUsuario(Long id);
    public UsuarioDTO atualizarUsuario(UsuarioDTO usuario);
    public UsuarioDTO buscarUsuarioPorId(Long id);

}
