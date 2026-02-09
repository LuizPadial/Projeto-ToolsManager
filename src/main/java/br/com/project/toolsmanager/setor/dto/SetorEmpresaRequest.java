package br.com.project.toolsmanager.setor.dto;

import br.com.project.toolsmanager.setor.model.SetorEmpresa;

public record SetorEmpresaRequest(String setor) {

    public SetorEmpresa toEntity() {
        return SetorEmpresa.builder()
                .setor(this.setor)
                .build();
    }
}
