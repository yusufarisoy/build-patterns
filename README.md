## Yazılım Mimarisi ve Tasarımı
Yazılım Mimarisi ve Tasarımı Dersi Proje Ödevi

## Factory Method Tasarım Deseni
Bu tasarım deseni bir süper sınıfa sahip olduğumuz ve bu sınıftan çoklu sayıda başka sınıf türeteceğimiz zaman, alt sınıflardan yalnız bir tanesinden nesne oluşturulacaksa, kullanılır. Hangi alt sınıftan nesne oluşturulacağı kararı
fabrika sınıf tarafından, yordam içinde verilir. Böylece nesne oluşturma yükü arayüze verilir ve sistemin yükü hafifletilir. Fabrika yordam deseni sistem ve arayüzler arasındaki hiyerarşiyi soyutlama ile sağlar, ayrıca yazılan kodu
daha sağlam, daha az karışık ve kolay güncellenebilir yapar.


![FactoryDesignClass](https://github.com/yusufarisoy/yazilim-mimarisi-ve-tasarimi/blob/master/FactoryDesignPatternClass.png)

Yukarıda örnek uygulamanın sınıf diyagramı verilmiştir. Bilgisayar arayüzü oluşturulmuş ve 3 metot taslak olarak tanımlanmıştır. Bilgisayar arayüzünden de Server ve PC sınıfları türetilmiştir. Sınıfa göre dönecek tür ve bilgiler BilgisayarFactory Fabrika Yordamı tarafından kararlaştırılır. Nesne oluşturma işlemini istemcinin yapılmaması istenmektedir ve kodlama buna göre yapılmıştır. 

![BilgisayarFactory](https://github.com/yusufarisoy/yazilim-mimarisi-ve-tasarimi/blob/master/bilgisayarFactory.png)

Burada Get_Bilgisayar metodu işi üstlenir ve nesneyi oluşturur. Sınıf içerisinde yalnızca nesne oluşturmak zorunlu değildir, nesne yaratma ile ilgili diğer işlemler de burada yapılarak bir arada yazılabilir.


## Kurucu (Builder) Tasarım Deseni
Oluşturulacak nesne çok fazla özelliğe sahip olduğu zaman Fabrika ve Soyut Fabrika yordamlarında önemli sorunlar baş gösterir. İstemci tarafından Fabrika sınıflarına geçirilecek çok fazla özellik olacağından hatalarla karşılaşılır.
Bazı özellikler tercihe bağlı bırakılmak istenirse Fabrika yordamları buna imkan vermemektedir. Kurucu (Builder) Tasarım Deseni ile bu sorunlar önlenmektedir. Kurucu sınıfın yapıcı fonksiyonunda bütün gerekli özellikler verilmelidir.
Ayrıca tercihe bağlı özellikler için Kurucu sınıf metotlara sahip olmalıdır.

![BuilderDesignClass](https://github.com/yusufarisoy/yazilim-mimarisi-ve-tasarimi/blob/master/BuilderDesignPatternClass.png)

Örnek uygulamanın sınıf diyagramı yukarıda verilmiştir. Bir Bilgisayar sınıfı oluşturulmuş ve bir de statik BilgisayarKurucu sınıfı oluşturulmuştur. Nesne yaratma işlemini gerekli ve isteğe bağlı parametrelerle kurucu sınıf oluşturmaktadır.

![BuilderDesignKur](https://github.com/yusufarisoy/yazilim-mimarisi-ve-tasarimi/blob/master/builderKur.png)

Kurucu sınıfın kur metodu Bilgisayar tipinde bir nesne oluşturup döndürmektedir.


## Vekil (Proxy) Tasarım Deseni
Vekil tasarım deseni, structural grubuna ait oluşturulması karmaşık veya zaman alan işlemlerin kontrolünü sağlamada kullanılır.Proxy tasarım deseni çalışma maliyeti yüksek işlemlerin olduğu yapılarda, web servisi kullanılan yapılarda, operasyonun gerçekleştirilmesinden önce hazırlık yapılması veya ön işlem yapılması durumlarında kullanılır. Uygulanışı basit bir tasarım desenidir.
Tasarımda bazı sınıfların, nesnelerin veya işlemlerin görevlerini ve süreçteki işlevsel hallerini bir başka nesne üzerinde kontrol edebilir ve sorumluluğu bu nesneye yükleyebiliriz. Daha net bir ifadeyle, nesnelerin süreçteki vekaletini başka bir sınıfa devredebiliriz. Sınıf diyagramı aşağıda görülmektedir. 

![ProxyDesignClass](https://github.com/yusufarisoy/yazilim-mimarisi-ve-tasarimi/blob/master/ProxyDesignPattern.png)

Örnek uygulamada bir interface oluşturulmuş ve connectTo() fonksiyonunun taslağı verilmiştir. RealInternet sınıfında aşırı yükleme yapılarak bağlanma işlemi simüle edilmiştir. ProxyInternet sınıfında java.util.List import edilmiş ve yasaklanan sitelerin adresleri listeye eklenmiştir. Aşağıda görüldüğü gibi, eğer bağlanılacak adres yasaklı listede mevcut ise exception atılması sağlanmıştır. 

![ConnectToOverride](https://github.com/yusufarisoy/yazilim-mimarisi-ve-tasarimi/blob/master/connectTo.png)

Vekil desenin avantajlarından ilki güvenliktir. Aynı nesnenin iki kez oluşturulmasının önüne geçilir ve bu durum gereksiz hafıza kullanımının önüne geçmektedir. Böylece uygulamanın performansı da iyileştirilmiş olur. Ayrıca vekil sınıf bağlanılan adresi doğru olmasını, remote code kullanarak garantiler.
