/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo.osilva.t03.herenciapolimorfismo;
import poo.osilva.t03.herenciapolimorfismo.interfaces.*;

/**
 *
 * @author A00509871
 */
public abstract class Lenguaje implements iAlgoritmos{
    
    /**
     * IDE: Se asigna un IDE correspondiente a dicho lenguaje
     * lenguaje: Se asigna el lenguaje que se usará
     */
    protected String IDE;
    protected String lenguaje;
    
    /**
     * Método que asigna un IDE a la clase con el lenguaje
     * @param IDE Un String que representa un IDE de la clase
     */
    public void setIDE(String IDE){
        this.IDE = IDE;
    }            
    
    /**
     * Método que regresa el IDE del lenguaje
     * @return una cadena de caracteres que representa un IDE usado por el lenguaje de la clase
     */
    public String getIDE(){
        return this.IDE;
    }
    
    /**
     * Método que regresará el nombre del lenguaje usado en la clase
     * @return una cadena de caracteres con el lenguaje de la clase
     */
    public String getLenguaje(){
        return lenguaje;
    }
    
    
}
