package br.usjt.aula8.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.aula8.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
	public Usuario findOneByLoginAndSenha(String login, String senha);
}
