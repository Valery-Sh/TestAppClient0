package org.cdms.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author V. Shyshkin
 */
public class User implements Serializable {
    private long id;
    private long version;
    
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private List<Permission> permissions = new ArrayList<Permission>();    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
    

}
