package br.com.repository;

import br.com.model.dto.Game;
import br.com.model.dto.GameList;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import static br.com.repository.Constante.URL_STEAM_GET_ALL;

public class GamesRepository {
    public static ArrayList<Game> getAll() throws IOException, URISyntaxException {


        URL url = new URI(URL_STEAM_GET_ALL).toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("accept", "application/json");
        InputStream responseStream = connection.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        GameList response = mapper.readValue(responseStream, GameList.class);

        return response.getApplist().getApps();
    }
}
