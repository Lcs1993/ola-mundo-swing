import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Fri Jul 16 08:59:27 BRT 2021
 */



/**
 * @author lucas
 */
public class OlaMundo extends JFrame {
	public OlaMundo() {
		initComponents();
	}

	private void btnCliqueAquiActionPerformed(ActionEvent e) {
		lblMensagem.setText("Olá mundo");
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - lucas
		lblMensagem = new JLabel();
		btnCliqueAqui = new JButton();

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- lblMensagem ----
		lblMensagem.setText("Aqui vai aparecer a Mensagem");
		lblMensagem.setForeground(Color.red);
		lblMensagem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblMensagem, "cell 3 2,alignx center,growx 0");

		//---- btnCliqueAqui ----
		btnCliqueAqui.setText("Clique Aqui");
		btnCliqueAqui.addActionListener(e -> btnCliqueAquiActionPerformed(e));
		contentPane.add(btnCliqueAqui, "cell 3 3 1 2");
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}
	
	
	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - lucas
	private JLabel lblMensagem;
	private JButton btnCliqueAqui;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	public static void main(String[] args ) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                 OlaMundo GUI = new OlaMundo();
                 GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 GUI.setVisible(true);
            }
        });
	}
}
