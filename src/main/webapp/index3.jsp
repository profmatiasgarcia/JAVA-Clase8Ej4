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
<%@page contentType="text/html"%>
<%@page import="modelo.Fecha" %>
<!DOCTYPE html>
<html>
<head>
    <title>Fechas</title>
</head>
<body bgcolor="aabbcc">
    <div align="center">
        <h2>Hola Prof Matias</h2>
        <%
            Fecha hoy = new Fecha();
            int hora = hoy.getHora();
            int minutos = hoy.getMinutos();
            String fecha = hoy.getFecha();
        %>
        <p> Son las <%=hora%> horas <%=minutos%> minutos del día <%=fecha%> </p>
    </div>
</body>
</html>