package br.com.project.toolsmanager.almoxarifado.dto;

import br.com.project.toolsmanager.almoxarifado.enums.ESetorArmazem;
import br.com.project.toolsmanager.almoxarifado.enums.ESituacao;
import br.com.project.toolsmanager.almoxarifado.enums.ETipoItem;
import br.com.project.toolsmanager.setorempresa.model.SetorEmpresa;

import java.time.LocalDate;

public record MaterialRequest(
        String numeroNotaFiscal,
        String fornecedor,
        ESetorArmazem setorArmazenado,
        SetorEmpresa setor,
        String nome,
        Integer quantidade,
        LocalDate dataEntrada,
        ESituacao situacao,
        ETipoItem tipoItem) {
}
