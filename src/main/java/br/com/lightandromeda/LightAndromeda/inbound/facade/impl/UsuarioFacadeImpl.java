package br.com.lightandromeda.LightAndromeda.inbound.facade.impl;

import br.com.lightandromeda.LightAndromeda.inbound.facade.UsuarioFacade;
import br.com.lightandromeda.LightAndromeda.inbound.facade.dto.UsuarioDTO;
import org.springframework.stereotype.Component;

@Component
public class UsuarioFacadeImpl implements UsuarioFacade {



    @Override
    public UsuarioDTO cadastrarUsuario(UsuarioDTO usuario) {
        return null;
    }

    @Override
    public void deletarUsuario(Long id) {

    }

    @Override
    public UsuarioDTO atualizarUsuario(UsuarioDTO usuario) {
        return null;
    }

    @Override
    public UsuarioDTO buscarUsuarioPorId(Long id) {
        return null;
    }
}
