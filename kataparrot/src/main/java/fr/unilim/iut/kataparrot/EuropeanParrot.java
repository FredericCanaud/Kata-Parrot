package fr.unilim.iut.kataparrot;

public class EuropeanParrot extends Parrot {
	
	public EuropeanParrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage) {
		super(_type, numberOfCoconuts, voltage, false);
	}

	@Override
	public double getSpeed() {
		return getBaseSpeed();
	}
}
