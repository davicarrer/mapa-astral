package entities.enums;

//REGRAS:
//    Baby Boomers – nascidos entre 1944 e 1964;
//    Geração X – nascidos entre 1965 e 1979;
//    Millennials (Geração Y) – nascidos entre 1980 e 1994;
//    Geração Z – nascidos entre 1995 e 2015.

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;

public enum Geracao {
    BABY_BOOMERS,
    GERACAO_X,
    MILLENNIALS,
    GERACAO_Z;

    public static Geracao qualAGeracao(Integer year){

        if(year >= 1944 && year <= 1964){
            return BABY_BOOMERS;
        }
        else if (year > 1964 && year <= 1979){
            return GERACAO_X;
        }
        else if (year > 1979 && year <= 1994){
            return MILLENNIALS;
        }
        else if (year > 1994 && year <= 2015){
            return GERACAO_Z;
        }
        throw new RuntimeException("Geração fora do range");
    }
}
