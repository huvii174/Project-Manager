/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserData;

import java.io.File;
import java.util.List;

/**
 *
 * @author nghun
 */
public class CEO extends User {
    public CEO() {
        super();
        this.type = TYPE.CEO;
    }

    public CEO(String userName, String password, String fullName) {
        super(userName, password, fullName);
        this.type = TYPE.CEO;
    }

    public CEO(String id,String userName, String password, String fullName) {
        super(id,userName, password, fullName);
        this.type = TYPE.CEO;
    }

    public void createUser() {

    }

    public void createProject() {

    }
}

