package br.com.project.toolsmanager.almoxarifado.model;

import br.com.project.toolsmanager.almoxarifado.enums.ESituacao;
import br.com.project.toolsmanager.almoxarifado.enums.ETipoItem;
import br.com.project.toolsmanager.empresa.model.SetorEmpresa;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "ITENS_ALMOXARIFADO")
public abstract class ItemBase {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "FK_SETOR", foreignKey = @ForeignKey (name = "FK_ITEM_ALMOX_SETOR"), referencedColumnName = "ID")
    private SetorEmpresa setor;

    @Size(min = 5, max = 100)
    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;

    @Column(name = "FORNECEDOR")
    private String fornecedor;

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

}
