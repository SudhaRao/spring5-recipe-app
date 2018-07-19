package guru.springframework.commands;

import guru.springframework.domain.recipe.Recipe;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class NotesCommand {
	
	private Long id;
	private Recipe recipe;
	private String recipeNotes;
	
	public NotesCommand() {
		super();
	}
	public NotesCommand(Long id, Recipe recipe, String recipeNotes) {
		this.id = id;
		this.recipe = recipe;
		this.recipeNotes = recipeNotes;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Recipe getRecipe() {
		return recipe;
	}
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	public String getRecipeNotes() {
		return recipeNotes;
	}
	public void setRecipeNotes(String recipeNotes) {
		this.recipeNotes = recipeNotes;
	}
	
	

}
