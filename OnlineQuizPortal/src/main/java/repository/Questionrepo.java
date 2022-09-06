package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.bean.Question;

@Repository
public interface Questionrepo extends JpaRepository<Question, Integer> {
}
