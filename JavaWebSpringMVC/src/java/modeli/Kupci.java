package modeli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Kupci {

    @NotNull
    private int kupci_id;
    @NotEmpty
    private String ime;
    @NotEmpty
    private String prezime;
    @NotEmpty
    private String jmbg;
    @NotEmpty
    private String br_telefona;
    @Email(message="Nije validna email adresa")
    @NotEmpty
    private String email;
    @NotEmpty
    private String adresa;
    @NotEmpty
    private String grad;
    @NotEmpty
    private String drzava;

    public int getKupci_id() {
        return kupci_id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public String getBr_telefona() {
        return br_telefona;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getGrad() {
        return grad;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setKupci_id(int kupci_id) {
        this.kupci_id = kupci_id;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public void setBr_telefona(String br_telefona) {
        this.br_telefona = br_telefona;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }
    
     public void dodavanje() throws ClassNotFoundException{
           Class.forName("com.mysql.jdbc.Driver");
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/web_prodavnica", "root", "Bt15.01.86");) {
             
                            Statement st = conn.createStatement();
                            st.execute("insert into kupci (ime,prezime,jmbg,br_telefona,email,adresa,grad,drzava)value('"+ime+"','"+prezime+"','"+jmbg+"','"+br_telefona+"','"+email+"','"+adresa+"','"+grad+"','"+drzava+"')");
                           
                        } catch (Exception exc) {
                            System.out.println("Nije dobra konekcija :\n" + exc.getMessage());
                        }       
    }
      public void azuriranje() throws ClassNotFoundException{
           Class.forName("com.mysql.jdbc.Driver");
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/web_prodavnica", "root", "Bt15.01.86");) {
             
                            Statement st = conn.createStatement();
                            st.execute("update kupci set ime='"+ime+"',prezime='"+prezime+"',jmbg='"+jmbg+"',br_telefona='"+br_telefona+"',email='"+email+"',adresa='"+adresa+"',grad='"+grad+"',drzava='"+drzava+"' where kupci_id='"+kupci_id+"' ");
                            
                           
                        } catch (Exception exc) {
                            System.out.println("Nije dobra konekcija :\n" + exc.getMessage());
                        }       
    }
        public void brisanje() throws ClassNotFoundException{
           Class.forName("com.mysql.jdbc.Driver");
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/web_prodavnica", "root", "Bt15.01.86");) {
             
                            Statement st = conn.createStatement();
                            st.execute("delete from kupci where kupci_id='"+kupci_id+"'");
                            
                           
                        } catch (Exception exc) {
                            System.out.println("Nije dobra konekcija :\n" + exc.getMessage());
                        }       
    }
    
}
