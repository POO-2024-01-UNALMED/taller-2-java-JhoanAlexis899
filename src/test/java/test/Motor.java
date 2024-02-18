package test;

public class Motor {
	String tipo;
	int precio;
	int registro;
	
	void cambiarRegistro(int numero) {
		this.registro = numero;
	}
	void asignarTipo(String tipo) {
		if (tipo == "electrico" || tipo == "gasolina") {
			this.tipo = tipo;
		}
	}
}
