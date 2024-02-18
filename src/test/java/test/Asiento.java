package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	void setColor(String color) {
		if (color == "verde" || color == "amarillo" || color == "blanco" || color == "negro" || color == "rojo") {
			this.color = color;
		}
	}
}
