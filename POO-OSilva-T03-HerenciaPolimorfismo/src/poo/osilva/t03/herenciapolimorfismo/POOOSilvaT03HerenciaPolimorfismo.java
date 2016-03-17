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
public class POOOSilvaT03HerenciaPolimorfismo {

    static String ifCondition;
    static String statement;
    static String forCondition;
    static String forStatement;
    static String ifStatement;
    static String elseStatement;
    static String initialization;
    static String increment;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Java java = new Java();
        C c = new C();
        Swift swift = new Swift();
        
        java.setIDE("NetBeans");
        swift.setIDE("Xcode");
        c.setIDE("Visual Studio");
        
        ifCondition = "a < b";
        ifStatement = java.printStatement("<< Cumplió con la condición >>");
        elseStatement = java.printStatement("<< No cumplió con la condición >>");
        initialization = "int i = 0";
        forCondition = "i < 3";
        increment = "i++";
        forStatement = java.printStatement("<< Se mostrará este mensaje tantas veces pase por el loop >>");        
        imprimirCodigo(java);
        
        ifStatement = c.printStatement("<< Cumplió con la condición >>");
        elseStatement = c.printStatement("<< No cumplió con la condición >>");
        initialization = "i = 0";
        forStatement = c.printStatement("<< Se mostrará este mensaje tantas veces pase por el loop >>");
        imprimirCodigo(c);
        
        ifStatement = swift.printStatement("<< Cumplió con la condición >>");
        elseStatement = swift.printStatement("<< No cumplió con la condición >>");
        initialization = "var i = 0";
        forStatement = swift.printStatement("<< Se mostrará este mensaje tantas veces pase por el loop >>");
        imprimirCodigo(swift);
        
        
        
        
        
    }
    
    public static void imprimirCodigo(Lenguaje clase){
        System.out.println("===================");
        System.out.println("Lenguaje: " + clase.getLenguaje());
        System.out.println("IDE: " + clase.getIDE());
        System.out.println("-- IF-ELSE --");
        System.out.println(clase.ifStatement(ifCondition, ifStatement, elseStatement));
        System.out.println("-- FOR --");
        System.out.println(clase.loopStatement(initialization, forCondition, increment, forStatement));
        System.out.println("===================");
    } 
    

}
