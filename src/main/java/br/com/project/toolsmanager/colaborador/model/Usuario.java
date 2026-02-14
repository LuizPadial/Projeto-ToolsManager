package br.com.project.toolsmanager.colaborador.model;

import br.com.project.toolsmanager.colaborador.enums.EPermissoes;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "SENHA", nullable = false)
    private String senha;

    @Column(name = "NOME_COMPLETO", nullable = false)
    private String nomeCompleto;

    @Column(name = "ATIVO", nullable = false)
    private Boolean ativo = true;

    @Column(name = "EMAIL_VERIFICADO", nullable = false)
    private Boolean emailVerificado = false;

    @Column(name = "DATA_CADASTRO", nullable = false)
    private LocalDateTime dataCadastro;

}
