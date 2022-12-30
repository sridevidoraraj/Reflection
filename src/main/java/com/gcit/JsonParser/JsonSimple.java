package com.gcit.JsonParser;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSimple {
    public static void main(String args[]){
        String jsonString = "{"
                + "  \"name\": \"GCIT\","
                + "  \"type\": \"blog\","
                + "  \"address\": {"
                + "    \"street\": \"16,Narmada Street\","
                + "    \"city\": \"Chennai\","
                + "    \"state\": \"TamilNadu\""
                + "  },"
                + "  \"employees\": ["
                + "    {"
                + "      \"firstName\": \"John\","
                + "      \"lastName\": \"David\""
                + "    },"
                + "    {"
                + "      \"firstName\": \"Anna\","
                + "      \"lastName\": \"Smith\""
                + "    },"
                + "    {"
                + "      \"firstName\": \"Peter\","
                + "      \"lastName\": \"Jones\""
                + "    }"
                + "  ]"
                + "}";
        System.out.println("Parsing the json string in java using json-simple......\n");

        JSONParser parser = new JSONParser();
        JSONObject obj = new JSONObject();
        try {
            obj = (JSONObject) parser.parse(jsonString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String name = (String) obj.get("name");
        System.out.println("Name: "+name+"\n");

        JSONObject addressJSONObject = (JSONObject) obj.get("address");

        String street = (String) addressJSONObject.get("street");
        System.out.println("Street: "+street+"\n");

        JSONArray employeesJSONArray = (JSONArray) obj.get("employees");
        System.out.println("Printing the employees json array: \n"+employeesJSONArray.toString()+"\n");

        JSONObject employeeJSONObject = (JSONObject) employeesJSONArray.get(0);
        String firstName = (String) employeeJSONObject.get("firstName");
        System.out.println("First Name of the employee at index 0: "+firstName);
    }

}
