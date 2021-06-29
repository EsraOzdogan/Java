package inheritance3;

//Somut sýnýf

public class FileLogger extends Logger{
	@Override //Basedeki kodu ezmek için ama yazmasan da olur. Biz belli olsun diye yazdýk
    public void log() {
		System.out.println("File loglandý");
	}

}
