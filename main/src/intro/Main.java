package intro;

public class Main {

	public static void main(String[] args) {

		System.out.println("hello world!");
		
		String ortaMetin ="ilginizi çekebilir";
		String altMetin ="vade";
		
		System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarDun = 18.20;
		double dolarBugun = 18.20;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) { //true
			okYonu ="down.svg";
			System.out.println(okYonu);
			
		} else if(dolarBugun<dolarDun) {
			okYonu ="up.svg";
			System.out.println(okYonu);
			
		}
		else {
			okYonu ="egual.svg";
			System.out.println(okYonu);

		}
		
		//array
		
		String[] krediler = {"hızlı kredi","maaş","mutlu emekli"};
		
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
			
		}
	}

}
