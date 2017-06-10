<%-- 
    Document   : obrisi_proizvod
    Created on : May 11, 2016, 12:11:06 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Brisanje proizvoda</title>
           <style>
            .error{
                color:red;
            }
        </style>
    </head>
    <body style="background-color: dimgrey;">
         <div style="broder-width:2px;border-color: black;border-style: solid;border-radius: 20px;background-color: azure;width: 1000px;padding: 20px;margin: 20px;margin-left: auto;margin-right: auto">
        <h2>Obrisi proizvod :</h2>
            <form:form action="obrisi_proizvod.htm" method="post" commandName="proizvodi2">
                <div>
                <form:label path="proizvodi_id">ID proizvoda za brisanje :</form:label><br>
                <form:input path="proizvodi_id" /> 
                <form:errors path="proizvodi_id" cssClass="error"></form:errors>
                </div> <br>
                             
                <input type="submit" value="Obrisi proizvod">
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
