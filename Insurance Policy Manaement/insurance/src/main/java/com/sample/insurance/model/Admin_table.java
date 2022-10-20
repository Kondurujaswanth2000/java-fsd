package com.sample.insurance.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="admin_table")
public class Admin_table 
{
    @Id
	@Column(name="aid")
	private String aid;

	@Column(name="username")
	private String username;

	@Column(name="password")
	private String password;

    public Admin_table()
    {

    }

    public Admin_table(String aid, String username, String password) 
    {
        this.aid = aid;
        this.username = username;
        this.password = password;
    }
    
    public String getAid() 
    {
        return aid;
    }

    public void setAid(String aid) 
    {
        this.aid = aid;
    }

    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) 
    {
        this.username = username;
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
