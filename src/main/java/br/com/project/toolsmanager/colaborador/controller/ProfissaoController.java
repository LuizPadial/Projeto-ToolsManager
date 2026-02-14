package br.com.project.toolsmanager.colaborador.controller;

import br.com.project.toolsmanager.colaborador.dto.ProfissaoRequest;
import br.com.project.toolsmanager.colaborador.service.ProfissaoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/cargocolaborador")
public class ProfissaoController {

    private final ProfissaoService cargoColaboradorService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@Valid @RequestBody ProfissaoRequest request) {
        cargoColaboradorService.salvar(request);
    }

}
