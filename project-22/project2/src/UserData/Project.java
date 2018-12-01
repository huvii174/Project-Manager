/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserData;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import UserData.Task;

/**
 *
 * @author nghun
 */
public class Project {
    public String name;
    public String prjID;
    public String mnID;
    public ArrayList<Task> task;
    public ArrayList<User> user;

    public Project(String name, String prjID, String mnID, ArrayList<Task> task, ArrayList<User> user) {
        this.name = name;
        this.prjID = prjID;
        this.mnID = mnID;
        this.task = task;
        this.user = user;
    }

    public void saveinFile(BufferedWriter buffer)   throws IOException {
        buffer.write(this.prjID);
        buffer.newLine();
        buffer.write(this.name);
        buffer.newLine();
        buffer.write(this.mnID);
        buffer.newLine();
        buffer.write("Task: ");
        buffer.newLine();
        for(int i = 0 ; i< this.task.size();i++)
        {
            this.task.get(i).saveInFile(buffer);
            buffer.newLine();
        }
        buffer.newLine();
        buffer.write("Employees ");
        buffer.newLine();
        for(int i = 0 ; i< this.user.size();i++)
        {
            this.user.get(i).saveInFile(buffer);
        }
        buffer.newLine();
    }
    
}
