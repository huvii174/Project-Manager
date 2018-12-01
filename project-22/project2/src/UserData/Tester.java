/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserData;

import java.io.File;

/**
 *
 * @author nghun
 */
public class Tester extends User {

    public Tester() {
        super();
        this.type = TYPE.TESTER;    
        
    }

    public Tester(String id, String userName, String password, String fullName) {
        super(id, userName, password, fullName);
    }

    

    

}
