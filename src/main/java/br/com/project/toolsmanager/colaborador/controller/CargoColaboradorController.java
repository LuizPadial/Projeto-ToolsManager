package br.com.project.toolsmanager.colaborador.controller;

import br.com.project.toolsmanager.colaborador.dto.CargoColaboradorRequest;
import br.com.project.toolsmanager.colaborador.service.CargoColaboradorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/cargocolaborador")
public class CargoColaboradorController {

    private final CargoColaboradorService cargoColaboradorService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@Valid @RequestBody CargoColaboradorRequest request) {
        cargoColaboradorService.salvar(request);
    }

}
