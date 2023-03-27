package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConverterMoeda {

	public void ConverterRealDolar(double valor) {
		double moedaDolar = valor / 5.23;
		moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Cotação $ " + moedaDolar + " Dolares");
	}

	public void ConverterRealEuro(double valor) {
		double moedaEuro = valor / 5.64;
		moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Cotação $ " + moedaEuro + " Euro");
	}
	
	public void ConverterRealLibraEsterlina(double valor) {
		double moedaLibraEsterlina = valor / 6.41;
		moedaLibraEsterlina = (double) Math.round(moedaLibraEsterlina *100d) /100;
			JOptionPane.showMessageDialog(null, "Cotação $ " + moedaLibraEsterlina + " Libras Esterlinas");
		
	}
	
	public void ConverterRealPesoArgentino(double valor) {
		double moedaPesoArgentiono = valor * 39.65;
		moedaPesoArgentiono = (double) Math.round(moedaPesoArgentiono * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Cotação $ " + moedaPesoArgentiono + " Peso Argentino");
	}

	public void ConverterRelaPesoChileno(double valor) {
		double moedaPesoChileno = valor * 154.17;
		moedaPesoChileno = (double) Math.round(moedaPesoChileno) / 100;
		JOptionPane.showMessageDialog(null, "Cotação $ " + moedaPesoChileno + " Peso Chileno");
	}

	public void ConverterDolarReal(double valor) {
		double dolarReal = valor * 5.23;
		dolarReal = (double) Math.round(dolarReal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Cotação $ " + dolarReal + " Reias");
	}

	public void ConverterEuroReal(double valor) {
		double moedareal = valor * 5.64;
		moedareal = (double) Math.round(moedareal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Cotação $ " + moedareal + " Reais");

	}
	
	public void ConverterLibraEsterlinaReal(double valor) {
		double moedareal = valor * 6.41;
		moedareal = (double) Math.round(moedareal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Cotação $ " + moedareal + " Reais");

	}
	
	public void ConverterPesoArgentinoReal(double valor) {
		double moedareal = valor / 39.65;
		moedareal = (double) Math.round(moedareal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Cotação $ " + moedareal + " Reais");

	}
	
	public void ConverterPesoChilenoReal(double valor) {
		double moedareal = valor / 154.17;
		moedareal = (double) Math.round(moedareal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Cotação $ " + moedareal + " Reais");

	}

	

}
