/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo.osilva.t03.herenciapolimorfismo;

/**
 *
 * @author A00509871
 */
public class Java extends Lenguaje{
    
    /**
     * Constructor que asigna el Lenguaje que usa esta clase
     */
    public Java(){
        this.lenguaje = "JAVA";
    }
    
    /**
     * Método que regresa un código en JAVA de un "if"
     * @param condition String con código de la condición
     * @param statement String con el código en caso de que se cumpla la condición del if
     * @return  String con código del if en JAVA
     */
    @Override
    public String ifStatement(String condition, String statement) {                
        return "if (" + condition + "){\n\t" + statement + "\n}";
    }

    /**
     * Método que regresa un código en JAVA de un "if-else"
     * @param condition String con código de la condición
     * @param statement String con el código en caso de que se cumpla la condición del if
     * @param elseStatement String con código en caso de no cumplirse la condición del if
     * @return  String con código del if-else en JAVA
     */
    @Override
    public String ifStatement(String condition, String statement, 
            String elseStatement) {
        return ifStatement(condition, statement) + "else{\n\t" + elseStatement + 
                "\n}";
    }
    
    /**
     * Método que regresa un código en JAVA de un "for"
     * @param initialization String con código de la initializacion
     * @param condition String con código de la condición
     * @param increment  String con código del incremento
     * @param statement String con el código en caso de que se cumpla la condición
     * @return String con código en JAVA del for
     */
    @Override
    public String loopStatement(String initialization, String condition, 
            String increment, String statement) {
        return "for (" + initialization + "; " + condition + "; " + increment +
                "){\n\t" + statement + "\n}";
    }
    
    /**
     * Método que regresa un código en JAVA de un impresión de consola
     * @param statement String con lo que se quiere escribir
     * @return String con código de impresion en consola en JAVA
     */
    @Override
    public String printStatement(String statement) {        
        return "System.out.print(\"" + statement + "\")";
    }

    /**
     * Método que regresa un código en JAVA de un "while"
     * @param condition String con código de la condición
     * @param statement String con el código en caso de que se cumpla la condición
     * @return String con código del while en JAVA
     */
    @Override
    public String whileStatement(String condition, String statement) {
        return "while(" + condition + "){\n\t" + statement + "\n}";
    }
}