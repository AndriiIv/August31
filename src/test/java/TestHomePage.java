import org.testng.annotations.Test;

public class TestHomePage extends BaseTest{

    @Test

    public void goToWebSite(){
        HomePage homePage = new HomePage(driver);
        homePage.openUrl();
    }
}
