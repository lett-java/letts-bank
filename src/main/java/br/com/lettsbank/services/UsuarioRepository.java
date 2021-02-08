package br.com.lettsbank.services;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lettsbank.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
