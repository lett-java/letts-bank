package br.com.lettsbank.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.lettsbank.domain.dto.UsuarioDTO;
import br.com.lettsbank.services.UsuarioService;
import br.com.lettsbank.utils.DataUtils;

public class UsuarioTest {
	
	@Autowired
	private UsuarioService usuarioService;

	@Test
	public void deveCriarUmUsuario() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		UsuarioDTO usuarioDTO = new UsuarioDTO(
				"Fabio Lettieri", 
				sdf.parse("26/08/1994"),
				DataUtils.calculaIdade(sdf.parse("26/08/1994")));
		
		

		assertEquals("Fabio Lettieri", usuarioDTO.getNome());
		assertEquals(sdf.parse("26/08/1994"), usuarioDTO.getDataNascimento());
		assertEquals(26, usuarioDTO.getIdade());
	}

}
