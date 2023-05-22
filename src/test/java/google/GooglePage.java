package google;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

// page_url = https://www.google.com.br
public class GooglePage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id='APjFqb']")
    WebElement campoPesquisaGoogle;

    @FindBy(xpath = "//a[@href='https://www.nttdata.com/global/en/']")
    WebElement linkNttdataPagina;

    @FindBy(xpath = "//*[@id='ensCloseBanner']")
    WebElement botaoAceitarCookieNtt;

    @FindBy(xpath = "//*[text()[contains(.,'Careers')]]")
    WebElement textoDeBuscaMenu;

    @FindBy(xpath = "//a[@href='/global/en/careers/search-jobs?category=see-job']")
    WebElement linkSearchJobMenu;

    @FindBy(id = "search-jobs-query")
    WebElement campoPesquisarOportunidades;

//    @FindBy(xpath = "//*[text()[contains(.,'Arquiteto de Segurança')]]")
//    WebElement textoResultadoCareers;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void inserirPesquisaGoogle(String pesquisaCampoGoogle){
        campoPesquisaGoogle.sendKeys(pesquisaCampoGoogle + Keys.ENTER);
    }

    public void entrarLinkNttData(){
        linkNttdataPagina.click();
    }

    public void cookieNttData(){
        botaoAceitarCookieNtt.click();
    }

    public void menuNttCareer(){
        textoDeBuscaMenu.click();
    }

    public void pesquisaLinkJob(){
        linkSearchJobMenu.click();
    }

    public void inserirPalavraDaBusca(String oportunidadeNtt){
        campoPesquisarOportunidades.sendKeys(oportunidadeNtt + Keys.ENTER);
    }

//    public void resultadoPesquisaOportunidadeNtt(){
//        String resultadoOportunidade = textoResultadoCareers.getText().trim();
//        assertEquals("Arquiteto de Segurança", resultadoOportunidade);
//    }
}