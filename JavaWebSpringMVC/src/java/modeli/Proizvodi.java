package modeli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

public class Proizvodi {

    @NotNull
    private int proizvodi_id;
    @NotEmpty
    private String grupa_proizvoda;
    @NotEmpty
    private String naziv;
    @NotNull
    private int stanje;
    @NotEmpty
    private String cena;
    @NotNull
    private int kolicina;

    public int getProizvodi_id() {
        return proizvodi_id;
    }

    public String getGrupa_proizvoda() {
        return grupa_proizvoda;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getStanje() {
        return stanje;
    }

    public String getCena() {
        return cena;
    }

    public int getKolicina() {
        return kolicina;
    }
    

    public void setProizvodi_id(int proizvodi_id) {
        this.proizvodi_id = proizvodi_id;
    }

    public void setGrupa_proizvoda(String grupa_proizvoda) {
        this.grupa_proizvoda = grupa_proizvoda;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setStanje(int stanje) {
        this.stanje = stanje;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }
    
    
         public void dodavanje() throws ClassNotFoundException{
           Class.forName("com.mysql.jdbc.Driver");
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/web_prodavnica", "root", "Bt15.01.86");) {
             
                            Statement st = conn.createStatement();
                            st.execute("insert into proizvodi (grupa_proizvoda,naziv,stanje,cena)value('"+grupa_proizvoda+"','"+naziv+"','"+stanje+"','"+cena+"')");
                           
                        } catch (Exception exc) {
                            System.out.println("Nije dobra konekcija :\n" + exc.getMessage());
                        }       
    }
               public void azuriranje() throws ClassNotFoundException{
           Class.forName("com.mysql.jdbc.Driver");
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/web_prodavnica", "root", "Bt15.01.86");) {
             
                            Statement st = conn.createStatement();
                            st.execute("update proizvodi set grupa_proizvoda='"+grupa_proizvoda+"',naziv='"+naziv+"',stanje='"+stanje+"',cena='"+cena+"' where proizvodi_id='"+proizvodi_id+"' ");
                            
                           
                        } catch (Exception exc) {
                            System.out.println("Nije dobra konekcija :\n" + exc.getMessage());
                        }       
    }
                       public void brisanje() throws ClassNotFoundException{
           Class.forName("com.mysql.jdbc.Driver");
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/web_prodavnica", "root", "Bt15.01.86");) {
             
                            Statement st = conn.createStatement();
                            st.execute("delete from proizvodi where proizvodi_id='"+proizvodi_id+"'");
                            
                           
                        } catch (Exception exc) {
                            System.out.println("Nije dobra konekcija :\n" + exc.getMessage());
                        }       
    }
                       public static String listaProizvoda() throws ClassNotFoundException{
                           StringBuilder sviPro=new StringBuilder();
                              Class.forName("com.mysql.jdbc.Driver");
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/web_prodavnica", "root", "Bt15.01.86");) {
             
                            Statement st = conn.createStatement();
                            st.executeQuery("select proizvodi_id,grupa_proizvoda,naziv,stanje,cena from proizvodi");
                            ResultSet rs=st.getResultSet();
                            
                            while(rs.next()){
                                sviPro.append(rs.getString("proizvodi_id"));
                                sviPro.append(";  ");
                                sviPro.append(rs.getString("grupa_proizvoda"));
                                sviPro.append(";  ");
                                sviPro.append(rs.getString("naziv"));
                                sviPro.append(";  ");
                                sviPro.append(rs.getString("stanje"));
                                sviPro.append(";  ");
                                sviPro.append(rs.getString("cena"));
                                sviPro.append("\n");
                            }
                           
                        } catch (Exception exc) {
                            System.out.println("Nije dobra konekcija :\n" + exc.getMessage());
                        }  
        return sviPro.toString();
                       }
                       
      
       
}

