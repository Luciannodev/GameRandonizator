package br.com.controller;

import br.com.model.dto.Game;
import br.com.usecase.GameUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
public class RandomGameController {

    @Autowired
    private GameUseCase gameUseCase;


    @GetMapping("/")
    public ResponseEntity<Game> getGame() throws IOException, URISyntaxException {

        return ResponseEntity.ok(gameUseCase.getRandomGame());
    }

}