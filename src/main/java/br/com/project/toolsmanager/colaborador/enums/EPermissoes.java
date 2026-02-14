package br.com.project.toolsmanager.colaborador.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EPermissoes {

    CADASTRAR_ITEM("Autorização para cadastrar novos itens"),
    LIBERAR_ITEM("Autorização para liberar itens"),
    CADASTRAR_USUARIO("Autorização para cadastro de usuario"),
    CADASTRAR_COLABORADOR("Autorização para Cadastro de colaborador");

    private final String descricao;

}
