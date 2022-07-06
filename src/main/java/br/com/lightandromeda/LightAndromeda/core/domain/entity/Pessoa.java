package br.com.lightandromeda.LightAndromeda.core.domain.entity;

import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDate;

@Data
public class Pessoa extends DomainEntity {

    private String nome;

    @CPF
    private String cpf;

    private String telefone;

    @Temporal(TemporalType.DATE)
    private LocalDate dataNascimento;

}
