# a101-finalcase

<b>Neleri Kullandım  </b>:grey_question:

| & | & |
| --- | --- |
| Dil | Java |
| Framework | Maven - JUnit |
| Driver | Chrome Driver |
| IDE | IntelliJ IDEA Community |
| Diğer | Log4J, Assertions, POM |

:leftwards_arrow_with_hook:<b> Akış: 1. Senaryo: Login Yapılarak</b>

- Chrome tarayıcısı açılarak hepsiburada.com adresine gidilir.
- Anasayfa'da Giriş Yap'a tıklanır. Açılan sayfada Facebook ile Giriş Yap seçilir.
- Facebook bilgileri girilir ve giriş yapılır.
- Anasayfada giriş yapıldığı doğrulanır.
- Arama kutusuna "apple iphone 13 pro max" yazılır ve actions ile Enter komutu çalıştırılır.
- Arama sonucu çıkan ürünlerden birine tıklandığında yeni sekmede açılacağı için WindowHandle ile yeni sekmeye odaklanılır.
- Ürün sepete eklenir ve GetText ile ürünün adı alınır.
- Ürün sayfasında farklı bir satıcıdan bulunan ürüne tıklanır ve bu da sepete eklenir.
- Son olarak Sepetime gidilir ve ürün sayfasında ürünlerin kaydedilen metinleri ile sepetteki ürün metinleri assertions ile karşılaştırılarak başarılı veya başarısız sonucu alınır.
- Tüm bu işlemler Log4J ile loglanır.

:leftwards_arrow_with_hook:<b> Akış: 2. Senaryo: Login Yapılmadan</b>

- Chrome tarayıcısı açılarak hepsiburada.com adresine gidilir.
- Arama kutusuna "apple iphone 13 pro max" yazılır ve actions ile Enter komutu çalıştırılır.
- Arama sonucu çıkan ürünlerden birine tıklandığında yeni sekmede açılacağı için WindowHandle ile yeni sekmeye odaklanılır.
- Ürün sepete eklenir ve GetText ile ürünün adı alınır.
- Ürün sayfasında farklı bir satıcıdan bulunan ürüne tıklanır ve bu da sepete eklenir.
- Son olarak Sepetime gidilir ve ürün sayfasında ürünlerin kaydedilen metinleri ile sepetteki ürün metinleri assertions ile karşılaştırılarak başarılı veya başarısız sonucu alınır.
- Tüm bu işlemler Log4J ile loglanır.

:arrow_forward:<b> Sunum Videosu</b>
<br><br>
https://www.loom.com/share/34c8a857ad9a49b3b91b10d90122d20c
