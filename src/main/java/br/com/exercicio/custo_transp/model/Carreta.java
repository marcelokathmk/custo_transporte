package br.com.exercicio.custo_transp.model;

import br.com.exercicio.custo_transp.model.impl.CustoTransporte;

public class Carreta extends Veiculo implements CustoTransporte{

	private static final long serialVersionUID = 1L;
	
	public Carreta(Double distanciaPavimentada, Double distanciaNaoPavimentada, Integer carga) {
		super(distanciaPavimentada, distanciaNaoPavimentada, carga);
	}

	@Override
	public Double getCustoTransporte() {
		return (getCustoDistanciaRodovias() * 1.12) + getCustoAdicionalSobrecargaRodovias();
	}
}
