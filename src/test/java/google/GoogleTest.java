package google;
import WebBrowserSetup.WebBrowserSetup;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class GoogleTest {
GooglePage objGooglePage;
WebBrowserSetup objWebBrowserSetup;

    @Test
    public void realizarPesquisaGoogleENttdata() {
        WebDriver driver = WebBrowserSetup.getInstance().getDriver();
        GooglePage GooglePage = PageFactory.initElements(driver, GooglePage.class);
        objGooglePage = new GooglePage(driver);

        objGooglePage.inserirPesquisaGoogle("nttdata");
        objGooglePage.entrarLinkNttData();
        objGooglePage.cookieNttData();
        objGooglePage.menuNttCareer();
        objGooglePage.pesquisaLinkJob();
        objGooglePage.inserirPalavraDaBusca("Arquiteto");
        driver.quit();
    }
}
