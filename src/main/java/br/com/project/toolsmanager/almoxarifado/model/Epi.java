package br.com.project.toolsmanager.almoxarifado.model;

import br.com.project.toolsmanager.almoxarifado.dto.EpiRequest;
import br.com.project.toolsmanager.empresa.model.SetorEmpresa;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="EPI")
public class Epi extends ItemBase {

    @Column(name = "NUMERO_NOTA_FISCAL")
    private String numeroNotaFiscal;

    @Column(name = "CA")
    private String cA;

    @Column(name = "VALIDADE_CA")
    private LocalDate validadeCa;

    public static Epi of(EpiRequest request) {
        return Epi
                .builder()
                .numeroNotaFiscal(request.numeroNotaFiscal())
                .fornecedor(request.nome())
                .cA(request.cA())
                .validadeCa(request.validadeCa())
                .setor(SetorEmpresa.builder()
                        .id(request.setor().getId())
                        .build())
                .nome(request.nome())
                .quantidade(request.quantidade())
                .dataEntrada(request.dataEntrada())
                .situacao(request.situacao())
                .tipoItem(request.tipoItem())
                .build();
    }
}
