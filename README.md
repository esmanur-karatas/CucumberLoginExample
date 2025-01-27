# Proje Açıklaması

Bu proje, **Cucumber** framework'ünü kullanarak basit bir web otomasyon testi senaryosu geliştirme amacıyla oluşturulmuştur. **Cucumber**, BDD (Behavior-Driven Development) yaklaşımını destekleyen bir test otomasyon aracıdır ve testlerin hem teknik hem de teknik olmayan ekipler tarafından anlaşılabilir bir şekilde yazılmasına olanak tanır.

## Proje İçeriği

Proje kapsamında şu teknolojiler ve yöntemler kullanılmış ve öğrenilmiştir:

1. **Cucumber Konfigürasyonu**
   - `@RunWith` ve `@CucumberOptions` anotasyonlarıyla test senaryolarının yapılandırılması.
   - `features`, `glue`, ve `plugin` ayarlarıyla senaryoların ve raporlamaların yönetimi.

2. **Page Object Model (POM)**
   - Testlerde kullanılan sayfa elementlerinin ve işlemlerinin ayrı bir sınıfta düzenlenmesi.
   - `PageFactory` yapısı kullanılarak elementlerin tanımlanması.

3. **Scenario Outline Kullanımı**
   - Farklı kullanıcı bilgileriyle aynı senaryonun tekrar test edilmesi.

4. **JUnit ile Entegrasyon**
   - Testlerin JUnit framework'ü üzerinden çalıştırılması ve sonuçların doğrulanması.

5. **Driver Yönetimi**
   - WebDriver kurulum ve yönetimi için `utilities.Driver` sınıfının kullanımı.
   - Singleton tasarım deseni ile tek bir WebDriver örneği üzerinden işlem yapılması.

6. **BDD ve Gherkin Syntax**
   - **Feature** dosyaları içerisinde anlaşılır bir şekilde test adımlarının yazılması.
   - `Given`, `When`, `Then`, `And` gibi anahtar kelimelerin senaryolarda kullanılması.

## Test Senaryoları

1. **Login Testi**
   - Kullanıcı, geçerli bir kullanıcı adı ve şifre girerek başarıyla giriş yapar.

2. **Ana Sayfa Yüklenme Testi**
   - Ana sayfanın yüklenip yüklenmediği kontrol edilir ve belirli bir metin doğrulanır.

## Kullanılan Araçlar ve Teknolojiler
- **Java**: Test senaryolarının yazılması.
- **Selenium WebDriver**: Web tarayıcısının otomasyonu.
- **JUnit**: Testlerin çalıştırılması.
- **Cucumber**: BDD tabanlı senaryoların oluşturulması ve yürütülmesi.
- **WebDriverManager**: WebDriver kurulum işlemlerinin otomasyonu.

Bu proje, hem test otomasyonu araçlarını daha iyi anlamak hem de BDD yaklaşımını gerçek bir senaryoda uygulamak için oluşturulmuştur.


![image](https://github.com/user-attachments/assets/d51a3de2-7bc3-4251-92e8-dd9857a8d06b)
