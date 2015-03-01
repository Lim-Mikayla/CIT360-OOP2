package ownExample;

public class WaterIntake { 
	
	public int weightInPounds(int weight) {
		int recommendedWaterIntake = (int) (weight * 0.5);
		System.out.println("Your recommended daily water intake is " 
				+ recommendedWaterIntake +" ounces.");
		return recommendedWaterIntake;
	}
	
}