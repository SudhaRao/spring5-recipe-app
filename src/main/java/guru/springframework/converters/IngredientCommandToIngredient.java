package guru.springframework.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import guru.springframework.commands.IngredientCommand;
import guru.springframework.domain.ingredient.Ingredient;
import lombok.Synchronized;

public class IngredientCommandToIngredient  implements Converter<IngredientCommand, Ingredient>{
	
	@Synchronized // This help to run in the multithreaded environment
	@Nullable
	@Override
	public Ingredient convert(IngredientCommand source) {
		if(source == null) {
			return null;
		}
		
		final Ingredient ingredient = new Ingredient();
		
		ingredient.setId(source.getId());
		ingredient.setDescription(source.getDescription());
		ingredient.setAmount(source.getAmount());
		ingredient.setRecipe(source.getRecipe());
		ingredient.setUom(source.getUom());
		
		return ingredient;
	}
}
