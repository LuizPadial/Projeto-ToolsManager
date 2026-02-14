package br.com.project.toolsmanager.empresa.dto;

import jakarta.validation.constraints.NotBlank;

public record SetorEmpresaRequest(
        @NotBlank  String setor) {

}
