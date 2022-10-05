package entities.enums;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

//FORMA COMO NÓS SOMOS, NOSSA ESSENCIA
//Regra:
//    Áries: 21 de março a 20 de abril
//    Touro: 21 de abril a 20 de maio
//    Gêmeos: 21 de maio a 20 de junho
//    Câncer: 21 de junho a 22 de julho
//    Leão: 23 de julho a 22 de agosto
//    Virgem: 23 de agosto a 22 de setembro
//    Libra: 23 de setembro a 22 de outubro
//    Escorpião: 23 de outubro a 21 de novembro
//    Sagitário: 22 de novembro a 21 de dezembro
//    Capricórnio: 22 de dezembro a 20 de janeiro
//    Aquário: 21 de janeiro a 19 de fevereiro
//    Peixes: 20 de fevereiro a 20 de março
public enum SignoSolar {
    LIBRA,
    ESCORPIAO,
    SAGITARIO,
    CAPRICORNIO,
    PEIXES,
    AQUARIO,
    LEAO,
    GEMEOS,
    ARIES,
    TOURO,
    VIRGEM,
    CANCER;

    public static SignoSolar qualSignoSolar(LocalDate dataNascimento){
        MonthDay ariesInicio= MonthDay.of(Month.MARCH, 21);
        MonthDay ariesFim = MonthDay.of(Month.APRIL,20);

        MonthDay touroInicio = MonthDay.of(Month.APRIL, 21);
        MonthDay touroFim = MonthDay.of(Month.MAY,20);

        MonthDay gemeosInicio = MonthDay.of(Month.MAY,21);
        MonthDay gemeosFim = MonthDay.of(Month.JUNE,20);

        MonthDay cancerInicio = MonthDay.of(Month.JUNE,21);
        MonthDay cancerFim = MonthDay.of(Month.JULY,22);

        MonthDay leaoInicio = MonthDay.of(Month.JULY,23);
        MonthDay leaoFim = MonthDay.of(Month.AUGUST,22);

        MonthDay virgemInicio = MonthDay.of(Month.AUGUST,23);
        MonthDay virgemFim = MonthDay.of(Month.SEPTEMBER,22);

        MonthDay libraInicio = MonthDay.of(Month.SEPTEMBER,23);
        MonthDay libraFim = MonthDay.of(Month.OCTOBER,22);

        MonthDay escorpiaoInicio = MonthDay.of(Month.OCTOBER,23);
        MonthDay escorpiaoFim = MonthDay.of(Month.NOVEMBER,21);

        MonthDay sagitarioInicio = MonthDay.of(Month.NOVEMBER,22);
        MonthDay sagitarioFim = MonthDay.of(Month.DECEMBER,21);

        MonthDay capricornioInicio = MonthDay.of(Month.DECEMBER,22);
        MonthDay capricornioFim = MonthDay.of(Month.JANUARY,20);

        MonthDay aquarioInicio = MonthDay.of(Month.JANUARY,21);
        MonthDay aquarioFim = MonthDay.of(Month.FEBRUARY,19);

        MonthDay peixesInicio = MonthDay.of(Month.FEBRUARY,20);
        MonthDay peixesFim = MonthDay.of(Month.MARCH,20);

        MonthDay monthDayNascimento = MonthDay.of(dataNascimento.getMonth(),dataNascimento.getDayOfMonth());

        if(isWithinRange(monthDayNascimento,ariesInicio,ariesFim)){
            return ARIES;
        }
        else if(isWithinRange(monthDayNascimento,touroInicio,touroFim)){
            return TOURO;
        }
        else if(isWithinRange(monthDayNascimento,gemeosInicio,gemeosFim)){
            return GEMEOS;
        }
        else if(isWithinRange(monthDayNascimento,cancerInicio,cancerFim)){
            return CANCER;
        }
        else if(isWithinRange(monthDayNascimento,leaoInicio,leaoFim)){
            return LEAO;
        }
        else if(isWithinRange(monthDayNascimento,virgemInicio,virgemFim)){
            return VIRGEM;
        }
        else if(isWithinRange(monthDayNascimento,libraInicio,libraFim)){
            return LIBRA;
        }
        else if(isWithinRange(monthDayNascimento,escorpiaoInicio,escorpiaoFim)){
            return ESCORPIAO;
        }
        else if(isWithinRange(monthDayNascimento,sagitarioInicio,sagitarioFim)){
            return SAGITARIO;
        }
        else if(isWithinRange(monthDayNascimento,aquarioInicio,aquarioFim)){
            return AQUARIO;
        }
        else if(isWithinRange(monthDayNascimento,peixesInicio,peixesFim)){
            return PEIXES;
        }
        else{
            return CAPRICORNIO;
        }
    }

    static boolean isWithinRange(MonthDay monthDayNascimento, MonthDay inicio, MonthDay fim){
        boolean testeantes = monthDayNascimento.isBefore(inicio);
        boolean testefim = (monthDayNascimento.isAfter(fim));
        return !((monthDayNascimento.isBefore(inicio) || (monthDayNascimento.isAfter(fim))));
    }

}
