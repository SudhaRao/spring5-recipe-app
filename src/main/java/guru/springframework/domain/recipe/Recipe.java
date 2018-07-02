package guru.springframework.domain.recipe;

import java.util.Arrays;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import guru.springframework.domain.ingredient.Ingredient;
import guru.springframework.domain.notes.Notes;
import guru.springframework.enumeration.*;

@Entity
public class Recipe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String description;
	private Integer prepTime;
	private Integer cookTime;
	private Integer servings;
	private String source;
	private String url;
	
	@Lob
	private String directions;
	
	@Lob
	private Byte[] image;
	
	@Enumerated(value=EnumType.STRING)
	private Difficulty difficulty;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Notes notes;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="recipe")
	private Set<Ingredient> ingredient;
	
	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Recipe(String description, Integer prepTime, Integer cookTime, Integer servings, String source, String url,
			String directions, Byte[] image, Notes notes) {
		super();
		this.description = description;
		this.prepTime = prepTime;
		this.cookTime = cookTime;
		this.servings = servings;
		this.source = source;
		this.url = url;
		this.directions = directions;
		this.image = image;
		this.notes = notes;
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
	public Integer getPrepTime() {
		return prepTime;
	}
	public void setPrepTime(Integer prepTime) {
		this.prepTime = prepTime;
	}
	public Integer getCookTime() {
		return cookTime;
	}
	public void setCookTime(Integer cookTime) {
		this.cookTime = cookTime;
	}
	public Integer getServings() {
		return servings;
	}
	public void setServings(Integer servings) {
		this.servings = servings;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDirections() {
		return directions;
	}
	public void setDirections(String directions) {
		this.directions = directions;
	}
	public Byte[] getImage() {
		return image;
	}
	public void setImage(Byte[] image) {
		this.image = image;
	}
	public Notes getNotes() {
		return notes;
	}
	public void setNotes(Notes notes) {
		this.notes = notes;
	}
	
	
	public Set<Ingredient> getIngredient() {
		return ingredient;
	}


	public void setIngredient(Set<Ingredient> ingredient) {
		this.ingredient = ingredient;
	}
	
	public Difficulty getDifficulty() {
		return difficulty;
	}


	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cookTime == null) ? 0 : cookTime.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((directions == null) ? 0 : directions.hashCode());
		result = prime * result + Arrays.hashCode(image);
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		result = prime * result + ((prepTime == null) ? 0 : prepTime.hashCode());
		result = prime * result + ((servings == null) ? 0 : servings.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		Recipe other = (Recipe) obj;
		if (cookTime == null) {
			if (other.cookTime != null)
				return false;
		} else if (!cookTime.equals(other.cookTime))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (directions == null) {
			if (other.directions != null)
				return false;
		} else if (!directions.equals(other.directions))
			return false;
		if (!Arrays.equals(image, other.image))
			return false;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		if (prepTime == null) {
			if (other.prepTime != null)
				return false;
		} else if (!prepTime.equals(other.prepTime))
			return false;
		if (servings == null) {
			if (other.servings != null)
				return false;
		} else if (!servings.equals(other.servings))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Recipe [description=" + description + ", prepTime=" + prepTime + ", cookTime=" + cookTime
				+ ", servings=" + servings + ", source=" + source + ", url=" + url + ", directions=" + directions
				+ ", image=" + Arrays.toString(image) + ", notes=" + notes + "]";
	}
	
	
	
}
