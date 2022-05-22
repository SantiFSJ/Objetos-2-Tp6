package ar.unrn.tp6.modelo;

public class MotorEconomico extends Motor {
	@Override
	public void arrancar() {
		System.out.println("Esta Arrancando el motor Economico");
	}

	@Override
	public void acelerar() {
		System.out.println("Esta Acelerando el motor Economico");
	}

	@Override
	public void apagar() {
		System.out.println("Se Apago el motor Economico");
	}

}
