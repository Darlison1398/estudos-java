import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		final double pi = 3.14;
		double d;
		
		try {
			
			d = Double.parseDouble(JOptionPane.showInputDialog("Digite o diametro do cículo:"));
			double circunferencia = pi * d;
			System.out.println("O valor da circunferência é: " + circunferencia);
			
			if (circunferencia <= 10 ) {
				System.out.println(circunferencia + ": esse é o valor de um círculo pequeno." );
			}
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido.");
		}
		
	}

}
