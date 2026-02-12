package br.com.project.toolsmanager.colaborador.controller;

import br.com.project.toolsmanager.colaborador.dto.ColaboradorRequest;
import br.com.project.toolsmanager.colaborador.service.ColaboradorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/colaborador")
public class ColaboradorController {

    public final ColaboradorService colaboradorService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@Valid @RequestBody ColaboradorRequest request) {
        colaboradorService.salvar(request);
    }

}
