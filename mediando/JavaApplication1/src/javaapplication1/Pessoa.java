
package javaapplication1;

// Classe abstrata com metodo abstrato e parametros em Protected
public abstract class Pessoa {
    protected String nome;
    protected String CPF;
    protected String Endereco;
    protected String email;
    
    //Construtor padrão
    public Pessoa(){}
    //Contrutos com parâmetros
    public Pessoa(String nome, String CPF,String Endereco,String email){
        this.CPF = CPF;
        this.nome = nome;
        this.Endereco = Endereco;
        this.email = email;
    }
    public abstract String cadastraPessoa(String nome,String CPF, String email, String Endereco);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", CPF=" + CPF + ", Endereco=" + Endereco + ", email=" + email + '}';
    }

    
}
