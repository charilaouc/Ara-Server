package com.andromeda.araserver.skills;

import com.andromeda.araserver.util.OutputModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;


public class Hello {
    public String hello() {
        //new Gson instance
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson output = gsonBuilder.create();
        ArrayList<OutputModel> test = new ArrayList<>();
        //say hi
        test.add(new OutputModel("hi", "hi", "hi", "hi", "Hello Human", ""));
        //return string value
        return output.toJson(test);
    }
}
