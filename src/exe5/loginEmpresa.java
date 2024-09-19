package src.exe5;

import javax.swing.*;
import java.awt.event.*;

public class loginEmpresa extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField txt_nome;
    private JTextField txt_endereco;
    private JTextField txt_cidade;
    private JTextField txt_estado;
    private JTextField txt_CEP;
    private JTextField txt_fone;

    public loginEmpresa() {
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
        String nome = txt_nome.getText();
        String endereco = txt_endereco.getText();
        String estado = txt_estado.getText();
        String cidade = txt_cidade.getText();
        long CEP = Long.parseLong(txt_CEP.getText());
        long fone = Long.parseLong(txt_fone.getText());

        Empresa empresa = new Empresa(nome, endereco, cidade, estado, CEP, fone);
        JOptionPane.showMessageDialog(null, empresa);
        dispose();
    }

    private void onCancel() {
        Empresa empresa = new Empresa();
        String nome = txt_nome.getText();
        String endereco = txt_endereco.getText();
        String estado = txt_estado.getText();
        String cidade = txt_cidade.getText();
        long CEP = Long.parseLong(txt_CEP.getText());
        long fone = Long.parseLong(txt_fone.getText());
        empresa.setNome(nome);
        empresa.setEndereco(endereco);
        empresa.setEstado(estado);
        empresa.setCidade(cidade);
        empresa.setCEP(CEP);
        empresa.setFone(fone);

        JOptionPane.showMessageDialog(null, empresa);
        dispose();
    }

    public static void main(String[] args) {
        loginEmpresa dialog = new loginEmpresa();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
