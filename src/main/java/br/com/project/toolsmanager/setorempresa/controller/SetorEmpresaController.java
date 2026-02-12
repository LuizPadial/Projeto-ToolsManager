package br.com.project.toolsmanager.setorempresa.controller;

import br.com.project.toolsmanager.setorempresa.dto.SetorEmpresaRequest;
import br.com.project.toolsmanager.setorempresa.service.SetorEmpresaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/setorempresa")
public class SetorEmpresaController {

    private final SetorEmpresaService setorEmpresaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@Valid @RequestBody SetorEmpresaRequest request) {
        setorEmpresaService.salvar(request);
    }

}
