package project.second.test2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// employee structure or class
@Data // to avoid getters and setters of private field
@NoArgsConstructor
@AllArgsConstructor                                                                                                                                                                         
public class Employee {
    private Long id;
    private String number;
    private String email;
    private String name;

    public String getName(){
        return name;
    }

    public Long getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }

}
