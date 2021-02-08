package br.com.lettsbank.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.lettsbank.enums.ContaEnum;
import br.com.lettsbank.enums.StatusEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Conta implements Serializable {
	private static final long serialVersionUID = -4279522593985036405L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;

	@Column(name = "tipo")
	private ContaEnum tipo;

	@Column(name = "agencia")
	private Integer agencia;

	@Column(name = "conta")
	private Integer conta;

	@Column(name = "usuario")
	private Usuario usuario;

	@Column(name = "data_abertura")
	private Date dataAbertura;

	@Column(name = "data_fechamento")
	private Date dataFechamento;

	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private StatusEnum status;

}
