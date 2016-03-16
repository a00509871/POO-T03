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
     * @param condition
     * @param statement
     * @return 
     */
    public String ifStatement(String condition, String statement);
    
    /**
     * Método que regresa un String con código de un "if-else"
     * @param condition
     * @param statement
     * @param elseStatement
     * @return 
     */
    public String ifStatement(String condition, String statement, String elseStatement);
    
    /**
     * Método que regresa un String con código de un Loop o "For"
     * @param initialization
     * @param condition
     * @param increment
     * @return 
     */
    public String loopStatement(String initialization, String condition, String increment, String statement);
    
    /**
     * Método que regresa un String con código de un "print"
     * @param statement
     * @return 
     */
    public String printStatement(String statement);
    
    /**
     * Método que regresa un String con código de un "While"
     * @param condition
     * @param statement
     * @return 
     */
    public String whileStatement(String condition, String statement);
}
