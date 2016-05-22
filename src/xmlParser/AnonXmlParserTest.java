package xmlParser;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertTrue;

public class AnonXmlParserTest {
    static File file = new File("myscan.txt");
    static AnonXmlParser xmlParser = new AnonXmlParser();

    @Test
    public void getAttributesCaseEndtime() throws Exception {
        assertTrue(xmlParser.getAttributes(file).contains("endtime"));
    }

    @Test
    public void getAttributeValuesCaseEndtime() throws Exception {
        assertTrue(xmlParser.getAttributeValues("endtime").contains("1463478398\n"));
    }

}