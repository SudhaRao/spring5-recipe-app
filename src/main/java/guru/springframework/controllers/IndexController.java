package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.services.RecipeService;

@Controller
public class IndexController {
	
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	private final RecipeService recipeService;
	
	public IndexController(RecipeService recipeService) {
		
		this.recipeService = recipeService;
	}

	@RequestMapping({"","/","/index"})
	public String getIndexPage(Model model) {
		
		log.debug("I'm in the index controller");
		model.addAttribute("recipe", recipeService.getRecipes());
		
		return "index";
	}

}
