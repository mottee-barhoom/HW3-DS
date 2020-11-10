package mb.hw3.controller;
import java.util.ArrayList;
import java.util.List;
import mb.hw3.model.Student;
import mb.hw3.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
 /**
 *
 * @author M M BARHOOM
 */
@RestController
@RequestMapping(value = "/student")
public class StudentsController {

    private List<Student> students = new ArrayList<>();
    @Autowired
    StudentsRepository studentsRepository;
	
	@GetMapping
	public List<Student> findAll() {
        return studentsRepository.findAll();
        }
        @GetMapping("/{id}")
	public Student findById(@PathVariable Integer id) {
        return studentsRepository.findById(id).get();
        }
        
        @GetMapping("/byname/{name}")
	public Student findFirstByName(@PathVariable String name) {
        return studentsRepository.findFirstByName(name);
	}
	
	@PostMapping
	public Student add(@RequestBody Student s) {
        studentsRepository.save(s);
        return s;
        }
        
      
}
