package inheritance3;

//Somut s?n?f

public class EmailLogger extends Logger{
	@Override //Basedeki kodu ezmek i?in ama yazmasan da olur. Biz belli olsun diye yazd?k
    public void log() {
		System.out.println("Email logland?");
	}
}
