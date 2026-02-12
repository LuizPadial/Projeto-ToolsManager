package br.com.project.toolsmanager.colaborador.dto;

import jakarta.validation.constraints.NotBlank;

public record UsuarioAdminRequest(
        @NotBlank String email,
        @NotBlank String senha ) {
}
