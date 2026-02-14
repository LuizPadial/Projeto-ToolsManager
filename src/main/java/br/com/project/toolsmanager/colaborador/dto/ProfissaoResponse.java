package br.com.project.toolsmanager.colaborador.dto;

import br.com.project.toolsmanager.colaborador.model.Profissao;

public record ProfissaoResponse(
        String cargo,
        Integer id) {

    public static ProfissaoResponse of(Profissao profissao) {
        return new ProfissaoResponse(
             profissao.getProfissao(),
             profissao.getId()
        );
    }
}
