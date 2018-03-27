package com.passguard.hibernate.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "User")
@NamedQueries({
  @NamedQuery(
      name = "User.findByUsername",
      query = "select u from User u where u.username = :username")
})
public class User {
    
    @Id
    private String user_id;
    
    private String username;
    
    private String password;
    
    private Date last_login;
    
    private boolean login_success;


    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLast_login() {
        return last_login;
    }

    public void setLast_login(Date last_login) {
        this.last_login = last_login;
    }

    public boolean isLogin_success() {
        return login_success;
    }
    
    public void setLogin_success(boolean login_success) {
        this.login_success = login_success;
    }

    @Override
    public String toString() {
	    return "User{ id: " + user_id //
		    + ", username: " + username //
		    + ", password: " + password //
		    + ", last_login: " + last_login //
		    + ", login_success: " + login_success //
		    + "}";
	  }
}
