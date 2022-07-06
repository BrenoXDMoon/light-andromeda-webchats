package br.com.lightandromeda.LightAndromeda.core.domain.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDate;

@Data
@MappedSuperclass
public class DomainEntity {

    @Id
    private Long id;

    private Boolean ativo;

    @Temporal(TemporalType.DATE)
    private LocalDate dataCriacao;
}
