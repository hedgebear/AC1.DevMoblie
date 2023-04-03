package testes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Control.CalculadoraImc;


public class CalculadoraImcTestes {
	
	CalculadoraImc calc;
	
	@Before
	public void setup() {
		calc = new CalculadoraImc();
	}
	
	//adultos
	
	@Test
	public void testeAdultoBaixoPesoMuitoGraveLimite() {
		Assert.assertEquals("Baixo peso muito grave", calc.calcularImc(1.4145, 32, 20, "masculino"));
		
	}
	
	@Test
	public void testeAdultoBaixoPesoGraveLimiteInferior() {
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.541, 38, 20, "masculino"));
		
	}
	
	@Test
	public void testeAdultoBaixoPesoGraveLimiteSuperior() {
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.4557, 36, 20, "feminino"));
		
	}
	@Test
	public void testeAdultoBaixoPesoLimiteInferior() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.6268, 45, 20, "masculino"));
		
	}
	
	@Test
	public void testeAdultoBaixoPesoLimiteSuperior() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.628, 49, 20, "feminino"));
		
	}
	@Test
	public void testeAdultoPesoNormalLimiteInferior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.6129, 65, 20, "masculino"));
		
	}
	
	@Test
	public void testeAdultoPesoNormalLimiteSuperior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.6129, 65, 20, "feminino"));
		
	}
	
	@Test
	public void testeAdultoSobrepesoLimiteInferior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.6124, 65, 20, "masculino"));
		
	}
	
	@Test
	public void testeAdultoSobrepesoLimiteSuperior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.6128, 78, 20, "feminino"));
		
	}
	@Test
	public void testeAdultoObesidadeGrau1LimiteInferior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.6124, 78, 20, "masculino"));
		
	}
	
	@Test
	public void testeAdultoObesidadeGrau1LimiteSuperior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.6127, 91, 20, "feminino"));
		
	}
	
	@Test
	public void testeAdultoObesidadeGrau2LimiteInferior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.6212, 92, 20, "masculino"));
		
	}
	
	@Test
	public void testeAdultoObesidadeGrau2LimiteSuperior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.629, 106, 20, "feminino"));
		
	}
	
	@Test
	public void testeAdultoObesidadeGrau3Limite() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.6278, 106, 20, "masculino"));
		
	}
	
	//idosas
	
	@Test
	public void testeIdosoFBaixoPesoLimite() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.638, 58, 70, "feminino"));
		
	}
	
	@Test
	public void testeIdosoFPesoNormalLimiteInferior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.6236, 58, 70, "feminino"));
		
	}
	
	@Test
	public void testeIdosoFPesoNormalLimiteSuperior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.6217, 71, 70, "feminino"));
		
	}
	
	@Test
	public void testeIdosoFSobrepesoLimiteInferior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.62987, 72, 70, "feminino"));
		
	}
	
	@Test
	public void testeIdosoFSobrepesoLimiteSuperior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.6394, 86, 70, "feminino"));
		
	}
	
	@Test
	public void testeIdosoFObesidadeGrauILimiteInferior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.65, 88, 70, "feminino"));
		
	}
	
	@Test
	public void testeIdosoFObesidadeGrauILimiteSuperior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.6192, 97, 70, "feminino"));
		
	}
	
	@Test
	public void testeIdosoFObesidadeGrauIILimiteInferior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.615, 97, 70, "feminino"));
		
	}
	@Test
	public void testeIdosoFObesidadeGrauIILimiteSuperior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.6277, 111, 70, "feminino"));
		
	}
	
	@Test
	public void testeIdosoFObesidadeGrauIIILimite() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.6547, 115, 70, "feminino"));
		
	}
	
	//idosos
	
	@Test
	public void testeIdosoMBaixoPesoLimite() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.511, 50, 70, "masculino"));
		
	}
	
	@Test
	public void testeIdosoMPesoNormalLimiteInferior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.7055, 64, 70, "masculino"));
		
	}
	
	@Test
	public void testeIdosoMPesoNormalLimiteSuperior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.633, 72, 70, "masculino"));
		
	}
	
	@Test
	public void testeIdosoMSobrepesoLimiteInferior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.62987, 72, 70, "masculino"));
		
	}
	
	@Test
	public void testeIdosoMSobrepesoLimiteSuperior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.5812, 75, 70, "masculino"));
		
	}
	
	@Test
	public void testeIdosoMObesidadeGrauILimiteInferior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.62, 79, 70, "masculino"));
		
	}
	
	@Test
	public void testeIdosoMObesidadeGrauILimiteSuperior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.6476, 95, 70, "masculino"));
		
	}
	
	@Test
	public void testeIdosoMObesidadeGrauIILimiteInferior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.6451, 95, 70, "masculino"));
		
	}
	@Test
	public void testeIdosoMObesidadeGrauIILimiteSuperior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.63, 106, 70, "masculino"));
		
	}
	
	@Test
	public void testeIdosoMObesidadeGrauIIILimite() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.7392, 121, 70, "masculino"));
		
	}
	
	

}
