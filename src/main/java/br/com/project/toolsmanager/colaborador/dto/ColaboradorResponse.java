package br.com.project.toolsmanager.colaborador.dto;

import br.com.project.toolsmanager.colaborador.enums.ECodigoSituacaoColaborador;
import br.com.project.toolsmanager.colaborador.model.Colaborador;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record ColaboradorResponse(
        Integer id,
        String nome,
        String matricula,
        Integer cargoId,
        Integer setorId,
        @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
        LocalDateTime dataCadastro,
        ECodigoSituacaoColaborador situacaoColaborador) {

    public static ColaboradorResponse of(Colaborador colaborador) {
        return new ColaboradorResponse(
                colaborador.getId(),
                colaborador.getNome(),
                colaborador.getMatricula(),
                colaborador.getCargo().getId(),
                colaborador.getSetor().getId(),
                colaborador.getDataCadastro(),
                colaborador.getSituacaoColaborador()
        );
    }
}
