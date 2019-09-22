
package javaapplication1;
import java.util.ArrayList;

public abstract class Ies {
    protected int codMantenedora;
    protected String nomeMantenedora;
    protected int codIes;
    protected String razaoSocial;
    protected String nomeFantasia;
    protected String cnpj;
    protected String endereco;
    protected Float IGC;
    protected String email;
    protected String site;
    
    ArrayList<String> grava = new ArrayList();
    public Ies(){}
    public Ies(int codMantenedora, String nomeMantenedora, int codIes, String razaoSocial, String nomeFantasia, String cnpj, String endereco, Float IGC, String email, String site){
        this.IGC = IGC;
        this.cnpj = cnpj;
        this.codIes = codIes;
        this.codMantenedora = codMantenedora;
        this.email = email;
        this.endereco = email;
        this.nomeFantasia = nomeFantasia;
        this.nomeMantenedora = nomeMantenedora;
        this.razaoSocial = razaoSocial;
        this.site = site;
    }
    
    public abstract void cadastraIes();

    public int getCodMantenedora() {
        return codMantenedora;
    }

    public void setCodMantenedora(int codMantenedora) {
        this.codMantenedora = codMantenedora;
    }

    public String getNomeMantenedora() {
        return nomeMantenedora;
    }

    public void setNomeMantenedora(String nomeMantenedora) {
        this.nomeMantenedora = nomeMantenedora;
    }

    public int getCodIes() {
        return codIes;
    }

    public void setCodIes(int codIes) {
        this.codIes = codIes;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Float getIGC() {
        return IGC;
    }

    public void setIGC(Float IGC) {
        this.IGC = IGC;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public ArrayList<String> getGrava() {
        return grava;
    }

    public void setGrava(ArrayList<String> grava) {
        this.grava = grava;
    }

    @Override
    public String toString() {
        return "Ies{" + "codMantenedora=" + codMantenedora + ", nomeMantenedora=" + nomeMantenedora + ", codIes=" + codIes + ", razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia + ", cnpj=" + cnpj + ", endereco=" + endereco + ", IGC=" + IGC + ", email=" + email + ", site=" + site + ", grava=" + grava + '}';
    }
    
    
}
