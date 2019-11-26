package fr.unilim.iut.kataparrot;

public abstract class Parrot {

	public static final double BASE_SPEED = 12.0;
	private ParrotTypeEnum type;

	public Parrot(ParrotTypeEnum _type) {
		this.type = _type;
	}

	public abstract double getSpeed();

}
