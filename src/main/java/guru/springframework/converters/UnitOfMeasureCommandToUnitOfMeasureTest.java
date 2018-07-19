package guru.springframework.converters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.commands.UnitOfMeasureCommand;
import guru.springframework.domain.uom.UnitOfMeasure;

public class UnitOfMeasureCommandToUnitOfMeasureTest {
	
	public static final String DESCRIPTION = "description";
	public static final Long LONG_VALUE = new Long(1l);
	
	UnitOfMeasureCommandToUnitOfMeasure converter;

	@Before
	public void setUp() throws Exception {
		converter = new UnitOfMeasureCommandToUnitOfMeasure();
	}

	@Test
	public void testNullParameters() throws Exception{
		assertNull(converter.convert(null));
	}
	
	@Test
	public void testEmptyObject() throws Exception{
		assertNotNull(converter.convert(new UnitOfMeasureCommand()));
	}
	
	@Test
	public void convert() throws Exception{
		
		//given
		UnitOfMeasureCommand uomCommand = new UnitOfMeasureCommand();
		uomCommand.setId(LONG_VALUE);
		uomCommand.setDescription(DESCRIPTION);
		
		//when
		UnitOfMeasure uom = converter.convert(uomCommand);
		assertNotNull(uom);
		assertEquals(LONG_VALUE, uom.getId());
		assertEquals(DESCRIPTION, uom.getDescription());
	}

}
