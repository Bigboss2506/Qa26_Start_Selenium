import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class LoginTests {

    @BeforeClass
    public void preCondition(){
        //open browser
        //open site
    }

    public void loginSuccess(){
        //open form (find element + click)
        //fill email (find element + click + clear + type)
        //fill password (find element + click + clear + type)
        //submit form (find element + click)
    }

    public void loginWrongEmail(){
        //open form
        //fill form
        //submit form
    }
    public void loginPassword(){
        //open form
        //fill form
        //submit form
    }
    public void loginUnregisteredUser(){
        //open form
        //fill form
        //submit form
    }
    @AfterClass
    public void postCondition(){
        //close browser
    }

}
