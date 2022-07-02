package com.nanna.springboot.controller;

import javax.persistence.NamedNativeQueries;
import java.io.File;
import java.io.IOException;


public class NannaTestOk {

    public static void main(String[] args) {

        try {
            File nannaFile = new File("c:newFilecreted.txt");
            if(nannaFile.createNewFile()){
                System.out.println("file is created by name "+ nannaFile.getName());
            }
            else {
                System.out.println("File Is Already Exist in thsi Directory ");
            }
        } catch (IOException e) {
            System.out.println("SOMETHING WENT WRONG !!!!!!");
            e.printStackTrace();
        }


    }
}





