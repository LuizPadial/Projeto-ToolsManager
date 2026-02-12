package br.com.project.toolsmanager.colaborador.dto;

import br.com.project.toolsmanager.colaborador.enums.ECodigoSituacaoColaborador;
import br.com.project.toolsmanager.colaborador.enums.ERoleUsuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ColaboradorRequest(
        @NotBlank String nome,
        @NotBlank String matricula,
        @NotBlank String codigoCracha,
        @NotBlank String biometria,
        @NotNull Integer cargoId,
        @NotNull Integer setorId,
        ECodigoSituacaoColaborador situacaoColaborador,
        ERoleUsuario roleUsuario) {
}
