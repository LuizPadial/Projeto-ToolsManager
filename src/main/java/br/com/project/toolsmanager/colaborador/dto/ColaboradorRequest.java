package br.com.project.toolsmanager.colaborador.dto;

import br.com.project.toolsmanager.colaborador.enums.ECodigoSituacaoColaborador;
import br.com.project.toolsmanager.colaborador.enums.ERoleUsuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ColaboradorRequest {

    @NotNull
    private String nome;
    @NotBlank
    private String matricula;
    @NotBlank
    private String codigoCracha;
    @NotBlank
    private String biometria;
    private Integer cargoId;
    private Integer setorId;
    private ECodigoSituacaoColaborador situacaoColaborador;
    private ERoleUsuario roleUsuario;

}
