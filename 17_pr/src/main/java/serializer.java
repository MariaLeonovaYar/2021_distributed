import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class serializer {

    String serializerJson(Person a){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(a);
        return json;
    }

    String serializerXml(Person a) throws JsonProcessingException {
        XmlMapper mapper = new XmlMapper();
        //чтобы можно было не использовать геттеры
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        String xml = mapper.writeValueAsString(a);
        return xml;
    }

    String serializerYaml(Person a) throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper(new YAMLFactory());
        String yaml = om.writeValueAsString(a);
        return  yaml;
    }
}
