package entities;

import entities.enums.SignoAscendente;
import entities.enums.SignoLunar;
import entities.enums.SignoSolar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;

public class Pessoa {
    private String nome;
    private Integer idade;
    private LocalDateTime dataNascimento;
    private ZoneId localNascimento;
    private SignoSolar signoSolar;
    private SignoAscendente signoAscendente;
    private SignoLunar signoLunar;

    public Pessoa(String nome, LocalDateTime dataNascimento, ZoneId localNascimento) {
        this.nome = nome;
        this.idade = Period.between(LocalDate.of(dataNascimento.getYear(),dataNascimento.getMonth(),dataNascimento.getDayOfMonth()), LocalDate.now()).getYears();
        this.dataNascimento = dataNascimento;
        this.localNascimento = localNascimento;
        signoSolar = SignoSolar.qualSignoSolar(LocalDate.of(dataNascimento.getYear(),dataNascimento.getMonth(),dataNascimento.getDayOfMonth()));
        signoAscendente = SignoAscendente.qualSignoAscendente(dataNascimento);
        signoLunar = SignoLunar.qualSignoLunar(localNascimento);
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
}
