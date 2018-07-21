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
		if	(veiculoDTO.getTipoVeiculo().equals(EnumTipoVeiculo.CAMINHAO_BAU)) {
			
			CaminhaoBau cb = new CaminhaoBau(
					veiculoDTO.getDistanciaRodoviaPavimentada(), 
					veiculoDTO.getDistanciaRodoviaNaoPavimentada(), 
					veiculoDTO.getCarga());
			veiculoDTO.setCustoTransporte(cb.getCustoTransporte());
		}else if	(veiculoDTO.getTipoVeiculo().equals(EnumTipoVeiculo.CAMINHAO_CACAMBA)) {
			
			CaminhaoCacamba cc = new CaminhaoCacamba(
					veiculoDTO.getDistanciaRodoviaPavimentada(), 
					veiculoDTO.getDistanciaRodoviaNaoPavimentada(), 
					veiculoDTO.getCarga());
			veiculoDTO.setCustoTransporte(cc.getCustoTransporte());
		}else if	(veiculoDTO.getTipoVeiculo().equals(EnumTipoVeiculo.CARRETA)) {
			
			Carreta c = new Carreta(
					veiculoDTO.getDistanciaRodoviaPavimentada(), 
					veiculoDTO.getDistanciaRodoviaNaoPavimentada(), 
					veiculoDTO.getCarga());
			veiculoDTO.setCustoTransporte(c.getCustoTransporte());
		}
		
		model.addAttribute("veiculo", veiculoDTO);
		model.addAttribute("listaTipos", EnumTipoVeiculo.values());
		return "index";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.POST, params="action=limpar")
	public String limpar(Model model) {
		return this.index(model);
	}
}
