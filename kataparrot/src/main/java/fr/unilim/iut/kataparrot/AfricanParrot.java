package fr.unilim.iut.kataparrot;

public class AfricanParrot extends Parrot {

	private int numberOfCoconuts;

	private static final double AFRICAN_PARROT_LOAD_FACTOR = 9.0;
	
	public AfricanParrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage) {
		super(_type, voltage, false);
		this.numberOfCoconuts = numberOfCoconuts;
	}
	
	@Override
	public double getSpeed() {
		return Math.max(0, getBaseSpeed() - AFRICAN_PARROT_LOAD_FACTOR * numberOfCoconuts);
	}
}
