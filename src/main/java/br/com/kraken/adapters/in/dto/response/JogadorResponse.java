package br.com.kraken.adapters.in.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class JogadorResponse {
    private String CPF;
    private String nome;
    private Integer idade;
    private String posicao;
    private String nomeTime;
}
