package sah2;

public abstract class Piesa {

	private String numePiesa;
	private int coordX;
	private int coordY;


	public Piesa(int coordX, int coordY) {
		
	}

	public String getNumePiesa() {
		return numePiesa;
	}

	public void setNumePiesa(String numePiesa) {
		this.numePiesa = numePiesa;
	}
	
	public int getX()
	{
		return coordX;
	}
	public void setX(int coordX)
	{
		this.coordX = coordX;
	}
	
	public int getY()
	{
		return coordY;
	}
	public void setY(int coordY)
	{
		this.coordY = coordY;
	}

	public abstract boolean mutaPiesa ( int new_coordX, int new_coordY);
}
