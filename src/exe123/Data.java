package src.exe123;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
    public int dia;
    public int mes;
    public int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }


    public Data() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        LocalDateTime ano = LocalDateTime.now();
        String dateTimeString = ano.format(formatter);
        this.ano = Integer.parseInt(dateTimeString);

        formatter = DateTimeFormatter.ofPattern("MM");
        LocalDateTime mes = LocalDateTime.now();
        dateTimeString = mes.format(formatter);
        this.mes = Integer.parseInt(dateTimeString);

        formatter = DateTimeFormatter.ofPattern("dd");
        LocalDateTime dia = LocalDateTime.now();
        dateTimeString = dia.format(formatter);
        this.dia = Integer.parseInt(dateTimeString);
    }

    @Override
    public String toString() {
        return dia +
                "/" + mes +
                "/" + ano;
    }
}
