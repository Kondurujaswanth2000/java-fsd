package com.sample.insurance.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name = "user")
public class User_login 
{
    @Id
	@Column(name="user_name")
	private String userName;

	@Column(name="password")
	private String password;

    public User_login()
    {

    }

    public String getUserName() 
    {
        return userName;
    }

    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    
}
