package fr.unilim.iut.kataparrot;

public class AfricanParrot extends Parrot {

	private int numberOfCoconuts;

	private static final double AFRICAN_PARROT_LOAD_FACTOR = 9.0;
	
	public AfricanParrot(int numberOfCoconuts) {
		this.numberOfCoconuts = numberOfCoconuts;
	}
	
	@Override
	public double getSpeed() {
		return Math.max(0, BASE_SPEED - AFRICAN_PARROT_LOAD_FACTOR * numberOfCoconuts);
	}
}
