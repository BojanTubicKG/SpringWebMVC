<%-- 
    Document   : dodaj_proizvod
    Created on : May 11, 2016, 10:34:14 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dodaj proizvod</title>
          <style>
            .error{
                color:red;
            }
        </style>
    </head>
    <body style="background-color: dimgrey;">
         <div style="broder-width:2px;border-color: black;border-style: solid;border-radius: 20px;background-color: azure;width: 1000px;padding: 20px;margin: 20px;margin-left: auto;margin-right: auto">
        <h2>Dodaj proizvod :</h2>
                <form:form action="dodaj_proizvod.htm" method="post" commandName="proizvodi">
                <div>
                <form:label path="grupa_proizvoda">Grupa proizvoda :</form:label><br>
                <form:input path="grupa_proizvoda" /> 
                <form:errors path="grupa_proizvoda" cssClass="error"></form:errors>
                </div> <br>
                <div>
                <form:label path="naziv">Naziv :</form:label><br>
                <form:input path="naziv" /> 
                <form:errors path="naziv" cssClass="error"></form:errors>
                </div><br>
                <div>
                <form:label path="stanje">Stanje :</form:label><br>
                <form:input path="stanje" /> 
                <form:errors path="stanje" cssClass="error"></form:errors>
                </div> <br>
                <div>
                <form:label path="cena">Cena :</form:label><br>
                <form:input path="cena" /> 
                <form:errors path="cena" cssClass="error"></form:errors>
                </div><br>
                             
                <input type="submit" value="Dodaj proizvod">
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
