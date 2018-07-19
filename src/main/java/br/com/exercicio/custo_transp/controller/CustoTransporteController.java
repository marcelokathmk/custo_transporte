package br.com.exercicio.custo_transp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.exercicio.custo_transp.model.CaminhaoBau;
import br.com.exercicio.custo_transp.view.VeiculoDTO;

@Controller
public class CustoTransporteController {

	@RequestMapping(value = "/")
	public String index(Model model) {
		model.addAttribute("veiculo", new VeiculoDTO());
		return "index";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public String calcular(@ModelAttribute VeiculoDTO veiculoDTO, Model model) {
		CaminhaoBau cb = new CaminhaoBau(
				veiculoDTO.getDistanciaRodoviaPavimentada(), 
				veiculoDTO.getDistanciaRodoviaNaoPavimentada(), 
				veiculoDTO.getCarga());
		veiculoDTO.setCustoTransporte(cb.getCustoTransporte());
		model.addAttribute("veiculo", veiculoDTO);
		return "index";
	}
}
