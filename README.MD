# Star Wars API Demo - GitHub Copilot Workshop

A hands-on workshop to learn GitHub Copilot by building a Star Wars API client in both **Java** and **C# (.NET)**.

## 🎯 What You'll Build

A Star Wars character API client that fetches Luke Skywalker and Darth Vader data from [SWAPI](https://swapi.info/), with unit tests and clean refactored code.

## 📁 Project Structure

```
starwars-api-demo/
├── dotnet/prompts.txt     # C# workshop prompts
├── java/prompts.txt       # Java workshop prompts
├── dotnet/starwars/       # .NET 8 implementation
└── java/starwars/         # Java 17 implementation
```

## 🛠️ Prerequisites

- **.NET 8 SDK** for C# implementation
- **Java 17+ and Maven** for Java implementation
- **VS Code with GitHub Copilot extension**

## 🚀 Workshop Flow

### Step 1: Choose Your Language
Pick either `dotnet/` or `java/` folder and follow the prompts in `prompts.txt`.

### Step 2: Use GitHub Copilot with Prompts
1. Open the `prompts.txt` file for your chosen language
2. Copy each prompt and paste it in GitHub Copilot chat in Agent mode
3. Let GitHub Copilot generate the code based on the prompt
4. Use GitHub Copilot Chat for clarifications and iterations

### Step 3: If You Get Stuck
Switch to the **`solution`** branch to see the complete working implementation:
```bash
git checkout solution
```

### Step 4: Phases Overview
1. **Setup** - Create project with testing framework
2. **Data Model** - Create Character class/DTO from JSON
3. **Interface** - Design API interface  
4. **Tests** - Write tests first
5. **Implementation** - Implement HTTP client and JSON parsing
6. **Expand** - Add Darth Vader endpoint
7. **Refactor** - Extract common functionality

## 💡 GitHub Copilot Tips

- **Be specific** in your prompts
- **Mention the language/framework** explicitly
- **Start simple**, build complexity gradually
- **Use comments** to guide Copilot
- **Test-driven approach** works best

---

**Happy Coding with GitHub Copilot!** 🚀