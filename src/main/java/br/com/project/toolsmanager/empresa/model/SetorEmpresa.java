package br.com.project.toolsmanager.empresa.model;

import br.com.project.toolsmanager.empresa.dto.SetorEmpresaRequest;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "SETOR_EMPRESA")
public class SetorEmpresa {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "SETOR")
    private String setor;

    public static SetorEmpresa of(SetorEmpresaRequest request) {
        return SetorEmpresa
                .builder()
                .setor(request.setor())
                .build();
    }
}
