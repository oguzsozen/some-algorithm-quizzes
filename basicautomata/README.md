# Basic Automata

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
