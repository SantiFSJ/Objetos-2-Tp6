package ar.unrn.tp6.main;

import ar.unrn.tp6.modelo.MotorComun;
import ar.unrn.tp6.modelo.MotorEconomico;
import ar.unrn.tp6.modelo.MotorElectrico;
import ar.unrn.tp6.modelo.MotorElectricoAdapter;

public class Main {
	public static void main(String[] args) {
		MotorEconomico motorEconomico = new MotorEconomico();

		motorEconomico.arrancar();
		motorEconomico.acelerar();
		motorEconomico.apagar();

		MotorComun motorComun = new MotorComun();

		motorComun.arrancar();
		motorComun.acelerar();
		motorComun.apagar();

		MotorElectrico motorElectrico = new MotorElectrico();

		MotorElectricoAdapter motorElectricoAdapter = new MotorElectricoAdapter(motorElectrico);

		motorElectricoAdapter.arrancar();
		motorElectricoAdapter.acelerar();
		motorElectricoAdapter.apagar();

	}

}
