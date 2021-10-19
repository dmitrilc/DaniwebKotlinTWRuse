package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaTest {
    public void tryWithResource() {
        try(var reader = new BufferedReader(new FileReader(""))){ //1
            //do nothing
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void tryWithResources(){
        try(var reader = new BufferedReader(new FileReader(""));
        var reader2 = new BufferedReader(new FileReader("/"))){ //1
            //do nothing
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
