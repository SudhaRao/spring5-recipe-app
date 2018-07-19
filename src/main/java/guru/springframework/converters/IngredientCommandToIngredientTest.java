package guru.springframework.converters;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import guru.springframework.domain.recipe.Recipe;

@Component
public class IngredientCommandToIngredientTest {
	
	public static final Recipe RECIPE = new Recipe();
	public static final BigDecimal AMOUNT = new BigDecimal("1");
	public static final String DESCRIPTION = "Yummy Dish";
	public static final Long ID_VALUE = new Long(1L);
	public static final Long UOM_ID = new Long(2L);
	
	IngredientCommandToIngredient converter;

}
