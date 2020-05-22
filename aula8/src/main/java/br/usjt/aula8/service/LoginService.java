package br.usjt.aula8.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.aula8.model.Usuario;
import br.usjt.aula8.repository.UsuarioRepository;

@Service
public class LoginService {
	@Autowired
	private UsuarioRepository usuarioRepo;
	
	public boolean logar(Usuario usuario) {
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(),
				usuario.getSenha()) != null;
	}
}
