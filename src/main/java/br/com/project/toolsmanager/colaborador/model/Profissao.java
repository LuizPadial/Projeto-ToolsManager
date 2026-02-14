package br.com.project.toolsmanager.colaborador.model;

import br.com.project.toolsmanager.colaborador.dto.CargoColaboradorRequest;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FUNCAO_COLABORADOR")
public class Profissao {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CARGO")
    private String cargo;

    public static Profissao of(CargoColaboradorRequest request) {
        return Profissao
                .builder()
                .cargo(request.cargo())
                .build();
    }
}
