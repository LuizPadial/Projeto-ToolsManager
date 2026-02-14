package br.com.project.toolsmanager.empresa.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "EMPRESA")
public class Empresa {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "RAZAO_SOCIAL", nullable = false)
    private String razaoSocial;

    @Column(name = "NOME_FANTASIA")
    private String nomeFantasia;

    @Column(name = "CNPJ", unique = true, nullable = false, length = 14)
    private String cnpj;

    @Column(name = "EMAIL_CONTATO", nullable = false)
    private String emailContato;

    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "ATIVO", nullable = false)
    private Boolean ativo = true;

    @Column(name = "DATA_CADASTRO", nullable = false)
    private LocalDateTime dataCadastro;

    @Column(name = "DATA_ATUALIZACAO")
    private LocalDateTime dataAtualizacao;

}
