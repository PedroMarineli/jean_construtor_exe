package src.exe123;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaAplication {
    
    public static void main(String[] args) {
        exe1();
        exe2();
        exe3();
        
       
    }
    
    public static void exe1(){
        Veiculo carro = new Veiculo("Forza", "Uno", 1996, "Azul", 20.00);
        
        double valor = carro.getValor();
        valor = valor*1.05;
        carro.setValor(valor);
        System.out.println(valor);
    }
    
    public static void exe2(){
        Circulo bola = new Circulo(10);
        bola.getArea();
        bola.getCircunferencia();
        bola.aumentarRaio(10);
    }

    private static void exe3() {
        Data dataAtual = new Data();
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));
        Data dataDigitada = new Data(dia, mes, ano);
        JOptionPane.showMessageDialog(null, "Data atual:" + dataAtual + "Data digitada: " + dataDigitada);
    }
        
}
