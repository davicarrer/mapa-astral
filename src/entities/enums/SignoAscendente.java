package entities.enums;

import java.time.*;

//FORMA COMO O MUNDO NOS VE, COMO NOS MOSTRAMOS
//Regra:
//        6h31 e 8h30: Touro
//        8h31 e 10h30: Gêmeos
//        10h31 e 12h30: Câncer
//        12h31 e 14h30: Leão
//        14h31 e 16h30: Virgem
//        16h31 e 18h30: Libra
//        18h31 e 20h30: Escorpião
//        20h31 e 22h30: Sagitário
//        22h31 e 24h30: Capricórnio
//        24h31 e 2h30: Aquário
//        2h31 e 4h30: Peixes
//        4h31 e 6h30: Áries
public enum SignoAscendente {
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

    public static SignoAscendente qualSignoAscendente(LocalDateTime dataNascimento){
        LocalTime ariesInicio= LocalTime.of(4,31);
        LocalTime ariesFim = LocalTime.of(6,30);

        LocalTime touroInicio = LocalTime.of(6,31);
        LocalTime touroFim = LocalTime.of(8,30);

        LocalTime gemeosInicio = LocalTime.of(8,31);
        LocalTime gemeosFim = LocalTime.of(10,30);

        LocalTime cancerInicio = LocalTime.of(10,31);
        LocalTime cancerFim = LocalTime.of(12,30);

        LocalTime leaoInicio = LocalTime.of(12,31);
        LocalTime leaoFim = LocalTime.of(14,30);

        LocalTime virgemInicio = LocalTime.of(14,31);
        LocalTime virgemFim = LocalTime.of(16,30);

        LocalTime libraInicio = LocalTime.of(16,31);
        LocalTime libraFim = LocalTime.of(18,30);

        LocalTime escorpiaoInicio = LocalTime.of(18,31);
        LocalTime escorpiaoFim = LocalTime.of(20,31);

        LocalTime sagitarioInicio = LocalTime.of(20,31);
        LocalTime sagitarioFim = LocalTime.of(22,30);

        LocalTime capricornioInicio = LocalTime.of(22,31);
        LocalTime capricornioFim = LocalTime.of(0,30);

        LocalTime aquarioInicio = LocalTime.of(0,31);
        LocalTime aquarioFim = LocalTime.of(2,30);

        LocalTime peixesInicio = LocalTime.of(2,31);
        LocalTime peixesFim = LocalTime.of(4,30);

        LocalTime horaMinutoNascimento = LocalTime.of(dataNascimento.getHour(),dataNascimento.getMinute());

        if(isWithinRange(horaMinutoNascimento,ariesInicio,ariesFim)){
            return ARIES;
        }
        else if(isWithinRange(horaMinutoNascimento,touroInicio,touroFim)){
            return TOURO;
        }
        else if(isWithinRange(horaMinutoNascimento,gemeosInicio,gemeosFim)){
            return GEMEOS;
        }
        else if(isWithinRange(horaMinutoNascimento,cancerInicio,cancerFim)){
            return CANCER;
        }
        else if(isWithinRange(horaMinutoNascimento,leaoInicio,leaoFim)){
            return LEAO;
        }
        else if(isWithinRange(horaMinutoNascimento,virgemInicio,virgemFim)){
            return VIRGEM;
        }
        else if(isWithinRange(horaMinutoNascimento,libraInicio,libraFim)){
            return LIBRA;
        }
        else if(isWithinRange(horaMinutoNascimento,escorpiaoInicio,escorpiaoFim)){
            return ESCORPIAO;
        }
        else if(isWithinRange(horaMinutoNascimento,sagitarioInicio,sagitarioFim)){
            return SAGITARIO;
        }
        else if(isWithinRange(horaMinutoNascimento,aquarioInicio,aquarioFim)){
            return CAPRICORNIO;
        }
        else if(isWithinRange(horaMinutoNascimento,peixesInicio,peixesFim)){
            return PEIXES;
        }
        else{
            return CAPRICORNIO;
        }
    }

    static boolean isWithinRange(LocalTime horaMinutoNascimento, LocalTime inicio, LocalTime fim){
        return !((horaMinutoNascimento.isBefore(inicio) || (horaMinutoNascimento.isAfter(fim))));
    }

}
