package fr.unilim.iut.kataparrot;

public class AfricanParrot extends Parrot {

	public AfricanParrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage) {
		super(_type, numberOfCoconuts, voltage, false);
	}
	
	@Override
	public double getSpeed() {
		return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
	}
}
