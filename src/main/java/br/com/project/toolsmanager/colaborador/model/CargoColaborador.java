package br.com.project.toolsmanager.colaborador.model;

import br.com.project.toolsmanager.colaborador.dto.CargoColaboradorRequest;
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

    @OneToMany(mappedBy = "cargo", fetch = FetchType.LAZY)
    private List<Colaborador> colaboradores;;

    @Column(name = "CARGO")
    private String cargo;

    public static CargoColaborador of(CargoColaboradorRequest request) {
        return CargoColaborador
                .builder()
                .cargo(request.cargo())
                .build();
    }
}
