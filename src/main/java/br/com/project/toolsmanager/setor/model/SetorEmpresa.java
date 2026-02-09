package br.com.project.toolsmanager.setor.model;

import br.com.project.toolsmanager.almoxarifado.model.ItemAlmoxarifado;
import br.com.project.toolsmanager.colaborador.model.Colaborador;
import br.com.project.toolsmanager.setor.dto.SetorEmpresaRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
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

    @OneToMany(mappedBy = "setor", fetch = FetchType.LAZY)
    private List<Colaborador> colaboradores;

    @OneToMany(mappedBy = "setor", fetch = FetchType.LAZY)
    private List<ItemAlmoxarifado> itemAlmoxarifado;

    @Column(name = "SETOR")
    private String setor;
}
