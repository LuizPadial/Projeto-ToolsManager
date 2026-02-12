package br.com.project.toolsmanager.colaborador.dto;

import br.com.project.toolsmanager.colaborador.model.CargoColaborador;

public record CargoColaboradorResponse(
        String cargo,
        Integer id) {

    public static CargoColaboradorResponse of(CargoColaborador cargoColaborador) {
        return new CargoColaboradorResponse(
             cargoColaborador.getCargo(),
             cargoColaborador.getId()
        );
    }
}
