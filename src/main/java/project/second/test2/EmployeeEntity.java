package project.second.test2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="emp_db")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) // automatic id
    private Long id;
    private String number;
    private String email;
    private String name;
}
