package br.com.kraken.application.core.service;

import br.com.kraken.adapters.in.dto.request.JogadorRequest;
import br.com.kraken.adapters.in.dto.response.JogadorResponse;
import br.com.kraken.application.ports.in.service.IJogadorService;
import org.springframework.stereotype.Service;

@Service
public class JogadorService implements IJogadorService {
    @Override
    public JogadorResponse jogadorMock(Integer idDotIme) {
        String nomeTim = "";
        if (idDotIme.equals(824)) {
            nomeTim = "Kraken";
        }
        return JogadorResponse.builder()
                .CPF("503.123.638-02")
                .nome("Matheus Chaves")
                .idade(18)
                .posicao("Meia")
                .nomeTime(nomeTim)
                .build();
    }
}
