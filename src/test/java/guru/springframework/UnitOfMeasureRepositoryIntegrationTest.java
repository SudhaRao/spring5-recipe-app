package guru.springframework;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import guru.springframework.domain.uom.UnitOfMeasure;
import guru.springframework.repositories.UnitOfMeasureRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIntegrationTest{
	
	@Autowired
	UnitOfMeasureRepository unitOfMeasureRepsoritory;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void findByDescription() throws Exception{
		Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepsoritory.findByDescription("Teaspoon");
		assertEquals("Teaspoon", uomOptional.get().getDescription());
	}
	
	@Test
	public void findByDescriptionCup() throws Exception{
		Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepsoritory.findByDescription("Cup");
		assertEquals("Cup", uomOptional.get().getDescription());
	}

}
