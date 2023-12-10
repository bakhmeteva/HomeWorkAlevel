package ua.bakhmeteva.hw13;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import ua.bakhmeteva.hw13.Box.Box;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BoxDemo {
    public static void main(String[] args) {
        Box box = readBoxFromJson();
        System.out.println(box);
    }


    private static Box readBoxFromJson() {

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/ua/bakhmeteva/hw13/box.json"))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }
            JsonObject jsonObject = JsonParser.parseString(jsonContent.toString()).getAsJsonObject();
            Box box = new Gson().fromJson(jsonObject, Box.class);
            return box;
        } catch (IOException e) {
            e.printStackTrace();
            return new Box();
        }
    }


}