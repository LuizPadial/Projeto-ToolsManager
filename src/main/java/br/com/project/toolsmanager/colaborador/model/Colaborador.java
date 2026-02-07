package br.com.project.toolsmanager.colaborador.model;

import br.com.project.toolsmanager.colaborador.enums.ECodigoCargo;
import br.com.project.toolsmanager.comum.enums.ECodigoSetor;
import br.com.project.toolsmanager.colaborador.enums.ECodigoSituacaoColaborador;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "COLABORADOR")
public class Colaborador {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;

    @Column(name = "MATRICULA", length = 30, nullable = false)
    private String matricula;

    @Size(max = 50)
    @Enumerated(EnumType.STRING)
    @Column(name = "CARGO", length = 50, nullable = false)
    private ECodigoCargo cargo;

    @Size(max = 50)
    @Enumerated(EnumType.STRING)
    @Column(name = "SETOR", length = 50, nullable = false)
    private ECodigoSetor setor;

    @Size(max = 30)
    @Column(name = "CODIGO_CRACHA", length = 30, nullable = false)
    private String codigoCracha;

    @Column(name = "BIOMETRIA", nullable = false)
    private String biometria;

    @Size(max = 25)
    @Enumerated(EnumType.STRING)
    @Column(name = "SITUACAO_COLABORADOR", length = 25, nullable = false)
    private ECodigoSituacaoColaborador situacaoColaborador;

}
