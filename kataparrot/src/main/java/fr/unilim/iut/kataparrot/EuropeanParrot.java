package fr.unilim.iut.kataparrot;

public class EuropeanParrot extends Parrot {
	
	public EuropeanParrot(ParrotTypeEnum _type, double voltage) {
		super(_type, voltage);
	}

	@Override
	public double getSpeed() {
		return getBaseSpeed();
	}
}
