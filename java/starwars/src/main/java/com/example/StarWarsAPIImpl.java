package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class StarWarsAPIImpl implements StarWarsAPI {
    private final ObjectMapper objectMapper;
    private final HttpClient httpClient;
    private static final String API_BASE_URL = "https://swapi.info/api/people/";

    public StarWarsAPIImpl() {
        this.objectMapper = new ObjectMapper();
        this.httpClient = HttpClient.newHttpClient();
    }

    @Override
    public StarWarsCharacterDTO getLukeSkywalker() throws Exception {
        return getStarWarsCharacter(1);
    }

    @Override
    public StarWarsCharacterDTO getDarthVader() throws Exception {
        return getStarWarsCharacter(4);
    }

    private StarWarsCharacterDTO getStarWarsCharacter(int id) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(API_BASE_URL + id))
            .GET()
            .build();

        HttpResponse<String> response = httpClient.send(request, 
            HttpResponse.BodyHandlers.ofString());

        return objectMapper.readValue(response.body(), StarWarsCharacterDTO.class);
    }
}