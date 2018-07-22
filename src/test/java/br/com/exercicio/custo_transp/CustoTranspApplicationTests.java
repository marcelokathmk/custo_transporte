package br.com.exercicio.custo_transp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.exercicio.custo_transp.model.CaminhaoBau;
import br.com.exercicio.custo_transp.model.CaminhaoCacamba;
import br.com.exercicio.custo_transp.model.Carreta;
import br.com.exercicio.custo_transp.model.exceptions.CampoNuloCustoTransporteException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustoTranspApplicationTests {

	@Test
	public void  testeSucessCustoTranspCaminhaoCacamba() {
		CaminhaoCacamba cc = new CaminhaoCacamba(100.00, 0.0, 8);
		assertEquals(cc.getCustoTransporte(), Double.valueOf(62.70));
	}
	
	@Test
	public void testeSucessCustoTranspCaminhaoBau() {
		CaminhaoBau cb = new CaminhaoBau(0.0, 60.00, 4);
		assertEquals(cb.getCustoTransporte(), Double.valueOf(37.20));
	}
	
	
	public void testeSucessoCustoTranspCarreta() {
		Carreta c = new Carreta(0.0, 180.00, 12);
		assertEquals(c.getCustoTransporte(), Double.valueOf(150.19));
	}
	
	@Test
	public void testeSucessoTranspDoisPavimentosCaminhaoBau() {
		CaminhaoBau cb = new CaminhaoBau(80.00, 20.00, 6);
		assertEquals(cb.getCustoTransporte(), Double.valueOf(57.60));
	}
	
	@Test
	public void testeSucessoTranspDoisPavimentosCaminhaoCacamba() {
		CaminhaoCacamba cc = new CaminhaoCacamba(50.00, 30.00, 5);
		assertEquals(cc.getCustoTransporte(), Double.valueOf(47.88));
	}
	
	@Test(expected = CampoNuloCustoTransporteException.class)
	public void testeExcecaoCampoNuloDistanciaRodoviaPavimentada() {
		CaminhaoBau cb = new CaminhaoBau(null, 20.00, 6);
		assertEquals(cb.getCustoTransporte(), Double.valueOf(57.60));
	}
	
	@Test(expected = CampoNuloCustoTransporteException.class)
	public void testeExcecaoCampoNuloDistanciaRodoviaNaoPavimentada() {
		CaminhaoCacamba cc = new CaminhaoCacamba(100.00, null, 8);
		assertEquals(cc.getCustoTransporte(), Double.valueOf(62.70));
	}
	
	@Test(expected = CampoNuloCustoTransporteException.class)
	public void testeExcecaoCampoNuloCargaTransportada() {
		CaminhaoBau cb = new CaminhaoBau(80.00, 20.00, null);
		assertEquals(cb.getCustoTransporte(), Double.valueOf(57.60));
	}
}
