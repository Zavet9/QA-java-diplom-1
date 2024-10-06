import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

@RunWith(Parameterized.class)
public class BunTests {
    private final String name;
    private final float price;


    public BunTests(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] getBunAndPriceData() {
        return new Object[][]{
                {"black bun", 100.05F},
                {"white bun", 200},
                {"red bun", 300.50F},
                {"brown bun", 0.00F},
                {"pink bun", 500},
                {"green bun", 1600.00F},
        };
    }

    @Test
    public void getBunAndPrice() {
        Bun bun = new Bun(name, price);
        Assert.assertEquals(name, bun.getName());
        Assert.assertEquals(price, bun.getPrice(),0);
    }
}
