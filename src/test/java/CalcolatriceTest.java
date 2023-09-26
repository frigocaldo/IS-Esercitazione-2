import org.junit.Test;
import org.junit.Assert;

public class CalcolatriceTest {
    public Calcolatrice calcolatriceTest = new Calcolatrice();

    @Test
    public void testSomma(){
        Assert.assertTrue("Somma Corretta", calcolatriceTest.Addizione(10, 5)==15);
    }

    @Test
    public void testSottrazione(){
        Assert.assertTrue("Sottrazione Corretta", calcolatriceTest.Sottrazione(10, 5)==5);
    }

    @Test
    public void testDivisione(){
        Assert.assertTrue("Divisione Corretta", calcolatriceTest.Divisione(1, 2)==0.5);
    }

}
