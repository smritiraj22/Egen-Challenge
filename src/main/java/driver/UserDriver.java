package driver;

import com.egen.challenge.service.IUserService;
import com.egen.challenge.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import spark.Spark;

import java.io.IOException;
import java.io.StringWriter;

/**
 * @author Smriti
 * The main class for testing my sparkJaava microwebservice
 * and Mongo DB persistece
 */
public class UserDriver {

    public static void main(String[] args) {

        IUserService service = new UserServiceImpl();

        Spark.get("/users", (req, res) -> {

            return dataToJson(service.listUsers());
        });
        Spark.post("/create", (req, res) -> {

            return service.create(req);
        });
        Spark.put("/update", (req, res) -> {

            return service.updateUser(req);
        });



    }

    /**
     * Jackson utility to convert data to Json
     * @param data
     * @return
     */
    public static String dataToJson(Object data) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            StringWriter sw = new StringWriter();
            mapper.writeValue(sw, data);
            return sw.toString();
        } catch (IOException e) {
            throw new RuntimeException("IOException from a StringWriter?");
        }
    }
}
