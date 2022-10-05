package entities.enums;

//Regras:
// Para o signo Lunar, pensei em criar a seguinte lógica, visando a aplicacao dos conceitos de Zone
// Considerando o vetor gerado atraves do sort() com todas as possibilidades de ZoneId:
//                  - para ZoneId com letras entre A-C: signo lunar THOR
//                  - para ZoneId com letras entre E-I: signo lunar HOMEM_ARANHA
//                  - para ZoneId com letras entre J-N: signo lunar: HOMEM_DE_FERRO
//                  - para ZoneId com letras entre O-Z: signo lunar VIUVA_NEGRA

import java.time.ZoneId;
import java.util.TreeSet;

public enum SignoLunar {
    THOR,
    HOMEM_ARANHA,
    HOMEM_DE_FERRO,
    VIUVA_NEGRA;

    public static SignoLunar qualSignoLunar(ZoneId z) {
        if (z.toString().startsWith("A") || z.toString().startsWith("B") || z.toString().startsWith("C")) {
            return THOR;
        } else if (z.toString().startsWith("E") || z.toString().startsWith("G") || z.toString().startsWith("H") || z.toString().startsWith("I")) {
            return HOMEM_ARANHA;
        } else if (z.toString().startsWith("J") || z.toString().startsWith("K") || z.toString().startsWith("L") || z.toString().startsWith("M") || z.toString().startsWith("N")) {
            return HOMEM_DE_FERRO;
        } else
            return VIUVA_NEGRA;

    }
}

