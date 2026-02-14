package br.com.project.toolsmanager.colaborador.model;

import br.com.project.toolsmanager.colaborador.enums.EPermissoes;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "CARGO_PERMISSAO")
public class CargoPermissao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "FK_CARGO", foreignKey = @ForeignKey(name = "FK_CARGO_PERMISSAO"), referencedColumnName = "ID")
    private Cargo cargo;

    @Enumerated(EnumType.STRING)
    @Column(name = "PERMISSAO")
    private EPermissoes permissao;
}
