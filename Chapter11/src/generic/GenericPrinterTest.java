package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		//GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); �������� <> ��������
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder); //powderPrinter�� powder Setting
		System.out.println(powderPrinter);
		powderPrinter.printing();
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		//GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); �������� <> ��������
		Plastic plastic = new Plastic();
		plasticPrinter.setMaterial(plastic); //powderPrinter�� powder Setting
		System.out.println(plasticPrinter);
		plasticPrinter.printing();
		
	}
}
