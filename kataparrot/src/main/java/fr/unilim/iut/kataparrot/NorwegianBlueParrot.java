package fr.unilim.iut.kataparrot;

public class NorwegianBlueParrot extends Parrot {

	private boolean isNailed;

	public NorwegianBlueParrot(ParrotTypeEnum _type, double voltage, boolean isNailed) {
		super(_type, voltage);
		this.isNailed = isNailed;
	}

	@Override
	public double getSpeed() {
		return (isNailed) ? 0 : getBaseSpeed(voltage);
	}
		
}
