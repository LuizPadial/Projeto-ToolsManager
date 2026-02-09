package br.com.project.toolsmanager.colaborador.dto;

import br.com.project.toolsmanager.colaborador.model.UsuarioAdmin;
import jakarta.validation.constraints.NotBlank;

public record UsuarioAdminRequest(
        @NotBlank String email,
        @NotBlank String senha ) {

    public UsuarioAdmin toEntity() {
        return UsuarioAdmin
                .builder()
                .email(this.email)
                .senha(this.senha)
                .build();
    }
}
