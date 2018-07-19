package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.services.RecipeService;

@Controller
public class RecipeController {
	
	  private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(IndexController.class);
		
		@Autowired
		private final RecipeService recipeService;

		public RecipeController(RecipeService recipeService) {
			super();
			this.recipeService = recipeService;
		}
		
		@RequestMapping("/recipe/show/{id}")
		public String getRecipeById(@PathVariable String id, Model model) {
			
			model.addAttribute("recipe", recipeService.findRecipeById(new Long(id)));
			
			log.debug("I'm in the recipe controller");
			
			return "recipe/show";
		}
		

}
