package fr.unilim.iut.kataparrot;

public class NorwegianBlueParrot extends Parrot {

	private boolean isNailed;
	private double voltage;
	
	public NorwegianBlueParrot(ParrotTypeEnum _type, double voltage, boolean isNailed) {
		super(_type);
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	@Override
	public double getSpeed() {
		return (isNailed) ? 0 : getBaseSpeed(voltage);
	}
	
	protected double getBaseSpeed(double voltage) {
		return Math.min(24.0, voltage * BASE_SPEED);
	}
		
}
