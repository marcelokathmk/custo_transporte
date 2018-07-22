package br.com.exercicio.custo_transp.model.exceptions;

public class CampoNuloCustoTransporteException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public CampoNuloCustoTransporteException(String campo) {
		super("Operação interrompida. O campo "+ campo +" está com valor nulo.");
	}
}
