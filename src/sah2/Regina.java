package sah2;

public class Regina extends Piesa {
	
	public Regina(int coordX, int coordY) {
		super(coordX, coordY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean mutaPiesa(int new_coordX, int new_coordY) {
		if (new_coordX - getX() == new_coordY - getY()) {
			return true;
		}
		if (new_coordX == getX()) {
			return true;
		}
		if (new_coordY == getY()) {
			return true;
		}
		return false;
	}
}
