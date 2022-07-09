package br.com.lightandromeda.LightAndromeda.inbound.facade.mapper;


import br.com.lightandromeda.LightAndromeda.core.domain.entity.Usuario;
import br.com.lightandromeda.LightAndromeda.inbound.facade.dto.UsuarioDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {PessoaMapper.class})
public interface UsuarioMapper {

    UsuarioDTO toDTO(Usuario usuario);

    Usuario toUsuario(UsuarioDTO usuario);

}
