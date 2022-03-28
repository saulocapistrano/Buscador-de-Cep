package cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar Cep 1.0 devman Saulo Capistrano.");
		lblNewLabel.setBounds(29, 30, 345, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@author ... aprendendo Java sozinho");
		lblNewLabel_1.setBounds(29, 72, 262, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Webservice:");
		lblNewLabel_2.setBounds(29, 113, 118, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblWebService = new JLabel("republicavirtual.com.br");
		lblWebService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			link("www.republicavirtual.com.br");
			}
		});
		lblWebService.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblWebService.setForeground(SystemColor.textHighlight);
		lblWebService.setBounds(113, 113, 178, 14);
		getContentPane().add(lblWebService);
		
		JButton btnLinkedIn = new JButton("");
		btnLinkedIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			link ("https://www.linkedin.com/in/saulo-capistrano-15983523/");
			}
		});
		btnLinkedIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLinkedIn.setBorder(null);
		btnLinkedIn.setBackground(SystemColor.control);
		btnLinkedIn.setIcon(new ImageIcon(Sobre.class.getResource("/img/linkedin.png")));
		btnLinkedIn.setToolTipText("Linkedin");
		btnLinkedIn.setBounds(99, 163, 48, 48);
		getContentPane().add(btnLinkedIn);
		
		JButton btnGithub = new JButton("");
		btnGithub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			link ("https://github.com/saulocapistrano/Buscador-de-Cep");
			}
		});
		btnGithub.setBorder(null);
		btnGithub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGithub.setBackground(SystemColor.control);
		btnGithub.setToolTipText("Github");
		btnGithub.setIcon(new ImageIcon(Sobre.class.getResource("/img/gith.png")));
		btnGithub.setBounds(163, 163, 48, 48);
		getContentPane().add(btnGithub);

	
	}// fim do construtor
	
	private void link (String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI (site);
			desktop.browse(uri);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
