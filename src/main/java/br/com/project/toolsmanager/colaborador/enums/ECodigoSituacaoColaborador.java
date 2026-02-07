package br.com.project.toolsmanager.colaborador.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ECodigoSituacaoColaborador {

    ATIVO("Ativo"),
    INATIVO("Inativo"),
    DEMITIDO("Demitido"),
    AFASTADO("Afastado"),
    FERIAS("Férias");

    private final String descricao;
}
