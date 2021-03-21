import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class serializerTest {

   private serializer serializerA;
   private ArrayList<String> phoneNumber;
   private Person a;

   @Before
   public void setUp() throws Exception {
       serializerA = new serializer();
       phoneNumber = new ArrayList<>(Arrays.asList("89015237424", "89016326384"));
       a = new Person("Иванов", "Иван", 13,
               new Address("Lenina, 1a", "Yaroslavl", "150010"), phoneNumber);
   }

    @Test
    public void serializerJson() {

        String json = serializerA.serializerJson(a);
        String right = "{\n" +
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

        Assert.assertEquals(right, json);
    }

    @Test
    public void serializerXml() throws JsonProcessingException {

        String right = "<Person><firstName>Иванов</firstName><lastName>Иван</lastName><age>13</age><address><streetAddress>Lenina, 1a</streetAddress><city>Yaroslavl</city><postalCode>150010</postalCode></address><phone><phone>89015237424</phone><phone>89016326384</phone></phone></Person>";

        String xml = serializerA.serializerXml(a);
        Assert.assertEquals(right, xml);
    }

    @Test
    public void serializerYaml() throws JsonProcessingException {

        String right = "---\n" +
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
        String yaml = serializerA.serializerYaml(a);
        Assert.assertEquals(right, yaml);
    }
}