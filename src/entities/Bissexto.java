package entities;

public class Bissexto {
    private boolean bissexto;

    public static String ehBissexto(int year){
        if((year % 400 == 0 ) || ((year % 4 == 0) && (year % 100 != 0))){
            return " é ano bissexto ";
        }
        else
            return " não é um ano bissexto ";
    }
}
