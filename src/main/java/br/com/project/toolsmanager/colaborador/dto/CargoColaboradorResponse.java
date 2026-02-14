package br.com.project.toolsmanager.colaborador.dto;

import br.com.project.toolsmanager.colaborador.model.Profissao;

public record CargoColaboradorResponse(
        String cargo,
        Integer id) {

    public static CargoColaboradorResponse of(Profissao cargoColaborador) {
        return new CargoColaboradorResponse(
             cargoColaborador.getCargo(),
             cargoColaborador.getId()
        );
    }
}
