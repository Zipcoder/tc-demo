package rocks.zipcodewilmington.week8.p10032018;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import rocks.zipcodewilmington.Person;

/**
 * @author leon on 03/10/2018.
 */
public class RowMapperExample {
    @Test
    public void generateJSONStringAutomatically() throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        String jsonValue = om.writeValueAsString(new Person(0, "", null));
        System.out.println(jsonValue);
    }
}
