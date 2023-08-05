package br.com.kraken.application.ports.in.service;

import br.com.kraken.adapters.in.dto.request.JogadorRequest;
import br.com.kraken.adapters.in.dto.response.JogadorResponse;

public interface IJogadorService {
    JogadorResponse jogadorMock(Integer idDotime);
}
