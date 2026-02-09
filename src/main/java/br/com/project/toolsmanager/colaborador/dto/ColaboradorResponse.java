package br.com.project.toolsmanager.colaborador.dto;

import br.com.project.toolsmanager.colaborador.enums.ECodigoSituacaoColaborador;
import br.com.project.toolsmanager.colaborador.model.Colaborador;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public record ColaboradorResponse(
        Integer id,
        String nome,
        String matricula,
        String codigoCracha,
        String biometria,
        Integer cargoId,
        Integer setorId,
        @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
        LocalDateTime dataCadastro,
        ECodigoSituacaoColaborador situacaoColaborador
) {

    public static ColaboradorResponse fromEntity(Colaborador colaborador) {
        return new ColaboradorResponse(
                colaborador.getId(),
                colaborador.getNome(),
                colaborador.getMatricula(),
                colaborador.getCodigoCracha(),
                colaborador.getBiometria(),
                colaborador.getCargo() != null ? colaborador.getCargo().getId() : null,
                colaborador.getSetor() != null ? colaborador.getSetor().getId() : null,
                colaborador.getDataCadastro(),
                colaborador.getSituacaoColaborador()
        );
    }
}
