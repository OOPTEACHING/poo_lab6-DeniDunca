package sah2;

public class Tura extends Piesa {
	
	public Tura(int coordX, int coordY) {
		super(coordX, coordY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean mutaPiesa(int new_coordX, int new_coordY) {
		if (new_coordX == getX()) {
			return true;
		}
		if (new_coordY == getY()) {
			return true;
		}
		return false;
	}

}
