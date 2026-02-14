package br.com.project.toolsmanager.colaborador.repository;

import br.com.project.toolsmanager.colaborador.model.Profissao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoColaboradorRepository extends JpaRepository<Profissao, Integer> {
}
