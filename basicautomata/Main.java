/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicautomata;

/**
 *
 * @author Oğuz Sözen
 */
public class Main {

    public static void main(String[] args) {

        Automata automata = new Automata();
        
        automata.addNewGateToRuleChain('a');
        automata.addNewGateToRuleChain('*');
        automata.addNewGateToRuleChain('a');
        automata.addNewGateToRuleChain('b');
        
        System.out.println("Language Rule: " + automata.showRule());
        
        automata.removeGateFromRuleChain('a');
        
        System.out.println("Language Rule: " + automata.showRule());
        
        System.out.println();
        
        AutomataOutput output;
        
        try {
            output = automata.langCheck("khaybya");

            System.out.println("Language Accepted: " + output.isAccepted);
            System.out.println("String Start Index: " + output.startIndex);
            System.out.println("String End Index: " + output.endIndex);
            
            System.out.println();
            
            output = automata.langCheck("lmbamar");

            System.out.println("Language Accepted: " + output.isAccepted);
            System.out.println("String Start Index: " + output.startIndex);
            System.out.println("String End Index: " + output.endIndex);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
