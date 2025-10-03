package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = { "stepdefinitions" }, // GEREKİRSE: {"stepdefinitions","hooks"} yap
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },

        monochrome = false,                             // Konsol çıktısını okunabilir yapar
        tags = "@hmm"                                 // Sadece bu etikete sahip senaryoları çalıştırır

        // publish = true // (Opsiyonel) Konsolda public rapor linki

)
public class Runner {
    private static final Logger logger = LogManager.getLogger(Runner.class);

    @BeforeClass
    public static void setup() {
        logger.info("Cucumber Test Runner başlatılıyor...");
    }
}
