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
    
    public Java(){
        this.lenguaje = "JAVA";
    }

    @Override
    public String ifStatement(String condition, String statement) {                
        return "if (" + condition + "){\n\t" + statement + "\n}";
    }

    @Override
    public String ifStatement(String condition, String statement, 
            String elseStatement) {
        return ifStatement(condition, statement) + "else{\n\t" + elseStatement + 
                "\n}";
    }
    
    @Override
    public String loopStatement(String initialization, String condition, 
            String increment, String statement) {
        return "for (" + initialization + "; " + condition + "; " + increment +
                "){\n\t" + statement + "\n}";
    }
    
    @Override
    public String printStatement(String statement) {        
        return "System.out.print(\"" + statement + "\")";
    }

    @Override
    public String whileStatement(String condition, String statement) {
        return "while(" + condition + "){\n\t" + statement + "\n}";
    }
}