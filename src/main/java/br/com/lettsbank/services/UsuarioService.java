package br.com.lettsbank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lettsbank.domain.Usuario;
import br.com.lettsbank.domain.dto.UsuarioDTO;
import br.com.lettsbank.services.impl.UsuarioServiceImpl;

@Service
public class UsuarioService implements UsuarioServiceImpl {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario salvar(UsuarioDTO usuarioDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioDTO buscarPorId(Long idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioDTO> listarTodosOsUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

}
