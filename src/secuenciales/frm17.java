package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.AbstractButton;
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
		setBounds(0, 0, 300, 300);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblJuan = new JLabel("Juan :");
		lblJuan.setBounds(50, 50, 80, 30);
		getContentPane().add(lblJuan);

		JLabel lblRosa = new JLabel("Rosa :");
		lblRosa.setBounds(50, 90, 80, 30);
		getContentPane().add(lblRosa);

		JLabel lblDaniel = new JLabel("Daniel :");
		lblDaniel.setBounds(50, 130, 80, 30);
		getContentPane().add(lblDaniel);

		JLabel lbltotal = new JLabel("total");
		lbltotal.setBounds(50, 170, 80, 30);
		getContentPane().add(lbltotal);

		lblPessalud = new JLabel("%");
		lblPessalud.setBounds(200, 50, 120, 30);
		getContentPane().add(lblPessalud);

		lblPComedor = new JLabel("%");
		lblPComedor.setBounds(200, 90, 80, 30);
		getContentPane().add(lblPComedor);

		lblPEscuela = new JLabel("%");
		lblPEscuela.setBounds(200, 130, 80, 30);
		getContentPane().add(lblPEscuela);

		txtDinero = new JTextField();
		txtDinero.setBounds( 130, 50, 60, 30);
		txtDinero.setHorizontalAlignment( SwingConstants.RIGHT );
		txtDinero.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtDinero);

		txtessalud = new JTextField();
		txtessalud.setBounds( 130, 90, 60, 30);
		txtessalud.setHorizontalAlignment( SwingConstants.RIGHT );
		txtessalud.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtessalud);

		txtComedor = new JTextField();
		txtComedor.setBounds( 130, 130, 60, 30);
		txtComedor.setHorizontalAlignment( SwingConstants.RIGHT );
		txtComedor.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtComedor);
		
		txtEscuela = new JTextField();
		txtEscuela.setBounds( 130, 170, 60, 30);
		txtEscuela.setHorizontalAlignment( SwingConstants.RIGHT );
		txtEscuela.setFocusable(false);
		txtEscuela.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtEscuela);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds( 80, 230, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		int Juan = Integer.parseInt( txtDinero.getText() );
		int Rosa = Integer.parseInt( txtessalud.getText() );
		int Daniel = Integer.parseInt( txtComedor.getText());
		int Danielsoles = Daniel * 3;

		int total = Juan + Rosa + Danielsoles;
		double pJuan = Juan * 100.0 / total;
		double pRosa = Rosa * 100.0 / total;
		double pDaniel = Danielsoles * 100 / total;

		DecimalFormat df = new DecimalFormat( "####.##");
		lblPessalud.setText( df.format( pJuan ) + " %" );
		lblPComedor.setText( df.format( pRosa ) + " %" );
		lblPEscuela.setText( df.format(pDaniel) + " %");
		txtComedor.setText("" + Danielsoles);
		txtEscuela.setText("" + total);
	}

}