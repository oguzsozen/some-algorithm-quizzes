/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicautomata;

/**
 * {@code Automata} tarafından kontrol edilen String'in dile uygun olup olmadığı
 * ve uygunsa String'de kuralların sağlandığı aralığı belirten Start ve End
 * Index'leri değerlerini tutan {@code AutomataOutput} adlı Entity class'tır.
 *
 * @author Oğuz Sözen
 */
public class AutomataOutput {

    public boolean isAccepted;
    public int startIndex;
    public int endIndex;
    
    public AutomataOutput() {
        isAccepted = false;
        startIndex = -1;
        endIndex = -1;
    }
}
