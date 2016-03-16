/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.osilva.t03.herenciapolimorfismo.interfaces;

/**
 *
 * @author A00509871
 */
public interface iAlgoritmos {
    
    /**
     * Método que regresa un String con código de un "if"
     * @param condition String con código de la condición
     * @param statement String con el statement que irá dentro del if
     * @return String con código del if
     */
    public String ifStatement(String condition, String statement);
    
    /**
     * Método que regresa un String con código de un "if-else"
     * @param condition String con código de la condición
     * @param statement String con el código en caso de que se cumpla la condición del if
     * @param elseStatement String con código en caso de no cumplirse la condición del if
     * @return String con código del if-else
     */
    public String ifStatement(String condition, String statement, String elseStatement);
    
    /**
     * Método que regresa un String con código de un Loop o "For"
     * @param initialization
     * @param condition String con código de la condición
     * @param increment
     * @param statement  String con el código en caso de que se cumpla la condición
     * @return String con código del For
     */
    public String loopStatement(String initialization, String condition, String increment, String statement);
    
    /**
     * Método que regresa un String con código de un "print"
     * @param statement
     * @return String con código para imprimir en consola
     */
    public String printStatement(String statement);
    
    /**
     * Método que regresa un String con código de un "While"
     * @param condition String con código de la condición
     * @param statement String con el código en caso de que se cumpla la condición
     * @return String con condigo del While
     */
    public String whileStatement(String condition, String statement);
}
