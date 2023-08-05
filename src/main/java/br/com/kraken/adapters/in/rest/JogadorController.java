package br.com.kraken.adapters.in.rest;

import br.com.kraken.adapters.in.dto.request.JogadorRequest;
import br.com.kraken.adapters.in.dto.response.JogadorResponse;
import br.com.kraken.application.ports.in.service.IJogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JogadorController {
    @Autowired
    IJogadorService iJogadorService;

    @GetMapping("/cadastro")
    public ResponseEntity<JogadorResponse> getCadastro() {
        JogadorResponse jogador = iJogadorService.jogadorMock(90);
        return ResponseEntity.status(HttpStatus.CREATED).body(jogador);
    }

    @GetMapping("/jogador")
    public ResponseEntity<JogadorResponse> getJogador(@RequestParam Integer id) {
        JogadorResponse jogador = iJogadorService.jogadorMock(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(jogador);
    }

}
