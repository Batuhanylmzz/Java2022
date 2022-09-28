package methods;

public class Main {
	
	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
	
}

public static void sayiBulmaca() {
	int[] sayilar =new int[] {1,2,5,7,9,0};
	int aranacak = 6;
	boolean varMi=false;
	
	for(int sayi : sayilar) {
		if(sayi==aranacak) {
			varMi = true;
			break;
			
		}
	}
	if(varMi) {
		System.out.println("sayi mevcuttur");
	}else {
		System.out.println("sayi mevcut değildir");
		
		}

	}
	public static void mesajVer(int aranacak) {
		System.out.println("sayi mevcuttur:"+aranacak);
		
	}
}
