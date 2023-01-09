package com.gcit.JsonParser;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class JsonObjectMapper {
    public static void main(String args[]) throws IOException {
        Employee emp1 = new Employee();
        emp1.setFirstName("Raja");
        emp1.setLastName("Ramesh");
        emp1.setId(115);
        emp1.getTechnologies().add("Java");
        emp1.getTechnologies().add("Selenium");
        emp1.getTechnologies().add("C");
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp1);
        System.out.println(jsonStr);
        System.out.println("Deserializing JSON to Object:");
        Employee emp2 = mapper.readValue(jsonStr, Employee.class);
        System.out.println(emp2.getId() + " " + emp2.getFirstName() + " " + emp2.getLastName() + " " + emp2.getTechnologies());
    }
}
