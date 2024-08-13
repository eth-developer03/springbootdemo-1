package project.second.test2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.second.test2.EmployeeEntity;
// used to store entity in db
public interface EmpRepository extends JpaRepository<EmployeeEntity, Long>{

}