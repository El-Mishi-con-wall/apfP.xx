package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm03 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtKilometros, txtpies, txtMillas, txtMetros, txtYardas;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm03 frame = new frm03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblKilometros = new JLabel("Kilometros");
		lblKilometros.setBounds(50, 50, 80, 30);
		getContentPane().add(lblKilometros);

		JLabel lblPies = new JLabel("Pies");
		lblPies.setBounds(50, 90, 80, 30);
		getContentPane().add(lblPies);

		JLabel lblMillas = new JLabel("Millas");
		lblMillas.setBounds(50, 130, 80, 30);
		getContentPane().add(lblMillas);

		JLabel lblMetros = new JLabel("Metros");
		lblMetros.setBounds(50, 170, 80, 30);
		getContentPane().add(lblMetros);

		JLabel lblYardas = new JLabel("Yardas");
		lblYardas.setBounds(50, 210, 80, 30);
		getContentPane().add(lblYardas);

		txtKilometros = new JTextField();
		txtKilometros.setBounds(130, 50, 60, 30);
		txtKilometros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtKilometros.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtKilometros);

		txtpies = new JTextField();
		txtpies.setBounds(130, 90, 60, 30);
		txtpies.setHorizontalAlignment(SwingConstants.RIGHT);
		txtpies.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtpies);
		
		txtMillas = new JTextField();
		txtMillas.setBounds(130, 130, 60, 30);
		txtMillas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMillas.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMillas);

		txtMetros = new JTextField();
		txtMetros.setBounds(130, 170, 60, 30);
		txtMetros.setFocusable(false);
		txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMetros.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMetros);

		txtYardas = new JTextField();
		txtYardas.setBounds(130, 210, 60, 30);
		txtYardas.setFocusable(false);
		txtYardas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtYardas.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtYardas);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 280, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);	
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				btnCalcular_actionPerformed();
			}
		});
	}

	protected void btnCalcular_actionPerformed() {
		int Kilometros = Integer.parseInt(txtKilometros.getText());
		int Pies = Integer.parseInt(txtpies.getText());
		int Millas = Integer.parseInt(txtMillas.getText());

		double Metros = (Kilometros * 1000) + (Pies * 3.2808) + (Millas * 1609);
		double Yardas = (Kilometros * 1093.61) + (Pies * 0.33) + (Millas * 1760);

		DecimalFormat df = new DecimalFormat("###.00");
		txtMetros.setText( df.format(Metros));
		txtYardas.setText( df.format(Yardas));

	} 
}
	
		