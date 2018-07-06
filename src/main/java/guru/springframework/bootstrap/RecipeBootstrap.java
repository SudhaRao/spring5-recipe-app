package guru.springframework.bootstrap;

import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.RecipeRepository;
import guru.springframework.repositories.UnitOfMeasureRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import guru.springframework.domain.category.Category;
import guru.springframework.domain.ingredient.Ingredient;
import guru.springframework.domain.notes.Notes;
import guru.springframework.domain.recipe.Recipe;
import guru.springframework.domain.uom.UnitOfMeasure;
import guru.springframework.enumeration.Difficulty;

@Component
public class RecipeBootstrap implements ApplicationListener<ContextRefreshedEvent>{
	
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private RecipeRepository recipeRepository;
	@Autowired
	private UnitOfMeasureRepository uomRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		recipeRepository.saveAll(getRecipes());
		
	}
	
	public RecipeBootstrap(CategoryRepository categoryRepository, RecipeRepository recipeRepository,
			UnitOfMeasureRepository uomRepository) {
		super();
		this.categoryRepository = categoryRepository;
		this.recipeRepository = recipeRepository;
		this.uomRepository = uomRepository;
	}
	
	private List<Recipe> getRecipes(){
		
		int initialCapacity = 2;
		List<Recipe> recipes = new ArrayList<>(initialCapacity);
		
		Optional<UnitOfMeasure> eachUomOptional = uomRepository.findByDescription("Each");
		
		if(!eachUomOptional.isPresent()) {
			throw new RuntimeException("Expected UOM not found");
		}
		
		Optional<UnitOfMeasure> tableSpoonUomOptional = uomRepository.findByDescription("Tablespoon");
		
		if(!tableSpoonUomOptional.isPresent()) {
			throw new RuntimeException("Expected UOM not found");
		}
		
		Optional<UnitOfMeasure> teaSpoonUomOptional = uomRepository.findByDescription("Teaspoon");
		
		if(!teaSpoonUomOptional.isPresent()) {
			throw new RuntimeException("Expected UOM not found");
		}
		
		Optional<UnitOfMeasure> dashUomOptional = uomRepository.findByDescription("Dash");
		
		if(!dashUomOptional.isPresent()) {
			throw new RuntimeException("Expected UOM not found");
		}
		
		Optional<UnitOfMeasure> pintUomOptional = uomRepository.findByDescription("Pint");
		
		if(!pintUomOptional.isPresent()) {
			throw new RuntimeException("Expected UOM not found");
		}
		
		Optional<UnitOfMeasure> cupsUomOptional = uomRepository.findByDescription("Cup");
		
		if(!cupsUomOptional.isPresent()) {
			throw new RuntimeException("Expected UOM not found");
		}
		
		Optional<UnitOfMeasure> pinchUomOptional = uomRepository.findByDescription("Pinch");
		
		if(!pinchUomOptional.isPresent()) {
			throw new RuntimeException("Expected UOM not found");
		}
		
		Optional<UnitOfMeasure> ounceUomOptional = uomRepository.findByDescription("Ounce");
		
		if(!ounceUomOptional.isPresent()) {
			throw new RuntimeException("Expected UOM not found");
		}
		
		Optional<UnitOfMeasure> milliliterUomOptional = uomRepository.findByDescription("Milliliter");
		
		if(!milliliterUomOptional.isPresent()) {
			throw new RuntimeException("Expected UOM not found");
		}
		
		Optional<UnitOfMeasure> literUomOptional = uomRepository.findByDescription("Liter");
		
		if(!literUomOptional.isPresent()) {
			throw new RuntimeException("Expected UOM not found");
		}
		
		Optional<UnitOfMeasure> milligramUomOptional = uomRepository.findByDescription("Milligram");
		
		if(!milligramUomOptional.isPresent()) {
			throw new RuntimeException("Expected UOM not found");
		}
		
		Optional<UnitOfMeasure> gramUomOptional = uomRepository.findByDescription("Grams");
		
		if(!gramUomOptional.isPresent()) {
			throw new RuntimeException("Expected UOM not found");
		}
		
		Optional<UnitOfMeasure> kilogramUomOptional = uomRepository.findByDescription("Kilogram");
		
		if(!kilogramUomOptional.isPresent()) {
			throw new RuntimeException("Expected UOM not found");
		}
		
		
		UnitOfMeasure eachUom = eachUomOptional.get();
		UnitOfMeasure tablespoonUom = tableSpoonUomOptional.get();
		UnitOfMeasure teaSpoonUom = teaSpoonUomOptional.get();
		UnitOfMeasure dashUom = dashUomOptional.get();
		UnitOfMeasure pintUom = pintUomOptional.get();
		UnitOfMeasure cupsUom = cupsUomOptional.get();
		UnitOfMeasure pinchUom = pinchUomOptional.get();
		UnitOfMeasure ounceUom = ounceUomOptional.get();
		UnitOfMeasure milliliterUom = milliliterUomOptional.get();
		UnitOfMeasure literUom = literUomOptional.get();
		UnitOfMeasure milligramUom = milligramUomOptional.get();
		UnitOfMeasure gramUom = gramUomOptional.get();
		UnitOfMeasure kilogramUom = kilogramUomOptional.get();
		
		
		Optional<Category> indianCategoryOptional = categoryRepository.findByDescription("Indian");
		
		if(!indianCategoryOptional.isPresent()) {
			throw new RuntimeException("Expected  Category not found");
		}
		
		Optional<Category> mexicanCategoryOptional = categoryRepository.findByDescription("Mexican");
		
		if(!mexicanCategoryOptional.isPresent()) {
			throw new RuntimeException("Expected  Category not found");
		}
		
		Optional<Category> americanCategoryOptional = categoryRepository.findByDescription("American");
		
		if(!americanCategoryOptional.isPresent()) {
			throw new RuntimeException("Expected  Category not found");
		}
		
		Optional<Category> italianCategoryOptional = categoryRepository.findByDescription("Italian");
		
		if(!italianCategoryOptional.isPresent()) {
			throw new RuntimeException("Expected  Category not found");
		}
		
		Optional<Category> asianCategoryOptional = categoryRepository.findByDescription("Asian");
		
		if(!asianCategoryOptional.isPresent()) {
			throw new RuntimeException("Expected  Category not found");
		}
		
		Category indianCategory = indianCategoryOptional.get();
		Category mexicanCategory = mexicanCategoryOptional.get();
		Category americanCategory = americanCategoryOptional.get();
		Category italianCategory = italianCategoryOptional.get();
		Category asianCategory = asianCategoryOptional.get();
		
		Recipe guacRecipe = new Recipe();
		guacRecipe.setDescription("Perfect Easy Guacamole");
		guacRecipe.setPrepTime(10);
		guacRecipe.setCookTime(0);
		guacRecipe.setServings(4);
		guacRecipe.setSource("internet");
		guacRecipe.setUrl("https://www.simplyrecipes.com/recipes/perfect_guacamole/");
		guacRecipe.setDifficulty(Difficulty.EASY);
		guacRecipe.setDirections(
				"1 Cut avocado, remove flesh: Cut the avocados in half. "
				+ "	Remove seed. Score the inside of the avocado with a blunt "
				+ "	knife and scoop out the flesh with a spoon."
				+ "\n 2 Mash with a fork: Using a fork, roughly mash the avocado. (Don't overdo it! "
				+ "The guacamole should be a little chunky.) "
				+ "\n 3 Add salt, lime juice, and the rest: Sprinkle with salt and lime (or lemon) juice. "
				+ " The acid in the lime juice will provide some balance to the richness of the avocado "
				+ "and will help delay the avocados from turning brown.Add the chopped onion, "
				+ "cilantro, black pepper, and chiles. Chili peppers vary individually in their hotness. So, start with a half of one chili pepper and add to the guacamole to your desired degree of hotness."
				+ "Remember that much of this is done to taste because of the variability in the fresh ingredients. "
				+ "Start with this recipe and adjust to your taste."
				+ "\n 4 Cover with plastic and chill to store: Place plastic wrap on the surface of the "
				+ "guacamole cover it and to prevent air reaching it. (The oxygen in the air causes "
				+ "oxidation which will turn the guacamole brown.) Refrigerate until ready to serve. "
				+ "Chilling tomatoes hurts their flavor, so if you want to add chopped tomato to your "
				+ "guacamole, add it just before serving.)");
		
		Notes guacNotes = new Notes();
		guacNotes.setRecipeNotes("For a very quick guacamole just take a 1/4 cup of salsa and mix it in with your mashed avocados.\n" + 
				"\n" + 
				"Feel free to experiment! One classic Mexican guacamole has pomegranate seeds and chunks of peaches in it (a Diana Kennedy favorite). Try guacamole with added pineapple, mango, or strawberries (see our Strawberry Guacamole).\n" + 
				"\n" + 
				"The simplest version of guacamole is just mashed avocados with salt. Don't let the lack of availability of other ingredients stop you from making guacamole.\n" + 
				"\n" + 
				"To extend a limited supply of avocados, add either sour cream or cottage cheese to your guacamole dip. Purists may be horrified, but so what? It tastes great.\n" + 
				"\n" + 
				"");
		guacNotes.setRecipe(guacRecipe);
		
		guacRecipe.setNotes(guacNotes);
		guacRecipe.getIngredient().add(new Ingredient("Ripe avacados", new BigDecimal(2), eachUom, guacRecipe));		
		guacRecipe.getIngredient().add(new Ingredient("Kosher Salt", new BigDecimal(2), teaSpoonUom, guacRecipe));		
		guacRecipe.getIngredient().add(new Ingredient("Fresh Lime Juice", new BigDecimal(2), tablespoonUom, guacRecipe));		
		guacRecipe.getIngredient().add(new Ingredient("Sliced Red or thinly sliced green Onions", new BigDecimal(2), eachUom, guacRecipe));		
		guacRecipe.getIngredient().add(new Ingredient("Green Chilies mined or sliced", new BigDecimal(2), tablespoonUom, guacRecipe));		
		guacRecipe.getIngredient().add(new Ingredient("Cilantro", new BigDecimal(1), eachUom, guacRecipe));		
		guacRecipe.getIngredient().add(new Ingredient("Freshly grated black pepper", new BigDecimal(2), eachUom, guacRecipe));		
		guacRecipe.getIngredient().add(new Ingredient("ripe tomatoes", new BigDecimal(5), eachUom, guacRecipe));		
		guacRecipe.getIngredient().add(new Ingredient("Minced Garlic", new BigDecimal(2), teaSpoonUom, guacRecipe));	
		
		guacRecipe.getCategories().add(americanCategory);
		guacRecipe.getCategories().add(mexicanCategory);
		
		recipes.add(guacRecipe);	
		
		// Next New Recipe Details
		Recipe vangibathRecipe = new Recipe();
		vangibathRecipe.setDescription("Perfect Easy Vangibath");
		vangibathRecipe.setPrepTime(05);
		vangibathRecipe.setCookTime(30);
		vangibathRecipe.setServings(4);
		vangibathRecipe.setSource("internet");
		vangibathRecipe.setUrl("https://indianhealthyrecipes.com/vangi-bath-recipe-brinjal-fried-rice-recipe/");
		vangibathRecipe.setDifficulty(Difficulty.EASY);
		vangibathRecipe.setDirections("Make rice for vangi bath recipe\n" + 
				"Wash and cook rice al dente in the usual way.\n" + 
				"\n" + 
				" Do not make the rice mushy. Cool this completely.\n" + 
				"How to make vangi bath powder\n" + 
				"Dry roast coriander seeds until crunchy and aromatic. Move them to a plate. \n" + 
				"\n" + 
				"Next roast chana dal and urad dal until half done. \n" + 
				"\n" + 
				"Then add the red chilies and fry until the dal turns golden. \n" + 
				"Lastly add methi, cumin, cloves, and cinnamon. Saute till the methi seeds turn aromatic. \n" + 
				"\n" + 
				"Cool all these completely. Powder them finely in a mixer or blender.  Set aside the vangi powder.\n" + 
				"\n" + 
				"Make tempering for vangi bath\n" + 
				"Pour oil to a hot pan. \n" + 
				"\n" + 
				"Add in cumin, cardamoms and bay leaf. Or you can add in cumin, mustard, chana dal, urad dal and peanuts.  Saute till they sizzle and the nuts turn golden. \n" + 
				"\n" + 
				"Fry green chilies and onions till they turn golden or transparent.\n" + 
				"How to make vangi bath\n" + 
				"Add chopped brinjal, green peas and sprinkle salt, turmeric. Fry for 2 to 3 minutes.\n" + 
				"Cook covered until the brinjals are soft cooked.\n" + 
				"Time to add in the vangi bath powder and fry till it begins to smell good. You can sprinkle 1 to 2 tbsp. water to make the mixture moist. This is optional.\n" + 
				"Switch off the heat, add rice and lemon juice.\n" + 
				"Mix up everything well, adjust salt and lemon juice.\n" + 
				"Serve vangi bath hot or cold with some papads and curd.");
		
		Notes vangibathNotes = new Notes();
		vangibathNotes.setRecipeNotes("Recipe notes for vangi bath\n" + 
				"If using Mtr powder, please use as needed. The spice levels in the mtr pack differs from country to country.\n" + 
				"You can choose any variety of brinjal - purple or green. But tender brinjal will taste better.");

		vangibathNotes.setRecipe(vangibathRecipe);
		vangibathRecipe.setNotes(vangibathNotes);

		vangibathRecipe.getIngredient().add(new Ingredient("Raw Rice", new BigDecimal(2), cupsUom, vangibathRecipe));		
		vangibathRecipe.getIngredient().add(new Ingredient("Oil", new BigDecimal(3), tablespoonUom,vangibathRecipe));		
		vangibathRecipe.getIngredient().add(new Ingredient("Medium Onion Thinly Sliced", new BigDecimal(1), eachUom,vangibathRecipe));		
		vangibathRecipe.getIngredient().add(new Ingredient("Green Chilli Slit(optional)", new BigDecimal(1), eachUom,vangibathRecipe));		
		vangibathRecipe.getIngredient().add(new Ingredient("Brinjals", new BigDecimal(250), gramUom,vangibathRecipe));		
		vangibathRecipe.getIngredient().add(new Ingredient("Green Peas", new BigDecimal(1), cupsUom,vangibathRecipe));		
		vangibathRecipe.getIngredient().add(new Ingredient("Lemon juice as needed or 1 tbsp tamarind paste", new BigDecimal(2), tablespoonUom,vangibathRecipe));		
		vangibathRecipe.getIngredient().add(new Ingredient("Salt to taste", new BigDecimal(1), teaSpoonUom,vangibathRecipe));		
		vangibathRecipe.getIngredient().add(new Ingredient("Dry coconut (optional, adds flavor and taste)", new BigDecimal(1), tablespoonUom,vangibathRecipe));	
		vangibathRecipe.getIngredient().add(new Ingredient("Curry leaves", new BigDecimal(10), eachUom,vangibathRecipe));	
		vangibathRecipe.getIngredient().add(new Ingredient("Cumin or jeera", new BigDecimal(1), teaSpoonUom,vangibathRecipe));	
		vangibathRecipe.getIngredient().add(new Ingredient("Chana dal & urad dal", new BigDecimal(1), tablespoonUom,vangibathRecipe));	

		vangibathRecipe.getCategories().add(indianCategory);
		
		recipes.add(vangibathRecipe);

		return recipes;
		
	}



}
