package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm08 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtexamenes, txtpropinatotal;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm08 frame = new frm08();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblexamenes = new JLabel("examenes aprobados :");
		lblexamenes.setBounds(20, 50, 150, 30);
		getContentPane().add(lblexamenes);

		JLabel lblpropinatotal = new JLabel("propina total :");
		lblpropinatotal.setBounds(20, 90, 80, 30);
		getContentPane().add(lblpropinatotal);

		txtexamenes = new JTextField();
		txtexamenes.setBounds(200, 50, 65, 30);
		txtexamenes.setHorizontalAlignment(SwingConstants.RIGHT);
		txtexamenes.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtexamenes);

		txtpropinatotal = new JTextField();
		txtpropinatotal.setBounds(200, 90, 65, 30);
		txtpropinatotal.setFocusable(false);
		txtpropinatotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtpropinatotal.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtpropinatotal);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 150, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);	
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				btnCalcular_actionPerformed();
			}
		});
	}

	protected void btnCalcular_actionPerformed() {
		int examenes = Integer.parseInt(txtexamenes.getText());

		int examenesaprobados = 5;

		int propinabase = 20;
		int propinaadicional = examenesaprobados * examenes;
		int propinatotal = propinabase + propinaadicional;
			
		txtpropinatotal.setText("" + propinatotal);
		
	} 
}
	
		