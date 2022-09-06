package repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.Admin;
public interface AdminRepo extends JpaRepository<Admin, Integer> {
}