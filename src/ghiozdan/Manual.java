package ghiozdan;

public class Manual extends Rechizita {

	@Override
	public String getNume() {
		
		return eticheta + " Manual";
	}
	public Manual (String eticheta)
	{
		this.eticheta = eticheta;
	}
}
