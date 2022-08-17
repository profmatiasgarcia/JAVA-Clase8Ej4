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
package negocios;

public class Calcula {

    private Double tInicial;
    private Double tFinal;
    private Double distancia;
    private Double vel;
    private Double tTotal;

    public Calcula(String tIni, String tFin, String dist) {
        tInicial = Double.parseDouble(tIni);
        tFinal = Double.parseDouble(tFin);
        distancia = Double.parseDouble(dist);
    }

    public void velocidad() {
        vel = distancia / (tFinal - tInicial);
    }

    public void tiempoTotal() {
        tTotal = tFinal - tInicial;
    }

    public Double getVel() {
        return vel;
    }

    public Double getTiempo() {
        return tTotal;
    }
}
