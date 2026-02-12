package br.com.project.toolsmanager.setorempresa.dto;

import jakarta.validation.constraints.NotBlank;

public record SetorEmpresaRequest(
        @NotBlank  String setor) {

}
