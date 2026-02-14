package br.com.project.toolsmanager.colaborador.dto;

import jakarta.validation.constraints.NotBlank;

public record ProfissaoRequest(
       @NotBlank String profissao) {

}