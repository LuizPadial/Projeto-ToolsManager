package br.com.project.toolsmanager.colaborador.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "CARGO_USUARIO")
public class CargoUsuario {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "FK_USUARIO", foreignKey = @ForeignKey(name = "FK_USUARIO"), referencedColumnName = "ID")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "FK_CARGO", foreignKey = @ForeignKey(name = "FK_CARGO"), referencedColumnName = "ID")
    private Cargo cargo;

}
