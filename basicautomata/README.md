# Basic Automata

Automata are structures that check whether a given string satisfies the rules of a predefined language.  
Each node of the automaton consists of a graph structure called a “gate.” Each gate holds a single rule.  
When the input string is processed character by character, it passes through the gates, and if the string exits from the final node of the graph, it is recognized as belonging to the defined language.

Below is an example of an Automata: ![](./Automata.png)

In this task, implement the given Automata structure in Java, following these steps:

- Create the base class `Automata` and the node class `Gate`.
- `Gate` should have:
  - `key` (variable)
  - `checkRule` (method) — compares the input with the gate’s rule
- `Automata` should have:
  - `ruleChain` — a structure holding the gates (you may implement this without using a collection)
  - `showRule` (method) — returns the rules (Gate.key values) as a string
  - `addNewGateToRuleChain` (method) — adds a new Gate to the end of the ruleChain
  - an overloaded `addNewGateToRuleChain` — removes the first occurrence of a specified Gate from the end
  - `langCheck` (method) — checks whether the provided string conforms to the language  
    (if no rules are defined, it should raise an exception; in this case, startIndex and endIndex are set to –1 in `AutomataOutput`)
    
(Note: Inner classes are recommended.)

# Basic Automata (Türkçe)

Automata'lar, kendisine verilen String'lerin belirli kurallar çerçevesinde oluşturulmuş diller için bu kuralları sağlayıp sağlamadığını kontrol eden yapılardır. Automata'ların mimarisini her bir node'una "gate" adı verilen graph yapılardan oluşur. Her bir gate yalnızda bir kurala sahiptir. Automata'ya verilen String'in sırasıyla her bir karakteri gate'lerden geçerek graph yapının sonundan çıkış yapması durumunda Automata'da kuralları tanımlanmış olan dile uygunluğunu kanıtlamış olur. Aşağıda bir Automata örneği verilmiştir:

![](./Automata.png)

Örnekte verilen Automata yapısını Java dilinde kodlayınız. Soru aşamaları:

- Automata (base class) ve Gate (node class) yapılarının oluşturulması.
- Gate
  - key (variable)
  - checkRule (method) --> key ile kendisine gelen input'u karşılaştırma
- Automata
  - ruleChain ( ! collection) --> Gate'leri tutan yapı (collection kullanmadan da yapabilirsiniz.)
  - showRule (method) --> Tanımlanan kuralları (Gate.key) String olarak döndürür.
  - addNewGateToRuleChain (method) --> ruleChain'de en sona yeni Gate ekler.
  - addNewGateToRuleChain (method) --> ruleChain'de en sondan arayarak ilk bulduğu istenen Gate'i kaldırır.
  - langCheck (method) --> Kendisine verilen String'in dile uygunAutomataOutput nesnesi (Hiç kural tanımlanmadan çalıştırılması durumunda Exception fırlatır.)

AutomataOutput ve Main class'ları sizinle paylaşılmıştır.
Not: AutomataOutput'da String kabul edilmemesi durumunda startIndex ve endIndex değişkenlerine -1 değeri atanır.

(Tavsiye: inner class kullanabilirsiniz.)
