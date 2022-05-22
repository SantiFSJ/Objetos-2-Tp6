package ar.unrn.tp6.modelo;

public class MotorElectricoAdapter extends Motor {
	MotorElectrico motorElectrico;

	public MotorElectricoAdapter(MotorElectrico motorElectrico) {
		this.motorElectrico = motorElectrico;
	}

	@Override
	public void arrancar() {
		this.motorElectrico.conectar();
		this.motorElectrico.activar();
	}

	@Override
	public void acelerar() {
		this.motorElectrico.moverMasRapido();
	}

	@Override
	public void apagar() {
		this.motorElectrico.detener();
		this.motorElectrico.desconectar();
	}
}
