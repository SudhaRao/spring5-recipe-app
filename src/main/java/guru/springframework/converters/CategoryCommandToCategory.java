package guru.springframework.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import guru.springframework.commands.CategoryCommand;
import guru.springframework.domain.category.Category;
import lombok.Synchronized;

public class CategoryCommandToCategory implements Converter<CategoryCommand, Category>{
	
	@Synchronized // This help to run in the multithreaded environment
	@Nullable
	@Override
	public Category convert(CategoryCommand source) {
		if(source == null) {
			return null;
		}
		
		final Category category = new Category();
		category.setId(source.getId());
		category.setDescription(source.getDescription());
		category.setRecipes(source.getRecipes());
		
		
		return category;
	}

}
