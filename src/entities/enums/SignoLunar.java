package entities.enums;

//Regras:
// Para o signo Lunar, pensei em criar a seguinte lógica, visando a aplicacao dos conceitos de Zone
// Considerando o vetor gerado atraves do sort() com todas as possibilidades de ZoneId:
//                  - para ZoneId com letras entre A-C: signo lunar THOR
//                  - para ZoneId com letras entre E-I: signo lunar HOMEM_ARANHA
//                  - para ZoneId com letras entre J-N: signo lunar: HOMEM_DE_FERRO
//                  - para ZoneId com letras entre O-Z: signo lunar VIUVA_NEGRA

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TreeSet;

public enum SignoLunar {
    CASIMIRO,
    ODIN,
    GANDALF,
    DINOSSAURO;

    public static SignoLunar qualSignoLunar(ZoneId z,LocalDateTime dataNascimento) {
        if (z.toString().equals("America/Recife") &&  (dataNascimento.getHour() >= 12)) {
            return CASIMIRO;
        } else if (z.toString().equals("America/Cuiaba") && (dataNascimento.getHour() < 12)) {
            return ODIN;
        } else if (z.toString().equals("America/Sao_Paulo")) {
            return GANDALF;
        } else
            return DINOSSAURO;

    }
}

