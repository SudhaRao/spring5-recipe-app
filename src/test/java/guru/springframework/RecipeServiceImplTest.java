package guru.springframework;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import guru.springframework.domain.recipe.Recipe;
import guru.springframework.repositories.RecipeRepository;
import guru.springframework.services.RecipeSerciveImpl;


public class RecipeServiceImplTest {
	
	
	RecipeSerciveImpl recipeServiceImpl;
	
	@Mock
	RecipeRepository recipeRepository;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		recipeServiceImpl = new RecipeSerciveImpl(recipeRepository);
	}
	
	@Test
	public void getRecipes() throws Exception{
		
		Recipe recipe = new Recipe();
		HashSet<Recipe> recipesData = new HashSet<Recipe>();
		recipesData.add(recipe);
		when(recipeServiceImpl.getRecipes()).thenReturn(recipesData);
		Set<Recipe> recipes = recipeServiceImpl.getRecipes();
		assertEquals(recipes.size(), 1);
		verify(recipeRepository, times(1)).findAll();
	}
	

}
