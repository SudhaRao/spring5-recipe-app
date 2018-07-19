package guru.springframework.commands;

import java.math.BigDecimal;

import guru.springframework.domain.recipe.Recipe;
import guru.springframework.domain.uom.UnitOfMeasure;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class IngredientCommand {
	
	private Long id;
	private String description;
	private BigDecimal amount;
	private Recipe recipe;
	private UnitOfMeasure uom;
	
	public IngredientCommand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IngredientCommand(Long id, String description, BigDecimal amount, Recipe recipe, UnitOfMeasure uom) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.recipe = recipe;
		this.uom = uom;
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

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public UnitOfMeasure getUom() {
		return uom;
	}

	public void setUom(UnitOfMeasure uom) {
		this.uom = uom;
	}
	
	
}
