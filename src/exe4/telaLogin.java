package src.exe4;

import javax.swing.*;
import java.awt.event.*;

public class telaLogin extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField text_nome;
    private JTextField text_telefone;
    private JTextField text_email;
    private JTextField text_dia;
    private JTextField text_endereco;
    private JTextField text_mes;
    private JTextField text_ano;

    public telaLogin() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        String nome = text_nome.getText();
        String endereco = text_endereco.getText();
        String email = text_email.getText();
        long telefone = Long.parseLong(text_telefone.getText());
        int dia = Integer.parseInt(text_dia.getText());
        int mes = Integer.parseInt(text_mes.getText());
        int ano = Integer.parseInt(text_ano.getText());

        CadernoDeEnderecos caderno = new CadernoDeEnderecos(ano, mes, dia, email, telefone, nome);
        JOptionPane.showMessageDialog(null, "Cadastro salvo!\n" + "Nome: " + caderno.getNome() + "\nTelefone: " + caderno.getTelefone() + "\nEmail: " + caderno.getEmail() + "\nAniversário: " + caderno.getDiaNiver() + "/" + caderno.getMesNiver() + "/" + caderno.getAnoNiver());
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        telaLogin dialog = new telaLogin();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
