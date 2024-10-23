package interfacedemo;

public class User {

	public static void main(String[] args) {
		Lenovo l = new Lenovo();
		l.copy();
		l.paste();
		l.cut();
		l.keyboard();
		l.security();
		Laptop.audio();
		
		Hp h = new Hp();
		h.copy();
		h.keyboard();
	}

}
