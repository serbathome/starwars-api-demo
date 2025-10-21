using System.Text.Json;

namespace starwars
{
    public class StarWarsAPIImpl : IStarWarsAPI
    {
        public async Task<Character?> GetLukeSkywalkerAsync()
        {
            return await GetStarWarsCharacterAsync(1);
        }

        public async Task<Character?> GetDarthVaderAsync()
        {
            return await GetStarWarsCharacterAsync(4);
        }

        private async Task<Character?> GetStarWarsCharacterAsync(int id)
        {
            // 1. Instantiate a http client object
            using var httpClient = new HttpClient();

            // 2. Create a HttpRequest object using the GET method and the url
            var request = new HttpRequestMessage(HttpMethod.Get, $"https://swapi.info/api/people/{id}");

            // 3. Send the request and retrieve the response
            var response = await httpClient.SendAsync(request);

            // 4. Parse the response body to a Character object
            var responseBody = await response.Content.ReadAsStringAsync();
            var character = JsonSerializer.Deserialize<Character>(responseBody);

            // 5. Return the Character object
            return character;
        }
    }
}