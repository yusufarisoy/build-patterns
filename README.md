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
