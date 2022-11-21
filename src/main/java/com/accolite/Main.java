package com.accolite;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String args[]) throws Exception {

        try{
            Student std = new Student();
            std.setId(001);
            std.setName("Yousha");
            std.setAge(22);
            std.setPhone("8369989336");

            //Creating the ObjectMapper object
            //ObjectMapper mapper = new ObjectMapper();

            // convert user object to JSON
            String json = new ObjectMapper().writeValueAsString(std);
            // print JSON string
            System.out.println(json);

        } catch(Exception e){
            e.printStackTrace();

        }
    }
}