<%-- 
    Document   : brisanje_kupaca
    Created on : May 10, 2016, 3:07:48 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Brisanje kupaca</title>
        <style>
            .error{
                color:red;
            }
        </style>
    </head>
    <body style="background-color: dimgrey;">
         <div style="broder-width:2px;border-color: black;border-style: solid;border-radius: 20px;background-color: azure;width: 1000px;padding: 20px;margin: 20px;margin-left: auto;margin-right: auto">
        <h2>Obrisi kupca :</h2>
         <form:form action="obrisi_kupca.htm" method="post" commandName="kupci2">
                 
               <div>
                <form:label path="kupci_id">ID kupca za brisanje :</form:label><br>
                <form:input path="kupci_id" /> 
                <form:errors path="kupci_id" cssClass="error"></form:errors>
                </div> <br>  
                
                <input type="submit" value="Obrisi kupca">
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
