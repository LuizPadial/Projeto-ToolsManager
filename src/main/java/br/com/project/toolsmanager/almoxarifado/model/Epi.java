package br.com.project.toolsmanager.almoxarifado.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="EPI")
public class Epi extends ItemAlmoxarifado{

    @Column(name = "NUMERO_NOTA_FISCAL")
    private String numeroNotaFiscal;

    @Column(name = "DATA_ENTRADA")
    private LocalDate dataEntrada;

    @Column(name = "FORNECEDOR")
    private String fornecedor;

    @Column(name = "CA")
    private String cA;

    @Column(name = "VALIDADE_CA")
    private LocalDate validadeCa;
}
