package fr.unilim.iut.kataparrot;

public class Parrot {

	private ParrotTypeEnum type;
	protected double voltage;

	public Parrot(ParrotTypeEnum _type, double voltage) {
		this.type = _type;
		this.voltage = voltage;
	}

	public double getSpeed() {
		switch (type) {
		case EUROPEAN:
			throw new RuntimeException("Should be unreachable");
		case AFRICAN:
			throw new RuntimeException("Should be unreachable");
		case NORWEGIAN_BLUE:
			throw new RuntimeException("Should be unreachable");		}
		throw new RuntimeException("Should be unreachable");
	}

	protected double getBaseSpeed(double voltage) {
		return Math.min(24.0, voltage * getBaseSpeed());
	}

	protected double getBaseSpeed() {
		return 12.0;
	}

}
