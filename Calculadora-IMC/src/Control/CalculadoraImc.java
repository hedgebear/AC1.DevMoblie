package Control;

public class CalculadoraImc {
	
	public String calcularImc(double altura, double peso, int idade, String sexo) {
		
		double imc = peso/(altura * altura);
		
		if(idade <= 65) {
		
			if(imc <= 16) {
				return "Baixo peso muito grave";
			}
			else if(imc >= 16 && imc <= 16.99) {
				return "Baixo peso grave";
			}
			else if(imc >= 17 && imc <= 18.49) {
				return "Baixo peso";
			}
			else if(imc >= 18.50 && imc <= 24.99) {
				return "Peso normal";
			}
			else if(imc >= 25 && imc <= 29.99) {
				return "Sobrepeso";
			}
			else if(imc >= 30 && imc <= 34.99) {
				return "Obesidade grau I";
			}
			else if(imc >= 35 && imc <= 39.99) {
				return "Obesidade grau II";
			}
			else if(imc >= 40) {
				return "Obesidade grau III";
			}
			else {
				return "errooooo";
			}
		}
		
		else if(idade > 65 && sexo == "masculino"){
			if(imc <= 21.99) {
				return "Baixo peso";
			}
			else if(imc >= 22 && imc <= 27) {
				return "Peso normal";
			}
			else if(imc >= 27.1 && imc <= 30) {
				return "Sobrepeso";
			}
			else if(imc >= 30.1 && imc <= 35) {
				return "Obesidade grau I";
			}
			else if(imc >= 35.1 && imc < 40) {
				return "Obesidade grau II";
			}
			else if(imc >= 40) {
				return "Obesidade grau III";
			}
			else {
				return "errooooo";
			}
			
		}
		else if(idade > 65 && sexo == "feminino") {
			
			if(imc <= 21.99) {
				return "Baixo peso";
			}
			else if(imc >= 22 && imc <= 27) {
				return "Peso normal";
			}
			else if(imc >= 27.1 && imc <= 32) {
				return "Sobrepeso";
			}
			else if(imc >= 32.1 && imc <= 37) {
				return "Obesidade grau I";
			}
			else if(imc >= 37.1 && imc < 42) {
				return "Obesidade grau II";
			}
			else if(imc >= 42) {
				return "Obesidade grau III";
			}
			else {
				return "errooooo";
			}
			
		}
		return "errooooo";
	}
}