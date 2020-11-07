package sah2;

public class Rege extends Piesa {

	public Rege(int coordX, int coordY) {
		super(coordX, coordY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean mutaPiesa(int new_coordX, int new_coordY) {
		if (Math.sqrt(Math.pow(Math.abs((new_coordX - getX())), 2)) + Math.pow(Math.abs((new_coordY - getY())), 2) != Math.sqrt(2)) {
			return false;
		}
		return false;
	}

}
