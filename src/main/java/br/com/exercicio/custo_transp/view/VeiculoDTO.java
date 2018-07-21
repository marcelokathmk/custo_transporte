package br.com.exercicio.custo_transp.view;

import java.io.Serializable;

import br.com.exercicio.custo_transp.model.enums.EnumTipoVeiculo;

public class VeiculoDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Double distanciaRodoviaPavimentada;
	
	private Double distanciaRodoviaNaoPavimentada;
	
	private Integer carga;
	
	private EnumTipoVeiculo tipoVeiculo;
	
	private Double custoTransporte;
	
	public VeiculoDTO() {
		this.custoTransporte = 0.0;
	}
	
	public VeiculoDTO(Double distanciaRodoviaPavimentada, Double distanciaRodoviaNaoPavimentada, Integer carga, EnumTipoVeiculo tipoVeiculo) {
		this.distanciaRodoviaPavimentada = distanciaRodoviaPavimentada;
		this.distanciaRodoviaNaoPavimentada = distanciaRodoviaNaoPavimentada;
		this.carga = carga;
		this.tipoVeiculo = tipoVeiculo;
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

	public Integer getCarga() {
		return carga;
	}

	public void setCarga(Integer carga) {
		this.carga = carga;
	}

	public EnumTipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(EnumTipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public Double getCustoTransporte() {
		return custoTransporte;
	}

	public void setCustoTransporte(Double custoTransporte) {
		this.custoTransporte = custoTransporte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carga == null) ? 0 : carga.hashCode());
		result = prime * result
				+ ((distanciaRodoviaNaoPavimentada == null) ? 0 : distanciaRodoviaNaoPavimentada.hashCode());
		result = prime * result + ((distanciaRodoviaPavimentada == null) ? 0 : distanciaRodoviaPavimentada.hashCode());
		result = prime * result + ((tipoVeiculo == null) ? 0 : tipoVeiculo.hashCode());
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
		VeiculoDTO other = (VeiculoDTO) obj;
		if (carga == null) {
			if (other.carga != null)
				return false;
		} else if (!carga.equals(other.carga))
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
		if (tipoVeiculo != other.tipoVeiculo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VeiculoDTO [distanciaRodoviaPavimentada=" + distanciaRodoviaPavimentada
				+ ", distanciaRodoviaNaoPavimentada=" + distanciaRodoviaNaoPavimentada + ", carga=" + carga
				+ ", tipoVeiculo=" + tipoVeiculo + "]";
	}
}
