package javaapplication1;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Filial extends Ies {

    Representante rep = new Representante();

    @Override
    public void cadastraIes() {
        try {
            codMantenedora = Integer.parseInt(JOptionPane.showInputDialog(null, "Isira o código da mantenedora: "));
        } catch (HeadlessException | NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "informe numeros inteiros ");
            codMantenedora = Integer.parseInt(JOptionPane.showInputDialog(null, "Isira o código da mantenedora: "));
        }
            nomeMantenedora = JOptionPane.showInputDialog(null, "Isira o nome da mantenedora: ");
            try{
            codIes = Integer.parseInt(JOptionPane.showInputDialog(null, "Isira o código da IES: "));
            }catch (HeadlessException | NumberFormatException erro) {
                codIes = Integer.parseInt(JOptionPane.showInputDialog(null, "Isira o código da IES: "));
            }
            razaoSocial = JOptionPane.showInputDialog(null, "Isira a razão social da IES: ");
            nomeFantasia = JOptionPane.showInputDialog(null, "Isira o nome fantasia da IES: ");
            cnpj = JOptionPane.showInputDialog(null, "Isira CNPJ da IES: ");
            endereco = JOptionPane.showInputDialog(null, "Isira o endereço da IES: ");
            try{
            IGC = Float.parseFloat(JOptionPane.showInputDialog(null, "Isira IGC da IES: "));
            }catch (HeadlessException | NumberFormatException erro) {
                IGC = Float.parseFloat(JOptionPane.showInputDialog(null, "Isira IGC da IES: "));
            }
            email = JOptionPane.showInputDialog(null, "Isira o email da IES: ");
            site = JOptionPane.showInputDialog(null, "Isira site da IES: ");
            JOptionPane.showMessageDialog(null, "Insira o cadastro do representante legal: ");
            rep.cadastraPessoa();
        }
    }

