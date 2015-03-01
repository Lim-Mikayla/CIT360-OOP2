package ownExample;

import static org.junit.Assert.*;

import org.junit.Test;

public class WaterIntakeTest {

	@Test
	public void testWeightInPounds() {
		WaterIntake test = new WaterIntake() ;
		int dailyWater = test.weightInPounds(120);
		assertEquals(60, dailyWater);
	}

}
