package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	
	ConverterMoeda moeda = new ConverterMoeda();
	
	public void ConverterMoedas(double valor) {
	String opcao = JOptionPane.showInputDialog(null,
			"Escolha a moeda que deseja converter", "Moeda", JOptionPane.PLAIN_MESSAGE, null, new Object[] 
					{"De Real a Dolar", "De Real a Euro", "De Real a Libra Esterlina", "De Real a Peso Argentino", "De Real a Peso Chileno", 
					"De Dolar a Real","De Euro a Real", "De Libra Esterlina a Real", "De Peso Argentino a Real", 
					"De Peso Chileno a Real"},"Selecao").toString();

	switch (opcao) {
	case "De Real a Dolar" :
		moeda.ConverterRealDolar(valor);
		break;
	
	case "De Real a Euro" :
		moeda.ConverterRealEuro(valor);
		break;
		
	case "De Real a Libra Esterlina" :
		moeda.ConverterRealLibraEsterlina(valor);
		break;
	
	case "De Real a Peso Argentino" :
		moeda.ConverterRealPesoArgentino(valor);
		break;
		
	case "De Real a Peso Chileno" :
		moeda.ConverterRelaPesoChileno(valor);
		break;
	
	case "De Dolar a Real" :
		moeda.ConverterDolarReal(valor);
		break;
		
	case "De Euro a Real" :
		moeda.ConverterEuroReal(valor);
		break;
		
	case "De Libra Esterlina a Real" :
		moeda.ConverterLibraEsterlinaReal(valor);
		break;
	
	case "De Peso Argentino a Real" :
		moeda.ConverterPesoArgentinoReal(valor);
		break;
		
	case "De Peso Chileno a Real" :
		moeda.ConverterPesoChilenoReal(valor);
		break;
		
		}
	}
}
