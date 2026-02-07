package br.com.project.toolsmanager.almoxarifado.model;

import br.com.project.toolsmanager.almoxarifado.enums.ESituacao;
import br.com.project.toolsmanager.almoxarifado.enums.ETipoItem;
import br.com.project.toolsmanager.comum.enums.ECodigoSetor;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "ITENS_ALMOXARIFADO")
public abstract class ItemAlmoxarifado {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(min = 5, max = 100)
    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;

    @Column(name = "QUANTIDADE")
    private Integer quantidade;

    @Column(name = "DATA_ENTRADA")
    private LocalDate dataEntrada;

    @Size(max = 25)
    @Enumerated(EnumType.STRING)
    @Column(name = "SITUACAO", length = 25, nullable = false)
    private ESituacao situacao;

    @Size(max = 50)
    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_ITEM", length = 50, nullable = false)
    private ETipoItem tipoItem;

    @Size(max = 50)
    @Enumerated(EnumType.STRING)
    @Column(name = "SETOR", length = 50, nullable = false)
    private ECodigoSetor setor;

}
