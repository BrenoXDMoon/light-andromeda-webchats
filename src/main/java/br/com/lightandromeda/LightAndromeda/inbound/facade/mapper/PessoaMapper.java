package br.com.lightandromeda.LightAndromeda.inbound.facade.mapper;

import br.com.lightandromeda.LightAndromeda.core.domain.entity.Pessoa;
import br.com.lightandromeda.LightAndromeda.inbound.facade.dto.PessoaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaMapper {

    PessoaDTO toDTO(Pessoa pessoa);

    Pessoa toPessoa(PessoaDTO pessoa);

}
