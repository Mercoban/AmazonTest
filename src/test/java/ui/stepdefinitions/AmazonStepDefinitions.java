package ui.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import ui.pages.AmazonWebElements;
import ui.utilities.ConfigReader;
import ui.utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AmazonStepDefinitions {

AmazonWebElements amazonWebElements= new AmazonWebElements();
    Actions actions=new Actions(Driver.getDriver());
    Random random=new Random();
    Logger log = (Logger) LogManager.getLogger(AmazonStepDefinitions.class);
    static double priceToplam;

    @When("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        log.info("anasayfa açıldı");
    }
    @When("Açılan sayfada firma logosunun görünürlüğünü test eder")
    public void açılan_sayfada_firma_logosunun_görünürlüğünü_test_eder() {
        Assert.assertTrue(amazonWebElements.amazonLogo.isDisplayed());

    }
    @Then("Açılan sayfada site başlığının\\(title) {string} yazdığını doğrular")
    public void açılan_sayfada_site_başlığının_title_yazdığını_doğrular(String title) {

       // String ActualTitle = Driver.getDriver().getTitle();
       // String ExpectedTitle = "Amazon.com. Spend less. Smile more.";
      //  Assert.assertEquals(ActualTitle, ExpectedTitle);
       // System.out.println("Assert passed");

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon.com. Spend less. Smile more."));
    }

    @And("Sign in bolumune gider")
    public void signInBolumuneGider() {
       amazonWebElements.signIn.isDisplayed();

    }
    @And("New customer? Start here. kismina tiklar")
    public void newCustomerStartHereKisminaTiklar() {
 amazonWebElements.newCustomer.click();

    }

    @Given("Kullanici Your name yazar")
    public void kullanici_your_name_yazar() {
    amazonWebElements.yourName.sendKeys(ConfigReader.getProperty("yourName"));

    }
    @Given("Kullanici Mobile number or email yazar")
    public void kullanici_mobile_number_or_email_yazar() {
     amazonWebElements.mailAdresi.sendKeys(ConfigReader.getProperty("eMail"));
    }
    @Given("Kullanici Password olusturur")
    public void kullanici_password_olusturur() {
 amazonWebElements.password.sendKeys(ConfigReader.getProperty("password"));
    }
    @Given("Kullanici Re-enter password yazar")
    public void kullanici_re_enter_password_yazar() {
     amazonWebElements.rePassword.sendKeys(ConfigReader.getProperty("rePassword"));
    }

    @And("Continue kismina tiklar")
    public void continueKisminaTiklar() {
        amazonWebElements.continueButon.click();
    }
    @And("Hesabin olustugunu gorur")
    public void hesabinOlustugunuGorur() {
        Assert.assertTrue(amazonWebElements.mailDogrulamaYazisi.isDisplayed());

    }

    @Given("Sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() throws InterruptedException {

       amazonWebElements.signIn.click();

    }
    @Given("Kullanici email adresini yazar")
    public void kullanici_email_adresini_yazar() {
amazonWebElements.mailAdresi.sendKeys(ConfigReader.getProperty("eMail"));

    }
    @Given("Continue butonuna basar")
    public void continue_butonuna_basar() {
amazonWebElements.continueButon.click();
    }
    @Given("Kullanici Password yazar")
    public void kullanici_password_yazar() {
amazonWebElements.password.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("Signin butonuna  tiklar")
    public void signinButonunaTiklar() {
        amazonWebElements.signinPassword.click();
    }
    @Given("Siteye dogru bilgilerle girebildigini dogrular")
    public void siteye_dogru_bilgilerle_girebildigini_dogrular() {


        Assert.assertTrue(amazonWebElements.girisDogrulama.getText().contains("Hello, Jason")) ;

    }

    @Given("Kullanici All butonuna tiklar")
    public void kullanici_all_butonuna_tiklar() {
    amazonWebElements.allButonu.click();


    }
    @Given("Kullanici {string} menusunu secer")
    public void kullanici_menusunu_secer(String baslik) {
        for(int i =0 ; i<amazonWebElements.menu.size();i++){

            if( amazonWebElements.menu.get(i).getText().equals(baslik) ){

                amazonWebElements.menu.get(i).click();
            }
        }
    }
    @Then("Kullanici baslik sayisinin {int} oldugunu dogrular")
    public void kullanici_baslik_sayisinin_oldugunu_dogrular(int altMenuSayi) {
  Assert.assertEquals(amazonWebElements.altMenu.size()-3,altMenuSayi);

        List<String>altBasliklar=new ArrayList<>();
        altBasliklar.addAll(Arrays.asList("Computer Accessories & Peripherals",
                "Computer Components",
                "Computers & Tablets",
                "Data Storage",
                "External Components",
                "Laptop Accessories",
                "Monitors",
                "Networking Products",
                "Power Strips & Surge Protectors",
                "Printers",
                "Scanners",
                "Servers",
                "Tablet Accessories",
                "Tablet Replacement Parts",
                "Warranties & Services"));

        System.out.println(altBasliklar);

        List<String>yeniList=new ArrayList<>();

for(int i =0 ;i<amazonWebElements.altMenu.size();i++){

    yeniList.add(amazonWebElements.altMenu.get(i).getText());

}
        Assert.assertTrue(yeniList.containsAll(altBasliklar));
    }

    @Given("Kullanici yanlis email adresi girer")
    public void kullanici_yanlis_email_adresi_girer() {
        amazonWebElements.mailAdresi.sendKeys(ConfigReader.getProperty("invalidEmail"));

    }
    @Given("Hata mesaji gorur")
    public void hata_mesaji_gorur() {
        Assert.assertTrue(amazonWebElements.mailHataYazisi.isDisplayed());

    }

    @Given("Kullanici hatali Password yazar")
    public void kullanici_hatali_password_yazar() {
        amazonWebElements.password.sendKeys(ConfigReader.getProperty("invalidPassword"));

    }

    @And("hatali sifre mesaji gorur")
    public void hataliSifreMesajiGorur() {

      Assert.assertTrue(amazonWebElements.passwordHataYazisi.isDisplayed());

    }

    @And("Kullanıcı arama çubuğuna {string} yazar ve arama yapar")
    public void kullanıcıAramaÇubuğunaYazarVeAramaYapar(String arananKelime) {

       amazonWebElements.searchBox.sendKeys(arananKelime+ Keys.ENTER);

    }

    @Then("Kullanıcı listelenen tum urunlerin {string} ismini icerdigini gorur")
    public void kullanıcı_listelenen_tum_urunlerin_ismini_icerdigini_gorur(String arananKelime) {

        Assert.assertTrue(amazonWebElements.sonucYazisiElementi.getText().contains(arananKelime));
    }

    @Then("Kullanıcı listelenen tüm ürünleri fiyatlarına göre sıralar.")
    public void kullanıcıListelenenTümÜrünleriFiyatlarınaGöreSıralar() {

        amazonWebElements.filtreButton.click();
        amazonWebElements.dusukFiyat.click();
    }

    @And("Kullanıcı aradıgı ürün fiyatlarını dusukten yuksege sıralandıgını dogrular")
    public void kullanıcıAradıgıÜrünFiyatlarınıDusuktenYuksegeSıralandıgınıDogrular() {

     Assert.assertTrue(amazonWebElements.dusukFiyatYazisi.getText().contains("Price: Low to High"));


    }
    @Then("Arama kutusuna {string} yazar ve arama yapar")
    public void arama_kutusuna_yazar_ve_arama_yapar(String arananUrun) {
    amazonWebElements.searchBox.sendKeys(arananUrun+Keys.ENTER);
        int randomlySelectedProductIndex = (int) (Math.random()*amazonWebElements.productListOnThePage.size());
        amazonWebElements.productListOnThePage.get(randomlySelectedProductIndex).click();

        amazonWebElements.sepeteEkle.click();

        actions.click(amazonWebElements.sepeteEkle).perform();



    }
    @Then("Acilan sayfada gelen ilk urun tiklanir,sepete eklenir ve fiyatlari yazdirilir")
    public void acilan_sayfada_gelen_ilk_urun_tiklanir_sepete_eklenir_ve_fiyatlari_yazdirilir() throws InterruptedException {
        int randomlySelectedProductIndex = (int) (Math.random()*amazonWebElements.productListOnThePage.size());

amazonWebElements.productListOnThePage.get(randomlySelectedProductIndex).click();

amazonWebElements.sepeteEkle.click();

        actions.click(amazonWebElements.sepeteEkle).perform();
        Thread.sleep(1000);
        amazonWebElements.productListOnThePage.get(randomlySelectedProductIndex).click();

        amazonWebElements.sepeteEkle.click();

        actions.click(amazonWebElements.sepeteEkle).perform();
        Thread.sleep(1000);
        String price1=amazonWebElements.priceText.getText().toString();
        price1=price1.substring(1,"price1".length());

      System.out.println("price1");
      priceToplam+= Double.parseDouble(price1);


    }
    @Then("Sepetteki urunler ile secilen urunler karsilastirilarak dogrulanir.")
    public void sepetteki_urunler_ile_secilen_urunler_karsilastirilarak_dogrulanir() {

    }


    @And("Kullanici en alt tarafta bulunan Web Table kisminda herhangi bir linke tikladiginda ilgili dogru sayfanin acildigini gorur.")
        public void kullaniciEnAltTaraftaBulunanWebTableKismindaHerhangiBirLinkeTikladigindaIlgiliDogruSayfaninAcildiginiGorur() {

            amazonWebElements.bookDepository.click();
        }



    @Then("Dogru sayfa acildigini dogrular.")
    public void dogru_sayfa_acildigini_dogrular() {
Assert.assertTrue(amazonWebElements.bookDepositoryYazisi.isDisplayed());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Book Depository"));

    }

    @Then("Acilan sayfada gelen rasgele ürünler secerek alisveris sepeti olusturur")
    public void acilan_sayfada_gelen_rasgele_ürünler_secerek_alisveris_sepeti_olusturur() {

        Random random=new Random();
        int sayi=random.nextInt(5);
        amazonWebElements.randomProduct.get(sayi).click();

    }

    @And("Account & Lists acilir sekmesinde Create a List linkine tiklar.")
    public void account_lists_acilir_sekmesinde_create_a_list_linkine_tiklar() throws InterruptedException {
        actions.moveToElement(amazonWebElements.accountAndListsButton).perform();
        amazonWebElements.createListButton.click();
        Driver.wait(2);
    }

    @And("Yeni Shopping List'e isim verir ve Create List butonuna tiklar.")
    public void yeniShoppingListEIsimVerirVeCreateListButonunaTiklar() throws InterruptedException {
        amazonWebElements.listNameTextBox.clear();
        amazonWebElements.listNameTextBox.sendKeys(ConfigReader.getProperty("newListName"));
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Driver.wait(1);
     //   amazonWebElements.createListButton.click();
       // Driver.wait(3);



        actions.moveToElement(amazonWebElements.moreYazisi).perform();
        Driver.wait(5);
        //actions.keyDown(amazonWebElements.manageList,"1").click().perform();
       amazonWebElements.manageList.click();
       Driver.wait(5);
        amazonWebElements.deleteButonu.click();

        amazonWebElements.confirmDeleteButonu.click();


    }

    @Then("Your Lists sekmesi altinda yeni olusturulan listenin gorunurlugu test edilir.")
    public void yourListsSekmesiAltindaYeniOlusturulanListeninGorunurluguTestEdilir() {
        String actualNewListName = amazonWebElements.newListNameElement.getText();
        Assert.assertEquals(actualNewListName, ConfigReader.getProperty("newListName"));

    }

/*
    @And("Yeni Shopping List'e isim verir ve Create List butonuna tiklar.")
    public void yeniShoppingListEIsimVerirVeCreateListButonunaTiklar() throws InterruptedException {
        amazonWebElements.createList.click();
       Driver.wait(5);

     //  actions.moveToElement(amazonWebElements.By.id("list-name").click().perform();

      amazonWebElements.shopListTextBox.click();
      Driver.wait(3);
        amazonWebElements.shopListTextBox.clear();
        Driver.wait(3);
     amazonWebElements.shopListTextBox.sendKeys(ConfigReader.getProperty("newListName"));
       actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        amazonWebElements.createListButton.click();
        Driver.wait(1);
         amazonWebElements.moreYazisi.isDisplayed();
         amazonWebElements.manageList.click();
         amazonWebElements.deleteButonu.click();
         amazonWebElements.confirmDeleteButonu.click();


    }


    @Then("Your Lists sekmesi altinda yeni olusturulan listenin gorunurlugu test edilir.")
    public void yourListsSekmesiAltindaYeniOlusturulanListeninGorunurluguTestEdilir() throws InterruptedException {

        Assert.assertTrue(amazonWebElements.newListNameElement.isDisplayed());

       // String actualNewListName = amazonWebElements.newListNameElement.getText();
     //   Driver.wait(1);

      //  Assert.assertEquals(actualNewListName,ConfigReader.getProperty("newListName"));
    }
 */


@And("Arama butonuna aranan kelime yazilir ve aranir.")
public void arama_butonuna_aranan_kelime_yazilir_ve_aranir() {
    amazonWebElements.searchBox.sendKeys(ConfigReader.getProperty("arananKelime"));
    actions.sendKeys(Keys.ENTER).perform();
}
    @And("Istenilen urune tiklanir ve Add to List butonundan secerek istenilen listeye eklenir.")
      public void istenilen_urune_tiklanir_ve_add_to_list_butonundan_secerek_istenilen_listeye_eklenir() throws InterruptedException {
    amazonWebElements.searcResultDescriptionsList.clear();
    int random1 = random.nextInt(amazonWebElements.searcResultDescriptionsList.size());
    amazonWebElements.searcResultDescriptionsList.get(random1).click();
    amazonWebElements.wishlistOptionsButton.click();
    Driver.wait(1);
    amazonWebElements.wishListSecondOption.click();
    Driver.wait(3);
}
    @Then("Listede eklenen urunun varligi kontrol edilir.")
    public void listedeEklenenUrununVarligiKontrolEdilir() {
    Assert.assertTrue(amazonWebElements.addedListAssert.isDisplayed());
    }

    @And("Accounts & Lists sekmesinden urun silinmesi istenilen listeye tiklar.")
    public void accountsListsSekmesindenUrunSilinmesiIstenilenListeyeTiklar() {
        actions.moveToElement(amazonWebElements.accountAndListsButton).perform();
        amazonWebElements.muratYeniListButton.click();
    }

    @Then("Silmek istedigi urune ait Delete butonuna basar. Ilgili satirda Deleted yazisinin goruldugu test")
    public void silmekIstedigiUruneAitDeleteButonunaBasarIlgiliSatirdaDeletedYazisininGorulduguTest() {
        amazonWebElements.deleteItemButton.click();
     Assert.assertTrue(amazonWebElements.deletedAlert.isDisplayed());
    }

        @And ("sayfayi kapatir")
    public void sayfayi_kapatir() {

    Driver.closeDriver();
    }


    }

