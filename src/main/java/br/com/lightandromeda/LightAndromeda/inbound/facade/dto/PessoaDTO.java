package br.com.lightandromeda.LightAndromeda.inbound.facade.dto;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDate;

public class PessoaDTO {

    private String nome;

    @CPF
    private String cpf;

    private String telefone;

    @Temporal(TemporalType.DATE)
    private LocalDate dataNascimento;

}
