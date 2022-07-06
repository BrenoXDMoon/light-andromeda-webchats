package br.com.lightandromeda.LightAndromeda.inbound.controller;

import br.com.lightandromeda.LightAndromeda.inbound.facade.UsuarioFacade;
import br.com.lightandromeda.LightAndromeda.inbound.facade.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioFacade facade;

    @Autowired
    public UsuarioController(UsuarioFacade facade) {
        this.facade = facade;
    }

    public ResponseEntity<UsuarioDTO> cadastrarUsuario(UsuarioDTO usuario) {
        return ResponseEntity.status(HttpStatus.OK).body(facade.cadastrarUsuario(usuario));
    }

}
