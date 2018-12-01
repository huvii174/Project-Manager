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

/**
 *
 * @author nghun
 */


public class Task {

    public enum STATUS { CREATED, ASSIGNED, STARTED, COMPLETED, DONE, REJECT, CLOSED}
    public String prjID;
    public ArrayList<Developer> developer;
    public ArrayList<Tester> tester;
    public Date createdDate;
    public Date endDate;
    public STATUS status;

    public Task(String prjID, ArrayList<Developer> developer, ArrayList<Tester> tester, Date createdDate, Date endDate, STATUS status) {
        this.prjID = prjID;
        this.developer = developer;
        this.tester = tester;
        this.createdDate = createdDate;
        this.endDate = endDate;
        this.status = status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }
    



    
    
    public void saveInFile (BufferedWriter buffer)   throws IOException {
        buffer.write(this.prjID);
        buffer.newLine();
        buffer.write(this.createdDate.toString());
        buffer.newLine();
        buffer.write(this.endDate.toString());
        buffer.newLine();
        if(this.status == STATUS.CREATED) buffer.write("Created");
        if(this.status == STATUS.ASSIGNED) buffer.write("Assigned");
        if(this.status == STATUS.STARTED) buffer.write("Started");
        if(this.status == STATUS.COMPLETED) buffer.write("Completed");
        if(this.status == STATUS.DONE) buffer.write("Done");
        if(this.status == STATUS.REJECT) buffer.write("Reject");
        if(this.status == STATUS.CLOSED) buffer.write("Closed");
        for (int i = 0;i<this.developer.size();i++)
        {
            buffer.write(this.developer.get(i).getId());
            buffer.write(",");
        }
        buffer.newLine();
        for (int i = 0;i<this.tester.size();i++)
        {
            buffer.write(this.tester.get(i).getId());
            buffer.write(",");
        }
        buffer.newLine();
        buffer.close();
        
    }
    
}
