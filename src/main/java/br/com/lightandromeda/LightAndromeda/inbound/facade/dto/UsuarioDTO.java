package br.com.lightandromeda.LightAndromeda.inbound.facade.dto;

import lombok.Data;

@Data
public class UsuarioDTO {

    private String email;

    private String nomeUsuario;

    private String senha;

    private String confirmaSenha;

    private PessoaDTO pessoa;

}
