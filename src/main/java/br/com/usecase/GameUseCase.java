package br.com.usecase;

import br.com.model.dto.Game;

import java.io.IOException;
import java.net.URISyntaxException;

public interface GameUseCase {
    Game getRandomGame () throws IOException, URISyntaxException;
}
