package school;

import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

//@Ignore
public class FirstDayAtSchoolTest {

	FirstDayAtSchool school = new FirstDayAtSchool();
	String[] bag1 = {"Books", "Notebooks", "Pens" /*, "Rulers" */ };
	String[] bag2 = {"Books", "Notebooks", "Pens", "Pencils"};
	
	@Test
	public void test() {
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag1, school.prepareMyBag());
	}
	
	//@Ignore
	@Test
	public void testAddPencils() {
		System.out.println("Inside testAdPencils()");
		assertArrayEquals(bag2, school.addPencils());
	}
}
