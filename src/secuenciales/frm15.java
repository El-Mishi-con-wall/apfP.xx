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

public class frm15 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtJuan, txtRosa, txtDaniel, txtTotal;
	JLabel lblPJuan, lblPRosa, lblPDaniel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm15 frame = new frm15();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm15() {
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

		lblPJuan = new JLabel("%");
		lblPJuan.setBounds(200, 50, 120, 30);
		getContentPane().add(lblPJuan);

		lblPRosa = new JLabel("%");
		lblPRosa.setBounds(200, 90, 80, 30);
		getContentPane().add(lblPRosa);

		lblPDaniel = new JLabel("%");
		lblPDaniel.setBounds(200, 130, 80, 30);
		getContentPane().add(lblPDaniel);

		txtJuan = new JTextField();
		txtJuan.setBounds( 130, 50, 60, 30);
		txtJuan.setHorizontalAlignment( SwingConstants.RIGHT );
		txtJuan.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtJuan);

		txtRosa = new JTextField();
		txtRosa.setBounds( 130, 90, 60, 30);
		txtRosa.setHorizontalAlignment( SwingConstants.RIGHT );
		txtRosa.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtRosa);

		txtDaniel = new JTextField();
		txtDaniel.setBounds( 130, 130, 60, 30);
		txtDaniel.setHorizontalAlignment( SwingConstants.RIGHT );
		txtDaniel.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtDaniel);
		
		txtTotal = new JTextField();
		txtTotal.setBounds( 130, 170, 60, 30);
		txtTotal.setHorizontalAlignment( SwingConstants.RIGHT );
		txtTotal.setFocusable(false);
		txtTotal.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtTotal);

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
		int Juan = Integer.parseInt( txtJuan.getText() );
		int Rosa = Integer.parseInt( txtRosa.getText() );
		int Daniel = Integer.parseInt( txtDaniel.getText());
		int Danielsoles = Daniel * 3;

		txtDaniel.setText(String.valueOf(Danielsoles));

		int total = Juan + Rosa + Danielsoles;
		double pJuan = Juan * 100.0 / total;
		double pRosa = Rosa * 100.0 / total;
		double pDaniel = Danielsoles * 100 / total;

		DecimalFormat df = new DecimalFormat( "####.##");
		lblPJuan.setText( df.format( pJuan ) + " %" );
		lblPRosa.setText( df.format( pRosa ) + " %" );
		lblPDaniel.setText( df.format(pDaniel) + " %");
		txtTotal.setText(String.valueOf(total));
	}

}