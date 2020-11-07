package sah2;

public class Cal extends Piesa {
	
	
	public Cal(int coordX, int coordY) {
		super(coordX,coordY);
	}

	@Override
	public boolean mutaPiesa(int new_coordX, int new_coordY) {
		if (new_coordX != getX() - 1 && new_coordX != getX() + 1 && new_coordX != getX() + 2 && new_coordX != getX() - 2) {
			return false;
		}
		if (new_coordY != getY() - 2 && new_coordY != getY() + 2 && new_coordY != getY() - 1 && new_coordY != getY() + 1) {
			return false;
		}
		return false;
	}

}
