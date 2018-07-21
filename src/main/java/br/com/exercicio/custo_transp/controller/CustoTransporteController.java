package br.com.exercicio.custo_transp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.exercicio.custo_transp.model.CaminhaoBau;
import br.com.exercicio.custo_transp.model.CaminhaoCacamba;
import br.com.exercicio.custo_transp.model.Carreta;
import br.com.exercicio.custo_transp.model.enums.EnumTipoVeiculo;
import br.com.exercicio.custo_transp.view.VeiculoDTO;

@Controller
public class CustoTransporteController {

	@RequestMapping(value = "/")
	public String index(Model model) {
		model.addAttribute("veiculo", new VeiculoDTO());
		model.addAttribute("listaTipos", EnumTipoVeiculo.values());
		return "index";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.POST, params="action=calcular")
	public String calcular(@ModelAttribute VeiculoDTO veiculoDTO, Model model) {
		veiculoDTO.setCustoTransporte(getCustoTransporte(veiculoDTO));	
		model.addAttribute("veiculo", veiculoDTO);
		model.addAttribute("listaTipos", EnumTipoVeiculo.values());
		return "index";
	}
	
	public Double getCustoTransporte(VeiculoDTO veiculoDTO) {
		if	(veiculoDTO.getTipoVeiculo().equals(EnumTipoVeiculo.CAMINHAO_BAU)) {
			return getCustoTransporteCaminhaoBau(veiculoDTO);
		}else if	(veiculoDTO.getTipoVeiculo().equals(EnumTipoVeiculo.CAMINHAO_CACAMBA)) {
			return getCustoTransporteCaminhaoCacamba(veiculoDTO);
		}else if	(veiculoDTO.getTipoVeiculo().equals(EnumTipoVeiculo.CARRETA)) {
			return getCustoTransporteCarreta(veiculoDTO);
		}
		return 0.0;
	}

	private Double getCustoTransporteCarreta(VeiculoDTO veiculoDTO) {
		return new Carreta(veiculoDTO.getDistanciaRodoviaPavimentada(), 
							veiculoDTO.getDistanciaRodoviaNaoPavimentada(), 
							veiculoDTO.getCarga())
				.getCustoTransporte();
	}

	private Double getCustoTransporteCaminhaoCacamba(VeiculoDTO veiculoDTO) {
		return new CaminhaoCacamba(veiculoDTO.getDistanciaRodoviaPavimentada(), 
									veiculoDTO.getDistanciaRodoviaNaoPavimentada(), 
									veiculoDTO.getCarga())
				.getCustoTransporte();
	}

	private Double getCustoTransporteCaminhaoBau(VeiculoDTO veiculoDTO) {
		return new CaminhaoBau(veiculoDTO.getDistanciaRodoviaPavimentada(), 
								veiculoDTO.getDistanciaRodoviaNaoPavimentada(), 
								veiculoDTO.getCarga())
				.getCustoTransporte();
	}
}
