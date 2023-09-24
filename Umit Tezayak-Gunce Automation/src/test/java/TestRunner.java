import base.BaseClass;
import org.junit.Test;
import static tests.HomePage.*;


public class TestRunner extends BaseClass {

@Test
    public void runScenario (){
    createAccount();
    addingTeammate();
    addExpense();

    }
}
