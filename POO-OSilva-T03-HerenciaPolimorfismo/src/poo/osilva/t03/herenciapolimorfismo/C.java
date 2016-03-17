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
public class C extends Lenguaje{
    
    /**
     * Constructor que establece el lenguaje de la clase
     */
    public C(){
        this.lenguaje = "C";
    }

    /**
     * Método que regresa un código en C de un "if"
     * @param condition String con código de la condición
     * @param statement String con el código en caso de que se cumpla la condición
     * @return String con código del if en C
     */
    @Override
    public String ifStatement(String condition, String statement) {                
        return "if(" + condition + ") {\n\t" + statement + "\n}";
    }

    /**
     * Método que regresa un código en C de un "if-else"
     * @param condition String con código de la condición
     * @param statement String con el código en caso de que se cumpla la condición
     * @param elseStatement String con código en caso de no cumplirse la condición del if
     * @return  String con código del if-else en C
     */
    @Override
    public String ifStatement(String condition, String statement, 
            String elseStatement) {
        return ifStatement(condition, statement) + "\nelse {\n\t" + elseStatement + 
                "\n}";
    }
    
    /**
     * Método que regresa un código en C de un "for"
     * @param initialization String con código de la initializacion
     * @param condition String con código de la condición
     * @param increment String con código del incremento
     * @param statement String con el código mientras se cumpla la condición
     * @return String con código en C del for
     */
    @Override
    public String loopStatement(String initialization, String condition, 
            String increment, String statement) {
        return "for(" + initialization + "; " + condition + "; " + increment +
                ") {\n\t" + statement + "\n}";
    }
    
    /**
     * Método que regresa un código en C de un impresión de consola
     * @param statement String con lo que se quiere escribir
     * @return String con código de impresion en consola en C
     */
    @Override
    public String printStatement(String statement) {        
        return "printf(\"" + statement + "\")";
    }

    /**
     * Método que regresa un código en C de un "while"
     * @param condition String con código de la condición
     * @param statement String con el código en caso de que se cumpla la condición
     * @return String con código del while en C
     */
    @Override
    public String whileStatement(String condition, String statement) {
        return "while(" + condition + ") {\n\t" + statement + "\n}";
    }
}
