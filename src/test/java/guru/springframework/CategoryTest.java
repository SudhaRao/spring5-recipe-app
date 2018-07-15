package guru.springframework;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import guru.springframework.domain.category.Category;

public class CategoryTest {
	
	Category category;

	
	@Before
	public void setUp() {
		category = new Category();
	}
	
	
	@Test
	public void getId() throws Exception{
		
		Long idValue= 4L;
		category.setId(idValue);
		assertEquals(idValue, category.getId());
		
	}
	
	@Test
	public void getDescrption() throws Exception{
			
			String description = "	Perfect Easy Guacamole";
			category.setDescription(description);
			assertEquals(description, category.getDescription());
			
	}
	
	@Test
	public void getRecipes() throws Exception{
		
	}

}
