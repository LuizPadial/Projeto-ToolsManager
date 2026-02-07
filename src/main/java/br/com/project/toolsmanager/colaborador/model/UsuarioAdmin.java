package br.com.project.toolsmanager.colaborador.model;

import br.com.project.toolsmanager.colaborador.enums.ERoleUsuario;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuarios_admin")
public class UsuarioAdmin extends Colaborador {

    @Column(name = "email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_usuario", nullable = false, length = 20)
    private ERoleUsuario roleUsuario;
}
