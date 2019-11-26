package fr.unilim.iut.kataparrot;

public class EuropeanParrot extends Parrot {
	
	public EuropeanParrot(ParrotTypeEnum _type) {
		super(_type);
	}

	@Override
	public double getSpeed() {
		return BASE_SPEED;
	}
}
