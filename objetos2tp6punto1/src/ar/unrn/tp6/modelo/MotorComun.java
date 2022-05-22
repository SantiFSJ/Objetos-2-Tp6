package ar.unrn.tp6.modelo;

public class MotorComun extends Motor {
	@Override
	public void arrancar() {
		System.out.println("Esta Arrancando el motor Comun");
	}

	@Override
	public void acelerar() {
		System.out.println("Esta Acelerando el motor Comun");
	}

	@Override
	public void apagar() {
		System.out.println("Se Apago el motor Comun");
	}
}
