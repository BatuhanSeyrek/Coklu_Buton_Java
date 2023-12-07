#  	[Buton Kontrol Paneli]()


Bu Java Swing uygulaması, 4x4 bir düzende bulunan butonlarla interaktif bir kontrol paneli sağlar. Her buton, belirli bir aksiyonu tetikler ve kullanıcı etkileşimine yanıt olarak görsel geri bildirim sunar.

## [Özellikler]()

1. Java Swing kullanılarak bir JFrame içinde 4x4 düzeninde butonlar tasarlandı.
1. Her bir buton, standart Java GUI JButton sınıfından türetilerek override edildi. Bu sayede her butonun özel davranışları belirlendi.
1. Butonlara, GraphQL şema adresi barındıran özellikler eklendi. Her buton, belirli bir GraphQL şemasına işlem gerçekleştirebilecek.
1. Buton nesnesinin, GraphQL şemasına yazacağı bilgi, bir property olarak ayarlandı. Bu sayede her bir butonun işleyeceği bilgi esnek bir şekilde belirlenebiliyor.
1. Butonların aktif ve pasif renk özellikleri tanımlandı. Başlangıçta butonlar pasif renkte olup, tıklandığında aktif renge dönüşüyor.
1. Her butonun aktif ve pasif simge özellikleri belirlendi. Başlangıçta butonlar pasif simgeyi gösterirken, tıklama sonrasında aktif simgeye geçiyorlar.
1. Butonların text değerleri, renkleri ve simgeleri tasarım esnasında veya runtime anında dinamik olarak oluşturulabilir hale getirildi. Bu sayede kullanıcı etkileşimine göre görsel değişiklikler sağlanabiliyor.
1. Herhangi bir butona tıklandığında, belirlenen GraphQL şemasında bir mutation çalıştırma işlemi gerçekleştirildi. Bu, butonlara basılma olayına bağlı olarak belirtilen şemaya yazılım gerçekleştirmektedir.
## [Kullanım]()
1. Butonlara tıklanıldığında, görsel geri bildirim alacaksınız.
1. Eğer daha önce tıklanmış bir buton varsa, tekrar basılan buton aktif olacak ve diğer butonlar pasif hale gelecektir.
