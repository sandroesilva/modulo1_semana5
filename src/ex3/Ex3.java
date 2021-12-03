package ex3;

import static java.time.LocalDate.now;
import static java.util.Currency.getInstance;
import static java.util.Locale.getDefault;

public class Ex3 {

    public static void main(String[] args){
        int dia = now().getDayOfMonth();
        int mes = now().getMonthValue();
        int ano = now().getYear();

        System.out.printf("data: %02d/%02d/%d - locale: %s - currency: %s",dia ,mes,ano,getDefault(),
                        getInstance(getDefault()));


    }
}
