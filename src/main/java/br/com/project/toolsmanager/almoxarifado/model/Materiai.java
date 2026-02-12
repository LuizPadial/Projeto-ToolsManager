package br.com.project.toolsmanager.almoxarifado.model;

import br.com.project.toolsmanager.almoxarifado.enums.ESetorArmazem;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="MATERIAIS")
public class Materiai extends ItemBase {

    @Column(name = "NUMERO_NOTA_FISCAL")
    private String numeroNotaFiscal;

    @Column(name = "SETOR_ARMAZENADO")
    private ESetorArmazem setorArmazenado;

}
