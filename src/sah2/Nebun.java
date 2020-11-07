package sah2;

public class Nebun extends Piesa {
	

	public Nebun(int coordX, int coordY) {
		super(coordX, coordY);
		
	}

	@Override
	public boolean mutaPiesa(int new_coordX, int new_coordY) {
		if (new_coordX - getX() == new_coordY - getY()) {
			return true;
		}
		return false;
	}
}
