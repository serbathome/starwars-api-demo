namespace starwars
{
    public interface IStarWarsAPI
    {
        Task<Character?> GetLukeSkywalkerAsync();
        Task<Character?> GetDarthVaderAsync();
    }
}