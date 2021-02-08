package br.com.lettsbank.enums;

import lombok.Getter;

@Getter
public enum StatusEnum {
	
	ATIVA(1L, "Ativa"),
	INATIVA(2L, "Inativa");
	
	private Long id;
	private String descricao;

	StatusEnum(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

}
