package guru.springframework.services;


import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.domain.recipe.Recipe;
import guru.springframework.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RecipeSerciveImpl implements RecipeService{
	
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(RecipeSerciveImpl.class);
	private final RecipeRepository recipeRepository;
	
	public RecipeSerciveImpl(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}


	@Override
	public Set<Recipe> getRecipes() {
		
		log.debug("I'm in the Recipe Service Impl");
		// TODO Auto-generated method stub
		Set<Recipe> recipeSet = new HashSet<>();
		recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
		return recipeSet;
	}

}
