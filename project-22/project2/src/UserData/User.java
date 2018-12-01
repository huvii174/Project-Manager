/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserData;

import java.io.File;
import java.util.Date;
import java.util.Objects;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.UUID;


/**
 *
 * @author nghun
 */

public class User {

    public enum TYPE {
        MANAGER, DEVELOPER, TESTER, CEO
    }

    protected String userName;
    protected String password;
    protected String fullName;

    public String getId() {
        return id;
    }
    protected String id;
    public TYPE type;

    public User() {

    }

    public User(String userName, String password, String fullName) {
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;

        this.id= UUID.randomUUID().toString();
    }

    public User(String id, String userName, String password, String fullName) {
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = this.MD5(password);
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TYPE getType() {
        return type;
    }

    


    private String MD5(String md5) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {

        }
        return null;
    }

    public boolean checkPassword(String password) {
        if (this.MD5(password).equals(this.password)) return true;
        return false;
    }

    public void saveInFile(BufferedWriter buffer)   throws IOException {
        if(this.type == TYPE.CEO ) buffer.write("CEO,");
        if(this.type == TYPE.DEVELOPER ) buffer.write("Develper,");
        if(this.type == TYPE.MANAGER ) buffer.write("Manager,");
        if(this.type == TYPE.TESTER ) buffer.write("Tester,");
        buffer.write(this.getUserName());
        buffer.write(",");
        buffer.write(this.getPassword());
        buffer.write(",");
        buffer.write(this.getFullName());
        buffer.write(",");
        buffer.write(this.getId());
        buffer.newLine();
        buffer.close();
    }

}
