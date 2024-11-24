# Matrix 2D

Matrix2D adında 2D Float Array kullanarak 2D matrisler oluşturabilen ve bu matrisler üzerinde çeşitli işlemler yapabilen bir class yazınız. Matrix2D class'ının constructor methodunu override ederek çeşitli şekillerde matrix oluşturabilme imkanı sağlayınız. Her bir matris işlemini çağırabilmek için bir method bulunmalıdır. Ayrıca class içinde bulunan Float Array'i üzerinde de Encapsulation uygulayarak dışarıdan sadece methodlar aracılığıyla yapılabilmesini sağlayınız.

Constructor'lar ve parametreleri:

- Belirlenen satır ve sütunda matris oluşturma (int row, int column)
- Belirlenen satır ve sütunda tüm elemanları aynı sayı olan matris oluşturma (int row, int column, float value)
- Kendisine verilen 2D Float Array'den matris oluşturma (float[][] arr)

Matris işlemleri ve method adları:

- Transpoz (Transpose)
- 2D Matrisle Toplama (add)
- 2D Matrisle Çıkarma (subtract)
- 2D Matrisle Scalar (multiply)
- 2D Matrisle ScalarÇarpım (scalarMultiply)

Encapsulation sonucunda dışarıdan erişilebilen özellikler ve method adları:

- Bir indeksteki değeri getir (getValue)
- Bir indeksteki değeri değiştir (setValue)
- Martis satır sayısını öğren (getRowSize)
- Martis sütun sayısını öğren (getColumnSize)
- Terminal ekranında tüm matrisi yazdırmak için (toString --> Override edilecek)
