package sah2;

public class Test {
	public static void main(String[] args) {
		
		TablaSah tabla = new TablaSah(8,8);
		
		Cal cal1 = new Cal(0, 1);
		Nebun nebun1 = new Nebun(0,2);
		
		if(cal1.mutaPiesa(2, 2) == true)
		{
			System.out.println("A fost mutat calul");
		}
		else
		{
			System.out.println("Nu a fost mutat calul");
		}


	}

}
