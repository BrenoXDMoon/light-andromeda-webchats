package br.com.lightandromeda.LightAndromeda.core.domain.entity;

import lombok.Data;

import javax.persistence.Transient;

@Data
public class Usuario extends DomainEntity {

    private String email;

    private String nomeUsuario;

    private String senha;

    @Transient
    private String confirmaSenha;

    private Pessoa pessoa;

}
