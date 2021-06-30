package intro;


public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself
		
		//variables
		String internetSubeButonu ="internet subeye gir";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;

		int vade = 36;
		boolean dustuMu = true;
		
		System.out.println(internetSubeButonu);
		System.out.println(dolarDun);
		
		
		//boundary analysis '=' durumu
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düstü resmi");
		}else if(dolarBugun>dolarDun){
			System.out.println("Dolar yükseldi resmi");
		}	
		else {
			System.out.println("Dolar esittir resmi");
		}
		
		//lists
		String kredi1 ="Hýzlý Kredi";
		String kredi2 ="Mutlu Emekli Kredisi";
		String kredi3 ="Konut Kredisi";
		String kredi4 ="Çiftçi Kredisi";
		String kredi5 ="Msb Kredisi";
		String kredi6 ="Meb Kredisi";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		
		String[] krediler = {"Hýzlý Kredi","Mutlu Emekli Kredisi","Konut Kredisi","Konut Kredisi","Çiftçi Kredisi","Msb Kredisi","Meb Kredisi"};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);	
		}
		
		for(int i=0; i<krediler.length;i++) {
			System.out.println(krediler[i]);	
		}


		//deger tip- int, booolean, byte 
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1); //20
		
		//arrrayler referans tip - adres ile atama // array, class, abstract class, structure
		int[] sayilar1 = {1 ,2, 3, 4, 5};
		int[] sayilar2 = {10 ,20, 30, 40, 50};
		sayilar1 = sayilar2; //iki dizide ayný 102 numaralý adresi tutuyor artýk //101 garbage 'a gidiyor
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]); //100

		

		//stringler array gibi olsa da arka planda char olarak tutulur ve istisna olara bir deger tiptir- value type
		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2;
		System.out.println(sehir1); //ÝStanbul


	}

}
