package com.sample.insurance.model;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User_register 
{
    //@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private String userid;
    
    @Id
	@Column(name = "user_name")
	private String userName;

	@Column(name = "email")
	private String email;

	@Column(name = "mobile")
	private long mobile;

	@Column(name = "password")
	private String password;

    public User_register()
    {
        
    }

    public User_register(String userid, String userName, String email, long mobile, String password) 
    {
        this.userid = userid;
        this.userName = userName;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
    }

    public String getUserid() 
    {
        return userid;
    }

    public void setUserid(String userid) 
    {
        this.userid = userid;
    }

    public String getUserName() 
    {
        return userName;
    }

    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public long getMobile() 
    {
        return mobile;
    }

    public void setMobile(long mobile) 
    {
        this.mobile = mobile;
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
