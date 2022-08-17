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

public class Gato {

    private String nombre;
    private String imagen;

    public Gato(String nombre, String imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImagen() {
        return imagen;
    }

    @Override
    public String toString() {
        //  return "<img src=\"images/" + this.imagen + "\" width=\"80\">Hola, soy " + this.nombre + "<br>";
        return "<div class=\"acciongato\"><img src=\"images/" + this.imagen + "\" width=\"80\"><div class=\"arrow_box\">&nbsp;Hola, soy " + this.nombre + "&nbsp;</div></div>";

    }

    public String maulla() {
        //  return "<img src=\"images/" + this.imagen + "\" width=\"80\"> Miauuuuuuuu<br>";
        return "<div class=\"acciongato\"><img src=\"images/" + this.imagen + "\" width=\"80\"><div class=\"arrow_box\">&nbsp;Miauuuuuuuu&nbsp;</div></div>";

    }

    public String come(String comida) {
        //  return "<img src=\"images/" + this.imagen + "\" width=\"80\"> Estoy comiendo " + comida + "<br>";
        return "<div class=\"acciongato\"><img src=\"images/" + this.imagen + "\" width=\"80\"><div class=\"arrow_box\">&nbsp;Estoy comiendo " + comida + "&nbsp;</div></div>";

    }
}
