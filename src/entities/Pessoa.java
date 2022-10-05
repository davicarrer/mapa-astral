package entities;

import entities.enums.Geracao;
import entities.enums.SignoAscendente;
import entities.enums.SignoLunar;
import entities.enums.SignoSolar;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private Integer idade;
    private LocalDateTime dataNascimento;
    private ZoneId localNascimento;
    private SignoSolar signoSolar;
    private SignoAscendente signoAscendente;
    private SignoLunar signoLunar;
    private Geracao geracao;

    public Pessoa(String nome, LocalDateTime dataNascimento, ZoneId localNascimento) {
        this.nome = nome;
        this.idade = Period.between(LocalDate.of(dataNascimento.getYear(),dataNascimento.getMonth(),dataNascimento.getDayOfMonth()), LocalDate.now()).getYears();
        this.dataNascimento = dataNascimento;
        this.localNascimento = localNascimento;
        signoSolar = SignoSolar.qualSignoSolar(LocalDate.of(dataNascimento.getYear(),dataNascimento.getMonth(),dataNascimento.getDayOfMonth()));
        signoAscendente = SignoAscendente.qualSignoAscendente(dataNascimento);
        signoLunar = SignoLunar.qualSignoLunar(localNascimento, dataNascimento);
        geracao = Geracao.qualAGeracao(dataNascimento.getYear());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public ZoneId getLocalNascimento() {
        return localNascimento;
    }

    public SignoSolar getSignoSolar() {
        return signoSolar;
    }
    public SignoAscendente getSignoAscendente(){
        return signoAscendente;
    }
    public SignoLunar getSignoLunar(){
        return signoLunar;
    }
    public Geracao getGeracao(){
        return geracao;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "\n " + nome + ": \n"
                + " - Tem " + idade + " anos"
                + "\n - Nasceu no dia e horário: " + dataNascimento.format(formatter) + " e " + dataNascimento.getYear() + Bissexto.ehBissexto(dataNascimento.getYear())
                + "\n   - Seu local de nascimento tem offset de " + ZonedDateTime.of(getDataNascimento(),getLocalNascimento()).getOffset() + " em relação ao UTC"
                + "\n - Seus signos são:"
                + "\n   - Solar (essência da pessoa): " + getSignoSolar().toString().toLowerCase()
                + "\n   - Ascendente (como o mundo a vê): " + getSignoAscendente().toString().toLowerCase()
                + "\n   - Lunar (como se relaciona com o mundo): " + getSignoLunar().toString().toLowerCase()
                + "\n - É da geração: " +getGeracao().toString().toLowerCase();
    }
}
