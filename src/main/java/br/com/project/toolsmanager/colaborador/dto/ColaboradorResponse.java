package br.com.project.toolsmanager.colaborador.dto;

import br.com.project.toolsmanager.colaborador.enums.ECodigoSituacaoColaborador;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColaboradorResponse {

    private Integer id;
    private String nome;
    private String matricula;
    private String codigoCracha;
    private String biometria;
    private Integer cargoId;
    private Integer setorId;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime dataCadastro;
    private ECodigoSituacaoColaborador situacaoColaborador;

}
