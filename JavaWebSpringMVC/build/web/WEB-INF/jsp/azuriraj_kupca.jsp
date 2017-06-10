<%-- 
    Document   : azuriraj_kupca
    Created on : May 10, 2016, 2:49:37 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Azuriranje kupaca</title>
        <style>
            .error{
                color:red;
            }
        </style>
    </head>
    <body style="background-color: dimgrey;">
         <div style="broder-width:2px;border-color: black;border-style: solid;border-radius: 20px;background-color: azure;width: 1000px;padding: 20px;margin: 20px;margin-left: auto;margin-right: auto">
        <h2>Azuriraj kupca :</h2>
         <form:form action="azuriraj_kupca.htm" method="post" commandName="kupci1">
                 
               <div>
                <form:label path="kupci_id">ID kupca za azuriranje :</form:label><br>
                <form:input path="kupci_id" /> 
                <form:errors path="kupci_id" cssClass="error"></form:errors>
                </div> <br>            
                <div>
                <form:label path="ime">Ime :</form:label><br>
                <form:input path="ime" /> 
                <form:errors path="ime" cssClass="error"></form:errors>
                </div> <br>
                <div>
                <form:label path="prezime">Prezime :</form:label><br>
                <form:input path="prezime" /> 
                <form:errors path="prezime" cssClass="error"></form:errors>
                </div><br>
                <div>
                <form:label path="jmbg">JMBG :</form:label><br>
                <form:input path="jmbg" /> 
                <form:errors path="jmbg" cssClass="error"></form:errors>
                </div> <br>
                <div>
                <form:label path="br_telefona">Broj telefona :</form:label><br>
                <form:input path="br_telefona" /> 
                <form:errors path="br_telefona" cssClass="error"></form:errors>
                </div><br>
                <div>
                <form:label path="email">Email :</form:label><br>
                <form:input path="email" />
                <form:errors path="email" cssClass="error"></form:errors>
                </div> <br>
                <div>
                <form:label path="adresa">Adresa :</form:label><br>
                <form:input path="adresa" /> 
                <form:errors path="adresa" cssClass="error"></form:errors>
                </div><br>
                <div>
                <form:label path="grad">Grad :</form:label><br>
                <form:input path="grad" /> 
                <form:errors path="grad" cssClass="error"></form:errors>
                </div> <br>
                <div>
                <form:label path="drzava">Drzava :</form:label><br>
                <form:input path="drzava" /> 
                <form:errors path="drzava" cssClass="error"></form:errors>
                </div><br>
              
                <input type="submit" value="Izmeni">
        </form:form><br><br>
        
    
        <h2>Dostupne operacije :</h2>
        
                 <ul id="lista">
			    <li><a href="index.htm">Pocetna strana</a></li>
			    <li><a href="dodaj_kupca.htm">Dodavanje kupca</a></li>
			    <li><a href="azuriraj_kupca.htm">Azuriranje kupca</a></li>
			    <li><a href="obrisi_kupca.htm">Brisanje kupaca</a></li>
			    <li><a href="dodaj_proizvod.htm">Dodavanje proizvoda</a></li>
			    <li><a href="azuriraj_proizvod.htm">Azuriranje proizvoda</a></li>
                            <li><a href="obrisi_proizvod.htm">Brisanje proizvoda</a></li>
			    <li><a href="dodaj_prodaju.htm">Kupovina</a></li>
		     </ul>
        </div>
    </body>
</html>
