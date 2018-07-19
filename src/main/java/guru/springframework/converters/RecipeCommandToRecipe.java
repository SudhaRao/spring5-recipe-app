package guru.springframework.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import guru.springframework.commands.RecipeCommand;
import guru.springframework.domain.recipe.Recipe;

@Component
public class RecipeCommandToRecipe implements Converter<RecipeCommand, Recipe>{

	@Override
	public Recipe convert(RecipeCommand source) {
		if(source == null) {
			return null;
		}
		
		final Recipe recipe = new Recipe();
		recipe.setId(source.getId());
		recipe.setDescription(source.getDescription());
		recipe.setCookTime(source.getCookTime());
		recipe.setPrepTime(source.getPrepTime());
		recipe.setDifficulty(source.getDifficulty());
		recipe.setServings(source.getServings());
		recipe.setSource(source.getSource());
		
		
		return recipe;
	}

}
