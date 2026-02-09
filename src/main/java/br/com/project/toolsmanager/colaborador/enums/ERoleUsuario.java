package br.com.project.toolsmanager.colaborador.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ERoleUsuario {

    ADMIN("Acesso total ao sistema"),
    CONSULTA("Acesso de consulta e relatórios"),
    USUARIO_SISTEMA("Acesso operacional ao sistema"),
    SEM_ACESSO("Sem acesso ao sistema");

    private final String descricao;

    public boolean podeAcessarSistema() {
        return this != SEM_ACESSO;
    }
}
