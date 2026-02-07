package br.com.project.toolsmanager.comum.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ECodigoSetor {

    MANUTENCAO("Manutenção"),
    OPERACAO("Operação"),
    PARADA("Parada"),
    ALMOXARIFADO("Almoxarifado"),
    ADMINISTRACAO("Administração"),
    GERENCIA("Gerência"),
    COORDENACAO("Coordenação"),
    QUALIDADE("Qualidade"),
    PLANEJAMENTO("Planejamento"),
    LOGISTICA("Logística"),
    ELETRICA("Elétrica"),
    MECANICA("Mecânica"),
    CIVIL("Civil"),
    TERCEIRIZADO("Terceirizado"),
    OUTROS("Outros");

    private final String descricao;

}
