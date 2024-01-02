package br.com.gamerandonizator.usecase;

import br.com.gamerandonizator.model.dto.Game;

import java.io.IOException;
import java.net.URISyntaxException;

public interface GameUseCase {
    Game getRandomGame () throws IOException, URISyntaxException;
}
