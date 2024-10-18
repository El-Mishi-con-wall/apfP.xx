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

public class frm17 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtDinero, txtessalud, txtComedor, txtEscuela, txtasilo;
	JLabel lblPessalud, lblPComedor, lblPEscuela;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm17 frame = new frm17();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm17() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblDinero = new JLabel("Dinero");
		lblDinero.setBounds(50, 50, 80, 30);
		getContentPane().add(lblDinero);

		JLabel lblessalud = new JLabel("essalud");
		lblessalud.setBounds(50, 90, 80, 30);
		getContentPane().add(lblessalud);

		JLabel lblcomedor = new JLabel("comedor");
		lblcomedor.setBounds(50, 130, 80, 30);
		getContentPane().add(lblcomedor);

		JLabel lblescuela = new JLabel("escuela");
		lblescuela.setBounds(50, 170, 80, 30);
		getContentPane().add(lblescuela);

		JLabel lblasilo = new JLabel("asilo");
		lblasilo.setBounds(50, 210, 80, 30);
		getContentPane().add(lblasilo);

		lblPessalud = new JLabel("25%");
		lblPessalud.setBounds(200, 90, 120, 30);
		getContentPane().add(lblPessalud);

		lblPComedor = new JLabel("35%");
		lblPComedor.setBounds(200, 130, 80, 30);
		getContentPane().add(lblPComedor);

		lblPEscuela = new JLabel("25%");
		lblPEscuela.setBounds(200, 170, 80, 30);
		getContentPane().add(lblPEscuela);

		lblasilo = new JLabel("15%");
		lblasilo.setBounds(200, 210, 80, 30);
		getContentPane().add(lblasilo);

		txtDinero = new JTextField();
		txtDinero.setBounds( 130, 50, 60, 30);
		txtDinero.setHorizontalAlignment( SwingConstants.RIGHT );
		txtDinero.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtDinero);

		txtessalud = new JTextField();
		txtessalud.setBounds( 130, 90, 60, 30);
		txtessalud.setHorizontalAlignment( SwingConstants.RIGHT );
		txtessalud.setFocusable(false);
		txtessalud.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtessalud);

		txtComedor = new JTextField();
		txtComedor.setBounds( 130, 130, 60, 30);
		txtComedor.setHorizontalAlignment( SwingConstants.RIGHT );
		txtComedor.setFocusable(false);
		txtComedor.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtComedor);
		
		txtEscuela = new JTextField();
		txtEscuela.setBounds( 130, 170, 60, 30);
		txtEscuela.setHorizontalAlignment( SwingConstants.RIGHT );
		txtEscuela.setFocusable(false);
		txtEscuela.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtEscuela);

		txtasilo = new JTextField();
		txtasilo.setBounds( 130, 210, 60, 30);
		txtasilo.setHorizontalAlignment( SwingConstants.RIGHT );
		txtasilo.setFocusable(false);
		txtasilo.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtasilo);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds( 80, 270, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		int Dinero = Integer.parseInt( txtDinero.getText() );

		int essalud =  Dinero *25 / 100;
		int comedor = Dinero * 35 / 100;
		int escuela = Dinero * 25 / 100;
		int asilo = Dinero - (essalud + comedor + escuela);

		txtasilo.setText("" + asilo);
		txtessalud.setText("" + essalud);
		txtComedor.setText("" + comedor);
		txtEscuela.setText("" + escuela);
	}

}