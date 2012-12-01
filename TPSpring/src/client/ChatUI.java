package client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.rmi.RemoteException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatUI {

	private Commande  unregister;
	private Commande  postMessage;
	
	
	private ChatUser u = null;
	
	private String title = "Logiciel de discussion en ligne";

	private JFrame window = new JFrame(this.title);

	private JTextArea txtOutput = new JTextArea();

	private JTextField txtMessage = new JTextField();

	private JButton btnSend = new JButton("Envoyer");

	public ChatUI(ChatUser u,Commande post, Commande unregister) {

		this.postMessage = post;
		this.unregister = unregister;
		JPanel panel = (JPanel) this.window.getContentPane();
		JScrollPane sclPane = new JScrollPane(txtOutput);
		panel.add(sclPane, BorderLayout.CENTER);
		JPanel southPanel = new JPanel(new BorderLayout());
		southPanel.add(this.txtMessage, BorderLayout.CENTER);
		southPanel.add(this.btnSend, BorderLayout.EAST);
		panel.add(southPanel, BorderLayout.SOUTH);

		// Gestion des évènements
		window.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				window_windowClosing(e);
			}
		});
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSend_actionPerformed(e);
			}
		});
		txtMessage.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent event) {
				if (event.getKeyChar() == '\n')
					btnSend_actionPerformed(null);
			}
		});

		// Initialisation des attributs
		this.txtOutput.setBackground(new Color(220, 220, 220));
		this.txtOutput.setEditable(false);
		this.window.setSize(500, 400);
		this.window.setVisible(true);
		this.txtMessage.requestFocus();
	}

	public void window_windowClosing(WindowEvent e) {
		try {
			unregister.execute();
		} catch (Exception exc) {
			System.err.println("Desinscription impossible");
		}
		 System.exit(-1);
	}

	protected String message = null;
	public void btnSend_actionPerformed(ActionEvent e) {
		try {
			message = this.txtMessage.getText();
			postMessage.execute();
		} catch (Exception exception) {
			System.err.println("Envoie message impossible");
		}
		this.txtMessage.setText("");
		this.txtMessage.requestFocus();
	}
	
    public void displayMessage(String message){
        this.txtOutput.append(message + "\n");
        this.txtOutput.moveCaretPosition(this.txtOutput.getText().length());
    }

    public String requestPseudo() {
         String pseudo = JOptionPane.showInputDialog(
                this.window, "Entrez votre pseudo : ",
                this.title,  JOptionPane.OK_OPTION
        );
        if (pseudo == null) System.exit(0);
        return pseudo;
    }

	public String getMessage() {
		return message;
	}

    

}
