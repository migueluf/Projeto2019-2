package javaapplication1;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class JavaApplication1 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int option;

        Representante pessoas = new Representante();
        Mantenedora mantenedora = new Mantenedora();
        Filial filial = new Filial();
        Representante pessoa = new Representante();
        ArrayList salvaPessoa = new ArrayList(); //Array para pessoa
        ArrayList salvaIes = new ArrayList(); //Array para IES

        do {      //Menu de chamadas!
            option = Integer.parseInt(JOptionPane.showInputDialog(null, "1- Cadastrar Mantenedora\n" + "2- Cadstrar IES\n" + "3- Excluir Cadastro\n" + "4- sair"));

            switch (option) {
                case 1:
                    Mantenedora mantenedora1 = new Mantenedora(); //cadastro mantenendora
                    mantenedora1.cadastraIes();
                    salvaIes.add(mantenedora1);
                    Representante pessoa1 = new Representante(); //Cadastro representante mantenedora
                    pessoa1.cadastraPessoa();
                    salvaPessoa.add(pessoa1);
                    break;
                case 2:
                    Filial filial1 = new Filial(); //Cadastro filial
                    filial1.cadastraIes();
                    salvaIes.add(filial1);

                    Representante pessoa2 = new Representante(); //Cadastro representante da Filial
                    pessoa2.cadastraPessoa();
                    salvaPessoa.add(pessoa2);
                    break;
                case 3:
                    int op;
                    op = Integer.parseInt(JOptionPane.showInputDialog(null, "1- Excluir dados da IES\n" + "2- Excluir dados do representante"));
                    if (op == 1) { // Remoção de dados da IES
                        for (int i = 0; i < salvaIes.size(); i++) {
                            salvaIes.remove(i);
                        }
                    } else { //remoção de dados de pessoa
                        for (int i = 0; i < salvaPessoa.size(); i++) {
                            salvaPessoa.remove(i);
                        }
                    }
                    break;
                case 4:
                    break;
            }
        } while (option < 4);
    }
}
