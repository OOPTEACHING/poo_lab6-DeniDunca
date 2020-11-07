package ghiozdan;

public class Caiet extends Rechizita {

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return eticheta + " Caiet";
	}
	public Caiet (String eticheta)
	{
		this.eticheta = eticheta;
	}
}
