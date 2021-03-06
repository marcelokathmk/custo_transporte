package br.com.exercicio.custo_transp.model;

import java.io.Serializable;

import br.com.exercicio.custo_transp.model.exceptions.CampoNuloCustoTransporteException;

public class Veiculo implements Serializable{

	private static final long serialVersionUID = 1L;

	private Double distanciaRodoviaPavimentada;
	
	private Double distanciaRodoviaNaoPavimentada;
	
	private Integer cargaTransportada;
	
	public Veiculo(Double distanciaPavimentada, Double distanciaNaoPavimentada, Integer carga) {
		this.distanciaRodoviaPavimentada = distanciaPavimentada;
		this.distanciaRodoviaNaoPavimentada = distanciaNaoPavimentada;
		this.cargaTransportada = carga;
	}
	
	protected Double getCustoDistanciaRodoviaPavimentada() {
		if	(this.distanciaRodoviaPavimentada == null) {
			throw new CampoNuloCustoTransporteException("distanciaRodoviaPavimentada");
		}
		return this.distanciaRodoviaPavimentada * 0.54;
	}
	
	protected Double getCustoDistanciaRodoviaNaoPavimentada() {
		if	(this.distanciaRodoviaNaoPavimentada == null) {
			throw new CampoNuloCustoTransporteException("distanciaRodoviaNaoPavimentada");
		}
		return this.distanciaRodoviaNaoPavimentada * 0.62;
	}
	
	protected Double getCustoDistanciaRodovias() {
		return getCustoDistanciaRodoviaPavimentada() +
				getCustoDistanciaRodoviaNaoPavimentada();
	}
	
	protected Double getAdicionalCargaRodoviaPavimentada() {
		if	(this.distanciaRodoviaPavimentada > 0.0 && this.cargaTransportada > 5) {
			return ((this.cargaTransportada - 5) * 0.02) * this.distanciaRodoviaPavimentada;
		}
		return 0.0;
	}
	
	protected Double getAdicionalCargaRodoviaNaoPavimentada() {
		if	(this.distanciaRodoviaNaoPavimentada > 0.0 && this.cargaTransportada > 5) {
			return ((this.cargaTransportada - 5) * 0.02) * this.distanciaRodoviaNaoPavimentada;
		}
		return 0.0;
	}
	
	protected Double getCustoAdicionalSobrecargaRodovias() {
		if	(this.cargaTransportada == null) {
			throw new CampoNuloCustoTransporteException("cargaTransportada");
		}
		return getAdicionalCargaRodoviaPavimentada() +
				getAdicionalCargaRodoviaNaoPavimentada();
	}

	public Double getDistanciaRodoviaPavimentada() {
		return distanciaRodoviaPavimentada;
	}

	public void setDistanciaRodoviaPavimentada(Double distanciaRodoviaPavimentada) {
		this.distanciaRodoviaPavimentada = distanciaRodoviaPavimentada;
	}

	public Double getDistanciaRodoviaNaoPavimentada() {
		return distanciaRodoviaNaoPavimentada;
	}

	public void setDistanciaRodoviaNaoPavimentada(Double distanciaRodoviaNaoPavimentada) {
		this.distanciaRodoviaNaoPavimentada = distanciaRodoviaNaoPavimentada;
	}

	public Integer getCargaTransportada() {
		return cargaTransportada;
	}

	public void setCargaTransportada(Integer cargaTransportada) {
		this.cargaTransportada = cargaTransportada;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cargaTransportada == null) ? 0 : cargaTransportada.hashCode());
		result = prime * result
				+ ((distanciaRodoviaNaoPavimentada == null) ? 0 : distanciaRodoviaNaoPavimentada.hashCode());
		result = prime * result + ((distanciaRodoviaPavimentada == null) ? 0 : distanciaRodoviaPavimentada.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (cargaTransportada == null) {
			if (other.cargaTransportada != null)
				return false;
		} else if (!cargaTransportada.equals(other.cargaTransportada))
			return false;
		if (distanciaRodoviaNaoPavimentada == null) {
			if (other.distanciaRodoviaNaoPavimentada != null)
				return false;
		} else if (!distanciaRodoviaNaoPavimentada.equals(other.distanciaRodoviaNaoPavimentada))
			return false;
		if (distanciaRodoviaPavimentada == null) {
			if (other.distanciaRodoviaPavimentada != null)
				return false;
		} else if (!distanciaRodoviaPavimentada.equals(other.distanciaRodoviaPavimentada))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Veiculo [distanciaRodoviaPavimentada=" + distanciaRodoviaPavimentada
				+ ", distanciaRodoviaNaoPavimentada=" + distanciaRodoviaNaoPavimentada + ", cargaTransportada="
				+ cargaTransportada + "]";
	}
}
