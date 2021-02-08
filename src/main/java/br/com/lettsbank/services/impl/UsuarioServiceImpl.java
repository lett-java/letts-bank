package br.com.lettsbank.services.impl;

import java.util.List;

import br.com.lettsbank.domain.Usuario;
import br.com.lettsbank.domain.dto.UsuarioDTO;

public interface UsuarioServiceImpl {
	
	Usuario salvar(UsuarioDTO usuarioDTO);
	UsuarioDTO buscarPorId(Long idUsuario);
	List<UsuarioDTO> listarTodosOsUsuarios();
	

}
