package br.com.project.toolsmanager.colaborador.model;

import br.com.project.toolsmanager.colaborador.dto.ColaboradorRequest;
import br.com.project.toolsmanager.colaborador.enums.ERoleUsuario;
import br.com.project.toolsmanager.colaborador.enums.ECodigoSituacaoColaborador;
import br.com.project.toolsmanager.setor.model.SetorEmpresa;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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

    @ManyToOne
    @JoinColumn(name = "FK_CARGO", foreignKey = @ForeignKey (name = "FK_CARGO"), referencedColumnName = "ID")
    private CargoColaborador cargo;

    @ManyToOne
    @JoinColumn(name = "FK_SETOR", foreignKey = @ForeignKey (name = "FK_SETOR"), referencedColumnName = "ID")
    private SetorEmpresa setor;

    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;

    @Column(name = "MATRICULA", length = 30, nullable = false)
    private String matricula;

    @Size(max = 30)
    @Column(name = "CODIGO_CRACHA", length = 30, nullable = false)
    private String codigoCracha;

    @Column(name = "BIOMETRIA", nullable = false)
    private String biometria;

    @Column(name = "DATA_CADASTRO", updatable = false)
    private LocalDateTime dataCadastro;

    @Size(max = 25)
    @Enumerated(EnumType.STRING)
    @Column(name = "SITUACAO_COLABORADOR", length = 25, nullable = false)
    private ECodigoSituacaoColaborador situacaoColaborador;

    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE_USUARIO", nullable = false, length = 20)
    private ERoleUsuario roleUsuario;

    public static Colaborador of(ColaboradorRequest request) {
        return Colaborador
                .builder()
                .nome(request.getNome())
                .matricula(request.getMatricula())
                .cargo(new CargoColaborador(request.getCargoId()))
                .setor(new SetorEmpresa(request.getSetorId()))
                .codigoCracha(request.getCodigoCracha())
                .biometria(request.getBiometria())
                .dataCadastro(LocalDateTime.now())
                .situacaoColaborador(ECodigoSituacaoColaborador.ATIVO)
                .roleUsuario(request.getRoleUsuario())
                .build();
    }
}
