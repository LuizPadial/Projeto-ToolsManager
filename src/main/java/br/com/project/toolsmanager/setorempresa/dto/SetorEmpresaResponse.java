package br.com.project.toolsmanager.setorempresa.dto;

import br.com.project.toolsmanager.setorempresa.model.SetorEmpresa;

public  record SetorEmpresaResponse(Integer id, String setor) {

    public static SetorEmpresaResponse of(SetorEmpresa setorEmpresa){
        return new SetorEmpresaResponse(
               setorEmpresa.getId(),
               setorEmpresa.getSetor()
        );
    }
}


