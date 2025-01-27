package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//cucumberı kullanmak için aşağıdaki konfigurasyonu kullanmamız gerekir
@RunWith(Cucumber.class)
@CucumberOptions(
        //önce features tanımlamalıyız yani benm test senaryolarım nerede onun tanımını yapmamız lazım
        features = "src/test/java/features",
        //tanımlıyacağımız sınıfların hangii pakette oldupunu göstermek için
        glue = "stepDefinitions",
        //nasıl biir çalıştırma yapısı raporlama yapısı kullanacağımızı belirtmek için de
        plugin = {"pretty","html:target/cucumber-html-report.html"}
        //feature dosyasının içinde tanımladığımız taglere göre hangisini çalıştırmak istiyorsak bu şekilde kullanabiliriz
        //tags = "@SmokeTest"
)
public class TestRunner {
}
