package com.gcit.JsonParser;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonDemo {
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

        System.out.println("Parsing Json String \n");
        JSONObject obj = new JSONObject(jsonString);

        String name = obj.getString("name");
        System.out.println("Name : " +name+ "\n");

        JSONObject addressObject = obj.getJSONObject("address");
        System.out.println("Address : " +addressObject+ "\n");

        String street = addressObject.getString("street");
        System.out.println("Street : "+street+ "\n");

        JSONArray employeesJSONArray = obj.getJSONArray("employees");
        System.out.println("Printing the employees json array : \n " +employeesJSONArray.toString()+"\n");

        JSONObject employeeJSONObject = employeesJSONArray.getJSONObject(0);
        String firstName = employeeJSONObject.getString("firstName");
        System.out.println("First Name of the employee at index 0 : " +firstName);
    }
}
