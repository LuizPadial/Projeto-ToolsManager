package br.com.project.toolsmanager.colaborador.dto;

import br.com.project.toolsmanager.colaborador.model.CargoColaborador;

public record CargoColaboradorRequest(String cargo) {

    public CargoColaborador toEntity() {
        return CargoColaborador.builder()
                .cargo(this.cargo)
                .build();
    }
}