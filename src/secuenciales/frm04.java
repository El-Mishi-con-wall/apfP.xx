package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm04 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtMetros, txtPies, txtpulgadas;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm04 frame = new frm04();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 350);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblMetros = new JLabel("Metros");
		lblMetros.setBounds(50, 50, 80, 30);
		getContentPane().add(lblMetros);

		JLabel lblPies = new JLabel("Pies");
		lblPies.setBounds(50, 90, 80, 30);
		getContentPane().add(lblPies);

		JLabel lblpulgadas = new JLabel("pulgadas");
		lblpulgadas.setBounds(50, 130, 80, 30);
		getContentPane().add(lblpulgadas);

		txtMetros = new JTextField();
		txtMetros.setBounds(130, 50, 100, 30);
		txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMetros.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMetros);

		txtPies = new JTextField();
		txtPies.setBounds(130, 90, 100, 30);
		txtPies.setFocusable(false);
		txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPies.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPies);
		
		txtpulgadas = new JTextField();
		txtpulgadas.setBounds(130, 130, 100, 30);
		txtpulgadas.setFocusable(false);
		txtpulgadas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtpulgadas.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtpulgadas);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 170, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);	
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				btnCalcular_actionPerformed();
			}
		});
	}

	protected void btnCalcular_actionPerformed() {
		double metros = Double.parseDouble(txtMetros.getText());

		int Pies = (int) (metros * 3.2808);
		double restaPies = (metros * 3.2808) - Pies;
		int pulgadas = (int) (restaPies * 12);

		txtPies.setText("" + Pies );
		txtpulgadas.setText("" + pulgadas );
	} 
}
	
		