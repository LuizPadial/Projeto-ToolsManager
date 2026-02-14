package br.com.project.toolsmanager.colaborador.model;

import br.com.project.toolsmanager.colaborador.dto.ProfissaoRequest;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PROFISSAO")
public class Profissao {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "PROFISSAO")
    private String profissao;

    public static Profissao of(ProfissaoRequest request) {
        return Profissao
                .builder()
                .profissao(request.profissao())
                .build();
    }
}
