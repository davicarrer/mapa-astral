package application;

import entities.Bissexto;
import entities.Pessoa;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //Datas de nascimento aleatorias para uma pessoa de cada signo
        LocalDateTime dataNascimentoAries = LocalDateTime.of(1990, Month.MARCH,21, 11,0);
        LocalDateTime dataNascimentoTouro = LocalDateTime.of(1970, Month.MAY,1, 4,30);
        LocalDateTime dataNascimentoGemeos = LocalDateTime.of(1989, Month.JUNE,3, 12,12);
        LocalDateTime dataNascimentoCancer = LocalDateTime.of(1991, Month.JULY,10, 8,30);
        LocalDateTime dataNascimentoLeao = LocalDateTime.of(1994, Month.AUGUST,2, 6,30);
        LocalDateTime dataNascimentoVirgem = LocalDateTime.of(1988, Month.SEPTEMBER,18, 10,20);
        LocalDateTime dataNascimentoLibra = LocalDateTime.of(1979, Month.OCTOBER,14, 22,30);
        LocalDateTime dataNascimentoEscorpiao = LocalDateTime.of(1999, Month.NOVEMBER,12, 8,30);
        LocalDateTime dataNascimentoSagitario = LocalDateTime.of(2000, Month.DECEMBER,2, 11,02);
        LocalDateTime dataNascimentoCapricornio = LocalDateTime.of(2001, Month.JANUARY,1, 3,30);
        LocalDateTime dataNascimentoAquario = LocalDateTime.of(1994, Month.FEBRUARY,9, 8,30);
        LocalDateTime dataNascimentoPeixes = LocalDateTime.of(2000, Month.MARCH,20, 5,0);

//        TreeSet<String> sortedZones = new TreeSet<>(ZoneId.getAvailableZoneIds());
//        for (String s: sortedZones) {
//            System.out.println(s);
//        }
//        System.out.println("Number of zones : " + sortedZones.size());

        // 12 pessoas, uma para cada signo
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Cleber", dataNascimentoAries,ZoneId.of("America/Sao_Paulo")));
        pessoas.add(new Pessoa("Lucas", dataNascimentoTouro,ZoneId.of("Indian/Kerguelen")));
        pessoas.add(new Pessoa("Amanda", dataNascimentoGemeos,ZoneId.of("America/Recife")));
        pessoas.add(new Pessoa("Claudia", dataNascimentoCancer,ZoneId.of("Japan")));
        pessoas.add(new Pessoa("Fernando", dataNascimentoLeao,ZoneId.of("Libya")));
        pessoas.add(new Pessoa("Iara", dataNascimentoVirgem,ZoneId.of("Pacific/Apia")));
        pessoas.add(new Pessoa("Jessica", dataNascimentoLibra,ZoneId.of("Portugal")));
        pessoas.add(new Pessoa("Yuri", dataNascimentoEscorpiao,ZoneId.of("America/Sao_Paulo")));
        pessoas.add(new Pessoa("Daiane", dataNascimentoSagitario,ZoneId.of("America/Cuiaba")));
        pessoas.add(new Pessoa("Caique", dataNascimentoCapricornio,ZoneId.of("Turkey")));
        pessoas.add(new Pessoa("Cristiana", dataNascimentoAquario,ZoneId.of("US/Michigan")));
        pessoas.add(new Pessoa("Karla", dataNascimentoPeixes,ZoneId.of("America/Sao_Paulo")));


        for (Pessoa p: pessoas) {
            System.out.println(p);
        }

    }
}