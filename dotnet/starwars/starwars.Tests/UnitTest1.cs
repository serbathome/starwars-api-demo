namespace starwars.Tests;

public class UnitTest1
{
    [Fact]
    public async Task GetLukeSkywalker_ShouldReturnCorrectNameAndHeight()
    {
        // Arrange
        IStarWarsAPI api = new StarWarsAPIImpl();

        // Act
        var character = await api.GetLukeSkywalkerAsync();

        // Assert
        Assert.NotNull(character);
        Assert.Equal("Luke Skywalker", character.Name);
        Assert.Equal("172", character.Height);
    }

    [Fact]
    public async Task GetDarthVader_ShouldReturnCorrectNameAndHeight()
    {
        // Arrange
        IStarWarsAPI api = new StarWarsAPIImpl();

        // Act
        var character = await api.GetDarthVaderAsync();

        // Assert
        Assert.NotNull(character);
        Assert.Equal("Darth Vader", character.Name);
        Assert.Equal("202", character.Height);
    }
}