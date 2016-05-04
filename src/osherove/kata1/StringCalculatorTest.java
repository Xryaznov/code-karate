package osherove.kata1;

import org.junit.Test;

import javax.naming.ldap.ExtendedRequest;

import java.util.concurrent.ExecutorService;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test public void shouldReturnZero() throws Exception {
        assertEquals(0, new StringCalculator().add(""));
    }

    @Test public void shouldReturnValue() throws Exception {
        assertEquals(1, new StringCalculator().add("1"));
    }

    @Test public void shouldReturnSum() throws Exception {
        assertEquals(3, new StringCalculator().add("1,2"));
    }

    @Test public void shouldHandleNewLines() throws Exception {
        assertEquals(6, new StringCalculator().add("1\n2,3"));
    }

}
