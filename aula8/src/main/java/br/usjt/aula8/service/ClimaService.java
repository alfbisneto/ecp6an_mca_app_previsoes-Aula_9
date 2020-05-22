package br.usjt.aula8.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.aula8.model.Clima;
import br.usjt.aula8.repository.ClimaRepository;

@Service
public class ClimaService {
	@Autowired
	private ClimaRepository ClimaRep;
	
	public void salvar(Clima clima) {
		ClimaRep.save(clima);
	}
	
	public List<Clima> listarTodos(){
		List<Clima> climas =  ClimaRep.findAll();
		return climas;
	}

}