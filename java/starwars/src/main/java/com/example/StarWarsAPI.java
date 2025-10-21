package com.example;

public interface StarWarsAPI {
    /**
     * Retrieves information about Luke Skywalker from the Star Wars API.
     * 
     * @return StarWarsCharacterDTO containing Luke Skywalker's information
     * @throws Exception if there is an error retrieving the data
     */
    StarWarsCharacterDTO getLukeSkywalker() throws Exception;

    /**
     * Retrieves information about Darth Vader from the Star Wars API.
     * 
     * @return StarWarsCharacterDTO containing Darth Vader's information
     * @throws Exception if there is an error retrieving the data
     */
    StarWarsCharacterDTO getDarthVader() throws Exception;
}