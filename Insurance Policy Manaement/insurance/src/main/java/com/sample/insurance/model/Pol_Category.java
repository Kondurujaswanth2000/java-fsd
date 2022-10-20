package com.sample.insurance.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pol_category")
public class Pol_Category 
{
    @Id
	@Column(name = "category")
	private String category;

    public Pol_Category()
    {

    }

    public Pol_Category(String category) 
    {
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }

    public void setCategory(String category) 
    {
        this.category = category;
    }

}
