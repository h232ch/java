package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		//GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); 생성자의 <> 생략가능
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder); //powderPrinter에 powder Setting
		System.out.println(powderPrinter);
		powderPrinter.printing();
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		//GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); 생성자의 <> 생략가능
		Plastic plastic = new Plastic();
		plasticPrinter.setMaterial(plastic); //powderPrinter에 powder Setting
		System.out.println(plasticPrinter);
		plasticPrinter.printing();
		
	}
}
