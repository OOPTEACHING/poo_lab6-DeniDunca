package ghiozdan;
public class TestGhiozdan {

	public static void main(String[] args) {
		Ghiozdan ghiozdan = new Ghiozdan(12);
		Caiet caiet1 = new Caiet("POO");
		Caiet caiet2 = new Caiet("AF");
		Caiet caiet3 = new Caiet("BD");

		Manual manual1 = new Manual("POO-manual");
		Manual manual2 = new Manual("AF-manual");

		ghiozdan.add(caiet1);
		ghiozdan.add(manual1);
		ghiozdan.add(caiet2);
		ghiozdan.add(manual2);
		ghiozdan.add(caiet3);

		ghiozdan.getNrRechizite();
		ghiozdan.getNrCaiet();
		ghiozdan.getNrManuale();

		ghiozdan.listItems();
		ghiozdan.listCaiet();
		ghiozdan.listManual();
	}
}
