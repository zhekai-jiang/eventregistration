package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;
import javax.persistence.OneToMany;

@Entity
public class Person{
private String name;
   
   public void setName(String value) {
this.name = value;
    }
@Id
public String getName() {
return this.name;
    }
private Set<Registration> registration;

@OneToMany(mappedBy="person")
public Set<Registration> getRegistration() {
   return this.registration;
}

public void setRegistration(Set<Registration> registrations) {
   this.registration = registrations;
}

}
