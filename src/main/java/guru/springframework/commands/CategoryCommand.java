package guru.springframework.commands;

import java.util.Set;

import guru.springframework.domain.recipe.Recipe;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CategoryCommand {
	
	private Long id;
	private String description;
	private Set<Recipe> recipes;
	
	public CategoryCommand(Long id, String description, Set<Recipe> recipes) {
		super();
		this.id = id;
		this.description = description;
		this.recipes = recipes;
	}
	public CategoryCommand() {
		super();
		// TODO Auto-generated constructor stub
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
	public Set<Recipe> getRecipes() {
		return recipes;
	}
	public void setRecipes(Set<Recipe> recipes) {
		this.recipes = recipes;
	}
	
	

}
