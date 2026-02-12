package br.com.project.toolsmanager.colaborador.service;

import br.com.project.toolsmanager.colaborador.dto.ColaboradorRequest;
import br.com.project.toolsmanager.colaborador.model.Colaborador;
import br.com.project.toolsmanager.colaborador.repository.ColaboradorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ColaboradorService {

    private final ColaboradorRepository colaboradorRepository;

    public void salvar(ColaboradorRequest request) {
        var colaborador = Colaborador.of(request);

        colaboradorRepository.save(colaborador);
    }

}
