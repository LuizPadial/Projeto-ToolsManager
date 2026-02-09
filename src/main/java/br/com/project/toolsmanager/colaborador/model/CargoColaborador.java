package br.com.project.toolsmanager.colaborador.model;

import br.com.project.toolsmanager.colaborador.dto.CargoColaboradorRequest;
import br.com.project.toolsmanager.setor.dto.SetorEmpresaRequest;
import br.com.project.toolsmanager.setor.model.SetorEmpresa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FUNCAO_COLABORADOR")
public class CargoColaborador {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany
    @JoinColumn(name = "FK_COLABORADOR", foreignKey = @ForeignKey(name = "FK_COLABORADOR"), referencedColumnName = "ID")
    private Colaborador colaborador;

    @Column(name = "CARGO")
    private String cargo;

    public static CargoColaborador of(CargoColaboradorRequest request) {
        return CargoColaborador
                .builder()
                .cargo(request.getCargo())
                .build();
    }

    public CargoColaborador(Integer id) {
        this.id = id;
    }
}
