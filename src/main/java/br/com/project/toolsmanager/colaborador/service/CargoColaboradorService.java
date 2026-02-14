package br.com.project.toolsmanager.colaborador.service;

import br.com.project.toolsmanager.colaborador.dto.CargoColaboradorRequest;
import br.com.project.toolsmanager.colaborador.model.Profissao;
import br.com.project.toolsmanager.colaborador.repository.CargoColaboradorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CargoColaboradorService {

    private final CargoColaboradorRepository cargoColaboradorRepository;


    public void salvar(CargoColaboradorRequest request) {
        var cargo = Profissao.of(request);

        cargoColaboradorRepository.save(cargo);
    }
}
