<%--
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2022 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title> Captura Datos </title>
</head>
<body>
    <h1> Esta es la página de inicio</h1>
    <h2> Aquí se piden los datos </h2>
    <p> Hola, por favor introduce la información </p>
    <form action="paginaDestino.jsp" method="post">
        <table cellspacing="3" cellpadding="3" border="1" >
            <tr>
                <td align="right"> Nombre: </td>
                <td><input type="text" name="nombre"></td>
            </tr>
            <tr>
                <td align="right"> Minuto inicial: </td>
                <td> <input type="text" name="tiempoIni"> </td>
            </tr>
            <tr>
                <td align="right"> Minuto final: </td>
                <td> <input type="text" name="tiempoFin"> </td>
            </tr>
            <tr>
                <td align="right">Distancia recorrida (en metros):</td>
                <td> <input type="text" name="distancia"> </td>
            </tr>
        </table>
        <input type="reset" value="Borrar">
        <input type="submit" value="Enviar">
    </form>
</body>
</html>