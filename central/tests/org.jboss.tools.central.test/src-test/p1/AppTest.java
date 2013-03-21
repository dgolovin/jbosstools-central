package p1;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.experimental.theories.suppliers.TestedOn;

public class AppTest {
    @Test
    public void testSlow() {
      System.out.println("slow");
    }

    @Test
    public void testSlower() {
      System.out.println("slower");
    }
  }
