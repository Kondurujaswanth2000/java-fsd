package com.sample.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sample.insurance.model.Admin_table;

public interface AdminRepository extends JpaRepository<Admin_table, String>
{
    @Query("SELECT a FROM Admin_table a WHERE a.username =?1 and a.password=?2")
    public Admin_table validateAdmin(String username,String password);
}
