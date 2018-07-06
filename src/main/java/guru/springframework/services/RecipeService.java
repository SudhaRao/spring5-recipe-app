package guru.springframework.services;

import java.util.Set;

import guru.springframework.domain.recipe.Recipe;

public interface RecipeService {
	Set<Recipe> getRecipes();
}
