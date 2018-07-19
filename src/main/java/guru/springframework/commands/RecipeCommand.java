package guru.springframework.commands;

import java.util.HashSet;
import java.util.Set;

import guru.springframework.enumeration.Difficulty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class RecipeCommand {
	
	private Long id;
	private String description;
	private Integer prepTime;
	private Integer cookTime;
	private Integer servings;
	private String source;
	private String url;
	private String directions;
	private Difficulty difficulty;
	private NotesCommand notesCommand;
	private Set<IngredientCommand> ingredientCommand = new HashSet<>();
	private Set<CategoryCommand> categoryCommand  = new HashSet<>();
	
	public RecipeCommand() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RecipeCommand(Long id, String description, Integer prepTime, Integer cookTime, Integer servings,
			String source, String url, String directions, Difficulty difficulty, NotesCommand notesCommand,
			Set<IngredientCommand> ingredientCommand, Set<CategoryCommand> categoryCommand) {
		super();
		this.id = id;
		this.description = description;
		this.prepTime = prepTime;
		this.cookTime = cookTime;
		this.servings = servings;
		this.source = source;
		this.url = url;
		this.directions = directions;
		this.difficulty = difficulty;
		this.notesCommand = notesCommand;
		this.ingredientCommand = ingredientCommand;
		this.categoryCommand = categoryCommand;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrepTime() {
		return prepTime;
	}

	public void setPrepTime(Integer prepTime) {
		this.prepTime = prepTime;
	}

	public Integer getCookTime() {
		return cookTime;
	}

	public void setCookTime(Integer cookTime) {
		this.cookTime = cookTime;
	}

	public Integer getServings() {
		return servings;
	}

	public void setServings(Integer servings) {
		this.servings = servings;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDirections() {
		return directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	public NotesCommand getNotesCommand() {
		return notesCommand;
	}

	public void setNotesCommand(NotesCommand notesCommand) {
		this.notesCommand = notesCommand;
	}

	public Set<IngredientCommand> getIngredientCommand() {
		return ingredientCommand;
	}

	public void setIngredientCommand(Set<IngredientCommand> ingredientCommand) {
		this.ingredientCommand = ingredientCommand;
	}

	public Set<CategoryCommand> getCategoryCommand() {
		return categoryCommand;
	}

	public void setCategoryCommand(Set<CategoryCommand> categoryCommand) {
		this.categoryCommand = categoryCommand;
	}
	
	
	

}
