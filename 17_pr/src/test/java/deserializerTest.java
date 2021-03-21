import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class deserializerTest {

    private deserializer deserializerA;
    private ArrayList<String> phoneNumber;
    private Person b, a;

    @Before
    public void setUp() throws Exception {
        deserializerA  = new deserializer();;
        phoneNumber = new ArrayList<>(Arrays.asList("89015237424", "89016326384"));
        b = new Person("Иванов", "Иван", 13,
                new Address("Lenina, 1a", "Yaroslavl", "150010"), phoneNumber);
        a = new Person();
    }

    @Test
    public void deserializerJson() {

        String json = "{\n" +
                "  \"firstName\": \"Иванов\",\n" +
                "  \"lastName\": \"Иван\",\n" +
                "  \"age\": 13,\n" +
                "  \"address\": {\n" +
                "    \"streetAddress\": \"Lenina, 1a\",\n" +
                "    \"city\": \"Yaroslavl\",\n" +
                "    \"postalCode\": \"150010\"\n" +
                "  },\n" +
                "  \"phone\": [\n" +
                "    \"89015237424\",\n" +
                "    \"89016326384\"\n" +
                "  ]\n" +
                "}";

        a = deserializerA.deserializerJson(json);
        Assert.assertEquals(b, a);
    }

    @Test
    public void deserializerXml() throws JsonProcessingException {

        String xml = "<Person><firstName>Иванов</firstName><lastName>Иван</lastName><age>13</age><address><streetAddress>Lenina, 1a</streetAddress><city>Yaroslavl</city><postalCode>150010</postalCode></address><phone><phone>89015237424</phone><phone>89016326384</phone></phone></Person>";

        a = deserializerA.deserializerXml(xml);
        Assert.assertEquals(b, a);
    }

    @Test
    public void deserializerYaml() throws JsonProcessingException {

        String yaml = "---\n" +
                "firstName: \"Иванов\"\n" +
                "lastName: \"Иван\"\n" +
                "age: 13\n" +
                "address:\n" +
                "  streetAddress: \"Lenina, 1a\"\n" +
                "  city: \"Yaroslavl\"\n" +
                "  postalCode: \"150010\"\n" +
                "phone:\n" +
                "- \"89015237424\"\n" +
                "- \"89016326384\"\n";

        a = deserializerA.deserializerYaml(yaml);
        Assert.assertEquals(b, a);
    }
}