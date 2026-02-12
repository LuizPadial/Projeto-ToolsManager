package br.com.project.toolsmanager.setorempresa.service;

import br.com.project.toolsmanager.setorempresa.dto.SetorEmpresaRequest;
import br.com.project.toolsmanager.setorempresa.model.SetorEmpresa;
import br.com.project.toolsmanager.setorempresa.repository.SetorEmpresaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SetorEmpresaService {

    private final SetorEmpresaRepository setorEmpresaRepository;

    public void salvar(SetorEmpresaRequest request) {
        var setor = SetorEmpresa.of(request);
        setorEmpresaRepository.save(setor);
    }

}
