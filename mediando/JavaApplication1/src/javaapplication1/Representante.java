package javaapplication1;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Representante extends Pessoa {

    ArrayList<String> usuario = new ArrayList();

    public Representante() {
    }

    public Representante(String CPF, String nome, String Endereco, String email) {
        super(CPF, nome, Endereco, email);

    }

    Representante(String cadastraPessoa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String cadastraPessoa() {

        nome = JOptionPane.showInputDialog("Insira o nome: ");
        CPF = JOptionPane.showInputDialog("Insira o CPF: ");
        email = JOptionPane.showInputDialog("Insira o e-mail: ");
        Endereco = JOptionPane.showInputDialog("Insira o endereço: ");
        JOptionPane.showMessageDialog(null, "Cadastro concluido: " + nome);

        return "Pessoa{" + "nome=" + nome + ", CPF=" + CPF + ", Endereco=" + Endereco + ", email=" + email + '}';
    }

    @Override
    public String cadastraPessoa(String nome, String CPF, String email, String Endereco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
