package com.gcit.JsonParser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Person {

        String name;
        int age;
        boolean hasId;

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            this.age = age;
        }

        public boolean isHasId () {
            return hasId;
        }

        public void setHasId ( boolean hasId){
            this.hasId = hasId;
        }
        static ObjectMapper mapper = new ObjectMapper();
        static String jsonStr = "{"
                + "\"name\" :\"Nathan\","
                + "\"age\": \"22\","
                + "\"hasId\": \"true\" "
                + "}";
        public static void main(String args[]) throws JsonProcessingException {

        Person me = mapper.readValue(jsonStr, Person.class);

        System.out.println(me.name);
        System.out.println(me.age);
        System.out.println(me.hasId);

    }

}
