package ghiozdan;

public class Ghiozdan {
	private Rechizita[] rechizite;
	private int index = 0;
	
	public Ghiozdan(int nrRechizite)
	{
		this.rechizite = new Rechizita[nrRechizite];
	}
	
	public void add(Caiet caiet)
	{
		if(index < rechizite.length )
		{
			this.rechizite[index] = caiet;
			index++;
			System.out.println("Caietul a fost adaugat");
		}
		else
		{
			System.out.println("Caietul nu a fost adaugat");
		}		
	}
	public void add(Manual manual)
	{
		if(index < rechizite.length )
		{
			this.rechizite[index] = manual;
			index++;
			System.out.println("Manualul a fost adaugat");
		}
		else
		{
			System.out.println("Manualul nu a fost adaugat");
		}		
	}
	public void listItems()
	{
		for(int i = 0; i < index; i++)
		{
			System.out.println(rechizite[i].eticheta);
		}
	}
	
	public void listManual()
	{
		for(int i = 0; i < index; i++)
		{
			if(rechizite[i] instanceof Manual)
			{
				System.out.println(rechizite[i].eticheta);
			}
			
		}
	}
	
	public void listCaiet()
	{
		for(int i = 0; i < index; i++)
		{
			if(rechizite[i] instanceof Caiet)
			{
				System.out.println(rechizite[i].eticheta);
			}
			
		}
	}
	
	public void getNrRechizite()
	{
		System.out.println("Nr rechizite: " + index);
	}
	
	public void getNrManuale()
	{
		int contor =0;
		for(int i = 0; i < index; i++)
		{
			if(rechizite[i] instanceof Manual)
			{	
				contor++;	
			}		
		}
		System.out.println("Nr manuale: " + contor);
	}
	
	public void getNrCaiet()
	{
		int contor =0;
		for(int i = 0; i < index; i++)
		{
			if(rechizite[i] instanceof Caiet)
			{	
				contor++;	
			}		
		}
		System.out.println("Nr caiete: " + contor);
	}
	
	
	
}
