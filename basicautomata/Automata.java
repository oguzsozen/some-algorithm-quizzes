/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicautomata;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * {@code Automata} kendisine tanımlanan kurallar üzerinden dil oluşturur ve verilen String'lerin
 * bu oluşturulan dil tarafından kabul edilebilir mi olduğunu kontrol eden bir class'tır. Kurallar
 * gate adı verilen yapılarla oluşturulur ve kendisine verilen String'ler bu yapılardan geçirilerek
 * kontrol edilir.
 *
 * @author Oğuz Sözen
 */
public class Automata {

    /**
     * Automata'daki her bir gate'i (yani kuralı) temsil eden node class'ıdır.
     */
    class Gate {

        char key;

        Gate(char key) {
            this.key = key;
        }
        public char getKey() {
            return key;
        }

        /**
         * Gate'in sahip olduğu key ile kendisine gelen karakterlerin aynı olup olmadığını kontrol eder.
         * Gate'in sahip olduğu key {@code *} ise kendisine gelen tüm karakterleri kabul eder.
         * 
         * @param input Karşılaştırma yapılacak karakter.
         * @return Gelen karakterin kabul edilip edilmediğini sonucu.
         */
        public boolean checkRule(char input) {
            return key == input || key == '*';
        }
    }
    
    ArrayList<Gate> ruleChain;
    HashMap<Character, Gate> gateMap;

    public Automata() {
        clearRuleChain();
    }

    /**
     * Automata'da tanımlanan tüm kuralları siler.
     */
    public void clearRuleChain() {
        ruleChain = new ArrayList();
        gateMap = new HashMap();
    }

    /**
     * Automata'nın o anki geçerli olan dil kurallarını String olarak geri döndürür.
     * 
     * @return Dil kuralları.
     */
    public String showRule() {
        String rule = "";

        for (int i = 0; i < ruleChain.size(); i++) {
            rule += ruleChain.get(i).getKey();
        }

        return rule;
    }
    
    /**
     * Automata'ya yeni kural ekler.
     * 
     * @param key Eklenecek yeni kuralın karakteri.
     */
    public void addNewGateToRuleChain(char key) {

        if (!checkFromThekMap(key)) {
            gateMap.put(key, new Gate(key));
        }

        ruleChain.add(gateMap.get(key));
    }

    /**
     * Verilen karakter ile eşleşen en son eklenen kuralı kaldırır.
     * Aranan türde bir kural yani {@code Gate} nesnesi bulunamaması durumunda
     * bir değişiklik olmaz.
     * 
     * @param key Kaldırılması istenen kuralın karakteri.
     */
    public void removeGateFromRuleChain(char key) {

        Gate removedGate = null;
        boolean flag = true;

        for (int i = ruleChain.size() - 1; i >= 0; i--) {
            if (ruleChain.get(i).getKey() == key) {
                if (removedGate == null) {
                    removedGate = ruleChain.get(i);
                    ruleChain.remove(i);
                } else {
                    flag = false;
                    break;
                }
            }
        }

        if (flag && removedGate != null) {
            gateMap.remove(removedGate.getKey());
        }
    }

    boolean checkFromThekMap(char key) {
        for (char keyMap : gateMap.keySet()) {
            if (keyMap == key) {
                return true;
            }
        }

        return false;
    }

    boolean checkFromTheChain(Gate gate) {
        for (Gate gateChain : ruleChain) {
            if (gateChain == gate) {
                return true;
            }
        }

        return false;
    }
    
    /**
     * Verilen String'in Automata'da tanımlanan dil kurallarını karşılayıp karşılamadığını
     * kontrol eder.
     * 
     * @param text Automata'nın dil kurallarına uygunluğu test edilecek String.
     * 
     * @return String'in dile uygun olup olmadığı ve uygunsa String'de kuralların sağlandığı
     * aralığı belirten Start ve End Index'lerine sahip {@code AutomataOutput} nesnesi.
     * 
     * @throws Exception Automata'ya hiçbir rule eklenmeden çalıştırılması durumunda fırlatılır.
     */
    public AutomataOutput langCheck(String text) throws Exception {
        
        if(ruleChain.size() == 0)
            throw new Exception("Automata hiçbir kurala sahip değil.");

        AutomataOutput output = new AutomataOutput();

        int chainIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            if (ruleChain.get(chainIndex).checkRule(text.charAt(i))) {
                if (chainIndex == 0) {
                    output.startIndex = i;
                }

                chainIndex++;

                if (chainIndex == ruleChain.size()) {
                    output.isAccepted = true;
                    output.endIndex = i;
                    break;
                }
            } else {
                chainIndex = 0;
                output.startIndex = -1;
            }
        }

        return output;

    }
}
