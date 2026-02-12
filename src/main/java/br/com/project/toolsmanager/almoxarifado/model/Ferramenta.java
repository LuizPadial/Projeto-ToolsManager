package br.com.project.toolsmanager.almoxarifado.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="FERRAMENTAS")
public class Ferramenta extends ItemBase {

    @Column(name = "TREINAMENTO")
    private Boolean treinamento;

    @Column(name = "PATRIMONIO")
    private String patrimonio;
}
