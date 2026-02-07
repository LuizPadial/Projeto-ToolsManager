package br.com.project.toolsmanager.almoxarifado.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ESituacao {

    OK("Liberado para empréstimo."),
    EMPRESTADO("Em uso."),
    DANIFICADO("Item danificado."),
    MANUTENCAO("Item em manutenção");

    private final String descricao;
}
