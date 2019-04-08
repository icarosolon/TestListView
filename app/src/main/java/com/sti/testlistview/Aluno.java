package com.sti.testlistview;

import java.io.Serializable;

public class Aluno implements Serializable {
    private String nome;
    private String curso;
    private String matricula;
    private String endereco;
    private String telefone;
    private String periodo;

    public Aluno(){}

    public Aluno(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public Aluno(String nome, String curso, String matricula, String endereco, String telefone, String periodo) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
        this.endereco = endereco;
        this.telefone = telefone;
        this.periodo = periodo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
