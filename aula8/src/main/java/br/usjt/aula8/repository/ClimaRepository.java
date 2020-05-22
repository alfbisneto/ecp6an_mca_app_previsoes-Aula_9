package br.usjt.aula8.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.aula8.model.Clima;

public interface ClimaRepository extends JpaRepository<Clima,Long> {

}
