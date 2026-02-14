package br.com.project.toolsmanager.colaborador.service;

import br.com.project.toolsmanager.colaborador.dto.ProfissaoRequest;
import br.com.project.toolsmanager.colaborador.model.Profissao;
import br.com.project.toolsmanager.colaborador.repository.ProfissaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfissaoService {

    private final ProfissaoRepository cargoColaboradorRepository;


    public void salvar(ProfissaoRequest request) {
        var cargo = Profissao.of(request);

        cargoColaboradorRepository.save(cargo);
    }
}
