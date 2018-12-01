/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserData;

import UserData.Task;

import UserData.Task;
import UserData.Task.STATUS;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author nghun
 * 
 */
public class Manager extends User {


    public Manager() {
        super();
        this.type = TYPE.MANAGER;
    }

    public Manager(String userName, String password, String fullName) {
        super(userName, password, fullName);
        this.type = TYPE.MANAGER;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Manager(String id,String userName, String password, String fullName) {
        super(id,userName, password, fullName);
        this.type = TYPE.CEO;
    }

    public void createTask() {

    }


}