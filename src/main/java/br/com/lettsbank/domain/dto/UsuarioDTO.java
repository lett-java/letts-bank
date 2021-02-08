package br.com.lettsbank.domain.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UsuarioDTO {

	@NotBlank
	private String nome;

	@NotNull
	private Date dataNascimento;

	@NotNull
	private Integer idade;

	public UsuarioDTO(String nome, Date dataNascimento, Integer idade) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.idade = idade;

	}
}
