using System.Text.Json.Serialization;

namespace starwars
{
    public class Character
    {
        [JsonPropertyName("name")]
        public string Name { get; set; } = string.Empty;

        [JsonPropertyName("height")]
        public string Height { get; set; } = string.Empty;

        [JsonPropertyName("mass")]
        public string Mass { get; set; } = string.Empty;

        [JsonPropertyName("hair_color")]
        public string Hair_Color { get; set; } = string.Empty;

        [JsonPropertyName("skin_color")]
        public string Skin_Color { get; set; } = string.Empty;

        [JsonPropertyName("eye_color")]
        public string Eye_Color { get; set; } = string.Empty;

        [JsonPropertyName("birth_year")]
        public string Birth_Year { get; set; } = string.Empty;

        [JsonPropertyName("gender")]
        public string Gender { get; set; } = string.Empty;

        [JsonPropertyName("homeworld")]
        public string Homeworld { get; set; } = string.Empty;

        [JsonPropertyName("films")]
        public List<string> Films { get; set; } = new List<string>();

        [JsonPropertyName("species")]
        public List<string> Species { get; set; } = new List<string>();

        [JsonPropertyName("vehicles")]
        public List<string> Vehicles { get; set; } = new List<string>();

        [JsonPropertyName("starships")]
        public List<string> Starships { get; set; } = new List<string>();

        [JsonPropertyName("created")]
        public string Created { get; set; } = string.Empty;

        [JsonPropertyName("edited")]
        public string Edited { get; set; } = string.Empty;

        [JsonPropertyName("url")]
        public string Url { get; set; } = string.Empty;
    }
}