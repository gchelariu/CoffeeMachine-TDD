import com.sda.aparatcafea.Coffe;
import com.sda.aparatcafea.CoffeMachine;
import org.junit.Test;

import static com.sda.aparatcafea.ECoffeType.CAPPUCCINO;
import static com.sda.aparatcafea.ECoffeType.ESPRESSO;
import static org.junit.Assert.assertEquals;

public class CoffeMachineShould {

    @Test
    public void brewEspressoWhenStockAvailable() {
        CoffeMachine m = new CoffeMachine();
        Coffe c = m.brew(ESPRESSO);

        assertEquals(ESPRESSO, c.getCoffeType());
    }

    @Test
    public void brewCappuccinoWhenStockAvailable() {
        CoffeMachine m = new CoffeMachine();
        Coffe c = m.brew(CAPPUCCINO);

        assertEquals(CAPPUCCINO, c.getCoffeType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void brewCappuccinoTillZeroStock() {
        CoffeMachine m = new CoffeMachine();

        for (int i = 0; i < 10; i++) {
            Coffe c = m.brew(CAPPUCCINO);
        }
    }

    @Test
    public void brewEspressoWhenNotEnoughStockAfterRestock() {
        CoffeMachine m = new CoffeMachine();
        Coffe c = null;
        int count = 0;
        for (int i = 0; i < 100; i++) {
            try {
                c = m.brew(ESPRESSO);
            } catch (IllegalArgumentException ex) {
                m.restock();
                count++;
            }
        }
        assertEquals(ESPRESSO, c.getCoffeType());
        assertEquals(14, count);
    }
}
