/**
 * 
 */
package Principal;


import javax.swing.JOptionPane;

import ConversorMonedas.OpcionesConversion;

public class Principal {

	public static void main(String[] args) {
		
		OpcionesConversion conversion = new OpcionesConversion();
		
		while (true) {
			String opcoes = JOptionPane.showInputDialog(null, "Selecione uma opção para converção", "Menu", JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"Conversor de Moedas", "Conversor de Temperatura"}, "Eleger").toString();
			
			switch (opcoes) {
			case "Conversor de Moedas" :
				String entrada = JOptionPane.showInputDialog(null,  "Insira um valor");
				double valorInserido = Double.parseDouble(entrada);
				conversion.ConverterMoedas(valorInserido);
				
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar outra conversão? ");
				if (JOptionPane.OK_OPTION ==resposta) {
					System.out.println("Seleção positiva");
				}else {
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
					
			
				}
				
				break;
			}
			
		}

	}

}
