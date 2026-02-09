package br.com.project.toolsmanager.setor.dto;

import br.com.project.toolsmanager.setor.model.SetorEmpresa;

public  record SetorEmpresaResponse(Integer id, String setor) {

    public static SetorEmpresaResponse fromEntity(SetorEmpresa setorEmpresa){
        return new SetorEmpresaResponse(
               setorEmpresa.getId(),
               setorEmpresa.getSetor()
        );
    }
}


