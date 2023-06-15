import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import xyz.alifhaikal88.mybatis.App;
import xyz.alifhaikal88.mybatis.Coffee;
import xyz.alifhaikal88.mybatis.CoffeeService;

@SpringBootTest(classes = {App.class})
public class CoffeeTestCase {

    @Autowired
    private CoffeeService coffeeService;

    @Test
    public void testSaveCoffee() {

        Coffee coffee = new Coffee();
        coffee.setName("Latte");
        coffeeService.saveCoffee(coffee);

        Assert.notNull(coffee.getId(), "Coffee ID should be null");
    }
}
