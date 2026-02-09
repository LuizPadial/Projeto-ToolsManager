package br.com.project.toolsmanager.colaborador.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioAdminRequest {

    @NotBlank
    private String email;
    @NotBlank
    private String senha;
}
