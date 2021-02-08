package br.com.lettsbank.enums;

import lombok.Getter;

@Getter
public enum ContaEnum {
	
	CONTA_CORRENTE(1L, "Conta Corrente"),
	CONTA_POUPANCA(2L, "Conta Poupança");
	
	private Long id;
	private String descricao;

	ContaEnum(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
}
