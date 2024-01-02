package br.com.usecase;

import br.com.model.dto.Game;
import br.com.repository.GamesRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Random;

@Service
public class GameUseCaseImpl implements GameUseCase {
    @Override
    public Game getRandomGame() throws IOException, URISyntaxException {
        ArrayList<Game> listGames = GamesRepository.getAll();
        int drawnNumber = getDrawnNumber(listGames);
        return listGames.get(drawnNumber);
    }

    private static int getDrawnNumber(ArrayList<Game> listGames) {
        int size = listGames.size();
        Random random = new Random();
        return random.nextInt(size);
    }
}
