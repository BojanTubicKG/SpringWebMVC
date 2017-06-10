package modeli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.validation.constraints.NotNull;
 

public class Prodaja {

    @NotNull
    private int kupci_id;
    @NotNull
    private int proizvodi_id;
    @NotNull
    private int kolicina;

    public int getKupci_id() {
        return kupci_id;
    }

    public int getProizvodi_id() {
        return proizvodi_id;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKupci_id(int kupci_id) {
        this.kupci_id = kupci_id;
    }

    public void setProizvodi_id(int proizvodi_id) {
        this.proizvodi_id = proizvodi_id;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }
    
              public void kupovina() throws ClassNotFoundException{
           Class.forName("com.mysql.jdbc.Driver");
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/web_prodavnica", "root", "Bt15.01.86");) {
             
                            Statement st = conn.createStatement();
                            st.execute("insert into prodaja (kupci_id,proizvodi_id,kolicina)value('"+kupci_id+"','"+proizvodi_id+"','"+kolicina+"')");
                           
                        } catch (Exception exc) {
                            System.out.println("Nije dobra konekcija :\n" + exc.getMessage());
                        }       
    }

                      
       public void azu() throws ClassNotFoundException{
           Class.forName("com.mysql.jdbc.Driver");
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/web_prodavnica", "root", "Bt15.01.86");) {
             
                            Statement st = conn.createStatement();
             
                            st.execute("update proizvodi set stanje=stanje-'"+kolicina+"' where proizvodi_id='"+proizvodi_id+"' ");
                            
                           
                        } catch (Exception exc) {
                            System.out.println("Nije dobra konekcija :\n" + exc.getMessage());
                        } 
}
}