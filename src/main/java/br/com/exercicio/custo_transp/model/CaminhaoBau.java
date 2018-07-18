package br.com.exercicio.custo_transp.model;

import br.com.exercicio.custo_transp.model.impl.CustoTransporte;

public class CaminhaoBau extends Veiculo implements CustoTransporte{

	private static final long serialVersionUID = 1L;

	public CaminhaoBau(Double distanciaPavimentada, Double distanciaNaoPavimentada, Integer carga) {
		super(distanciaPavimentada, distanciaNaoPavimentada, carga);
	}

	@Override
	public Double getCustoTransporte() {
		return (getCustoDistanciaRodovias() * 1) + getCustoAdicionalSobrecargaRodovias();
	}
}
