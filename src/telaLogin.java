package src;

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
        System.out.println(nome);
        String endereco = text_endereco.getText();
        System.out.println(endereco);
        String email = text_email.getText();
        System.out.println(email);
        String telefone = text_telefone.getText();
        System.out.println(telefone);
        String dia = text_dia.getText();
        System.out.println(dia);
        String mes = text_mes.getText();
        System.out.println(mes);
        String ano = text_ano.getText();
        System.out.println(ano);
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
