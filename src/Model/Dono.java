/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class Dono {
    String cpf,endereco,telefone,nome,nascimento,nomedoanimal;

    public Dono(String cpf, String endereco, String telefone, String nome, String nascimento, String nomedoanimal) {
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nome = nome;
        this.nascimento = nascimento;
        this.nomedoanimal = nomedoanimal;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getNomedoanimal() {
        return nomedoanimal;
    }

    public void setNomedoanimal(String nomedoanimal) {
        this.nomedoanimal = nomedoanimal;
    }
    
    
    
}
