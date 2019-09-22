package javaapplication1;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Mantenedora extends Ies {

    Representante representa = new Representante();

    public Mantenedora() {
    }

    public Mantenedora(int codMantenedora, String nomeMantenedora, int codIes, String razaoSocial, String nomeFantasia, String cnpj, String endereco, Float IGC, String email, String site) {
        super(codMantenedora, nomeMantenedora, codIes, razaoSocial, nomeFantasia, cnpj, endereco, IGC, email, site);
    }

    @Override

    @SuppressWarnings("empty-statement")
    public void cadastraIes() {
        
        //Controle de exceção para caracteres invalidos
        try {
            codMantenedora = Integer.parseInt(JOptionPane.showInputDialog(null, "Isira o código da mantenedora: "));
        } catch (HeadlessException | NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "informe numeros inteiros ");
            codMantenedora = Integer.parseInt(JOptionPane.showInputDialog(null, "Isira o código da mantenedora: "));
        }
        nomeMantenedora = JOptionPane.showInputDialog(null, "Isira o nome da mantenedora: ");
        //Controle de exceção para caracteres invalidos
        try { 
            codIes = Integer.parseInt(JOptionPane.showInputDialog(null, "Isira o código da IES: "));
        } catch (HeadlessException | NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "informe numeros inteiros ");
            codIes = Integer.parseInt(JOptionPane.showInputDialog(null, "Isira o código da IES: "));
        }
        razaoSocial = JOptionPane.showInputDialog(null, "Isira a razão social da IES: ");
        nomeFantasia = JOptionPane.showInputDialog(null, "Isira o nome fantasia da IES: ");
        cnpj = JOptionPane.showInputDialog(null, "Isira CNPJ da IES: ");
        endereco = JOptionPane.showInputDialog(null, "Isira o endereço da IES: ");
        //Controle de exceção para caracteres invalidos
        try {
            IGC = Float.parseFloat(JOptionPane.showInputDialog(null, "Isira IGC da IES: "));
        } catch (HeadlessException | NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "informe numeros inteiros ");
            IGC = Float.parseFloat(JOptionPane.showInputDialog(null, "Isira IGC da IES: "));
        }
        email = JOptionPane.showInputDialog(null, "Isira o email da IES: ");
        site = JOptionPane.showInputDialog(null, "Isira site da IES: ");
        JOptionPane.showMessageDialog(null, "Insira o cadastro do representante legal: ");

    }

}
