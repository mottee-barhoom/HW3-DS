package mb.hw3.repository;

import mb.hw3.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author M M BARHOOM
 */
public interface StudentsRepository extends JpaRepository<Student, Integer> {
    Student findFirstByName(String name);

}
