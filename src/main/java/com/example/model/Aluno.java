package com.example.model;

import java.time.LocalDate;

public class Aluno {
    private Long id;
    private String matricula;
    private LocalDate dataCadastro;
    private Pessoa pessoa;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public LocalDate getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }


    
}
