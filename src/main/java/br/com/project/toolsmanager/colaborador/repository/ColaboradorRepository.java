package br.com.project.toolsmanager.colaborador.repository;


import br.com.project.toolsmanager.colaborador.model.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Integer> {
}
