package br.com.project.toolsmanager.colaborador.repository;

import br.com.project.toolsmanager.colaborador.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
