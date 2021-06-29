package classes;

public class Main {

	public static void main(String[] args) {
		
		//classlar referans tiptir-reference type
		//sol taraf stack'de oluşuyor,stackte adres ile tutuyor-
		//sağ taraf heap'te de adres ile o nesneden örnek oluşturarak fonksiyonları gerçekleştiriyor
		//Heapte adres kullanılmazsa Garbage Collector'a gidiyor
		CustomerManager customerManager= new CustomerManager(); //örnek oluşturma, referans
		/*CustomerManager customerManager2= new CustomerManager();
		customerManager=customerManager2;*/
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//value type
		int number1=10;
		int number2=20;
		number2=number1;
		number1=30;
		System.out.println(number2); //30

		int[] numbers1 = new int[] {1,2,3};
		int[] numbers2 = new int[] {4,5,6};
		numbers2=numbers1;
		numbers1[0]=10;
		System.out.println(numbers2[0]);
		
		

	}

}

