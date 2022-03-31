package ConfigManager;

import Logging.Logging;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;

public class ConfigManager {
    private static JsonParser parser = new JsonParser();
    private static Reader reader;
    private static JsonObject jsonObject;

    public static String getInfoFromJSON(String fileName, String value)  {
            try {
                reader = new FileReader(String.format("src/test/java/Resources/%s.json",fileName));
            } catch (FileNotFoundException e) {
                Logging.getLogger().warning("File Not Found Exception");
                throw new RuntimeException();
            }
            jsonObject = (JsonObject) parser.parse(reader);

         return jsonObject.get(String.format("%s",value)).getAsString();
    }
}



