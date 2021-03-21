import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.google.gson.Gson;

public class deserializer {

    Person deserializerJson(String json){
        Person b = new Gson().fromJson(json, Person.class);
        return b;
    }

    Person deserializerXml(String xml) throws JsonProcessingException {
        Person b = new XmlMapper().readValue(xml, Person.class);
        return b;
    }

    Person deserializerYaml(String yaml)throws JsonProcessingException {
        Person b = new ObjectMapper(new YAMLFactory()).readValue(yaml, Person.class);
        return b;
    }
}
