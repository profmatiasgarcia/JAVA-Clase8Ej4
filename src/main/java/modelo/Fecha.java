/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2021 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 **/
package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    private Calendar fechaHoraActual;
    private int formato;
    private int hora;
    private int minutos;

    public Fecha() {
        formato = 24;
        fechaHoraActual = new GregorianCalendar();
    }

    public Calendar getFechaHoraActual() {
        return fechaHoraActual;
    }

    public void setFechaHoraActual(Calendar fechaHoraActual) {
        this.fechaHoraActual = fechaHoraActual;
    }

    public int getFormato() {
        return formato;
    }

    public void setFormato(int formato) {
        this.formato = formato;
    }

    public int getHora() {
        if (formato == 24)
            hora = fechaHoraActual.get(Calendar.HOUR_OF_DAY);
        else
            hora = fechaHoraActual.get(Calendar.HOUR);
        return hora;
    }

    public int getMinutos() {
        minutos = fechaHoraActual.get(Calendar.MINUTE);
        return minutos;
    }
   
    public String getFecha() {
        return ( fechaHoraActual.get(Calendar.DAY_OF_MONTH) + "/" + (fechaHoraActual.get(Calendar.MONTH) + 1) + "/" + fechaHoraActual.get(Calendar.YEAR) );
    }    
}
