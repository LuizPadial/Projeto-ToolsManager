package br.com.project.toolsmanager.colaborador.dto;

import br.com.project.toolsmanager.colaborador.enums.ECodigoSituacaoColaborador;
import br.com.project.toolsmanager.colaborador.enums.ERoleUsuario;
import br.com.project.toolsmanager.colaborador.model.CargoColaborador;
import br.com.project.toolsmanager.colaborador.model.Colaborador;
import br.com.project.toolsmanager.setor.model.SetorEmpresa;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record ColaboradorRequest(
        @NotBlank String nome,
        @NotBlank String matricula,
        @NotBlank String codigoCracha,
        @NotBlank String biometria,
        Integer cargoId,
        Integer setorId,
        ECodigoSituacaoColaborador situacaoColaborador,
        ERoleUsuario roleUsuario
) {

    public Colaborador toEntity(CargoColaborador cargo, SetorEmpresa setor) {
        return Colaborador.builder()
                .nome(this.nome)
                .matricula(this.matricula)
                .codigoCracha(this.codigoCracha)
                .biometria(this.biometria)
                .cargo(cargo)
                .setor(setor)
                .situacaoColaborador(this.situacaoColaborador)
                .roleUsuario(this.roleUsuario)
                .dataCadastro(LocalDateTime.now())
                .build();
    }
}
