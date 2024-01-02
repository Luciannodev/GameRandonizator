package br.com.gamerandonizator.controller;

import br.com.gamerandonizator.usecase.GameUseCase;
import br.com.gamerandonizator.model.dto.Game;
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