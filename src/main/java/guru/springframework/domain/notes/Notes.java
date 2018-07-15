package guru.springframework.domain.notes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import guru.springframework.domain.recipe.Recipe;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(exclude= {"recipe"})
@ToString
@Entity
public class Notes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private Recipe recipe;
	@Lob
	private String recipeNotes;

	
	public Notes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Notes(Recipe recipe, String recipeNotes) {
		super();
		this.recipe = recipe;
		this.recipeNotes = recipeNotes;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


	public Recipe getRecipe() {
		return recipe;
	}
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	public String getRecipeNotes() {
		return recipeNotes;
	}
	public void setRecipeNotes(String recipeNotes) {
		this.recipeNotes = recipeNotes;
	}
	
	//Because @Data is used at the class level, the project lombok takes care of importing getters and setters and 
	// hashcode and equal and toSTring methods.

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((recipe == null) ? 0 : recipe.hashCode());
		result = prime * result + ((recipeNotes == null) ? 0 : recipeNotes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Notes other = (Notes) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (recipe == null) {
			if (other.recipe != null)
				return false;
		} else if (!recipe.equals(other.recipe))
			return false;
		if (recipeNotes == null) {
			if (other.recipeNotes != null)
				return false;
		} else if (!recipeNotes.equals(other.recipeNotes))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Notes [id=" + id + ", recipe=" + recipe + ", recipeNotes=" + recipeNotes + "]";
	}
	
	protected boolean canEqual(Object other) {
		return other instanceof Notes;
	}*/
	
}
