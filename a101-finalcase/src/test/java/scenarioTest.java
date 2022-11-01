import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class scenarioTest {
    MemberShip membership=new MemberShip();
    @Before
    public void setUp(){
    }

    @Test
    public void scenario(){
        membership.logInButtonHover();
        membership.signUpButtonClick();
        membership.signUpPageButtonClick();
    }

    @After
    public void finish(){
    }
}


