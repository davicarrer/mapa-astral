package entities.enums;

import java.time.LocalDateTime;
import java.time.ZoneId;

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

