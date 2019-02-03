package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.Id;

@Entity
public class RegistrationManager{
   private Set<Event> event;
   
   @OneToMany(mappedBy="registrationManager" , cascade={CascadeType.ALL})
   public Set<Event> getEvent() {
      return this.event;
   }
   
   public void setEvent(Set<Event> events) {
      this.event = events;
   }
   
   private Set<Registration> registration;
   
   @OneToMany(mappedBy="registrationManager" , cascade={CascadeType.ALL})
   public Set<Registration> getRegistration() {
      return this.registration;
   }
   
   public void setRegistration(Set<Registration> registrations) {
      this.registration = registrations;
   }
   
   private Set<Person> participants;
   
   @OneToMany(mappedBy="registrationManager" , cascade={CascadeType.ALL})
   public Set<Person> getParticipants() {
      return this.participants;
   }
   
   public void setParticipants(Set<Person> participantss) {
      this.participants = participantss;
   }
   
   private int extra;

public void setExtra(int value) {
    this.extra = value;
}
@Id
public int getExtra() {
    return this.extra;
}
}
