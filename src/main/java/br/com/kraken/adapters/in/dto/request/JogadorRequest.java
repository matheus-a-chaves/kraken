package br.com.kraken.adapters.in.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class JogadorRequest {

    private String CPF;
    private String nome;
    private Integer idade;
    private String posicao;
    private Integer idDotIme;
}
