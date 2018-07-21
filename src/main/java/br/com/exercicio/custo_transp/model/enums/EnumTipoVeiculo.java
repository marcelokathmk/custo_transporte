package br.com.exercicio.custo_transp.model.enums;

public enum EnumTipoVeiculo {

	CAMINHAO_BAU(1, "Caminhão Baú"),
	CAMINHAO_CACAMBA(2, "Caminha Caçamba"),
	CARRETA(3, "Carreta");
	
	private Integer codigo;
	private String descricao;
	
	private EnumTipoVeiculo(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
