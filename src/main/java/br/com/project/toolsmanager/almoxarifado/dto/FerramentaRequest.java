package br.com.project.toolsmanager.almoxarifado.dto;

import br.com.project.toolsmanager.almoxarifado.enums.ESituacao;
import br.com.project.toolsmanager.almoxarifado.enums.ETipoItem;
import br.com.project.toolsmanager.empresa.model.SetorEmpresa;

import java.time.LocalDate;

public record FerramentaRequest(
        Boolean treinamento,
        String patrimonio,
        String fornecedor,
        SetorEmpresa setor,
        String nome,
        Integer quantidade,
        LocalDate dataEntrada,
        ESituacao situacao,
        ETipoItem tipoItem) {
}
