package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Registration{
   private Integer id;

public void setId(Integer value) {
    this.id = value;
}
@Id
public Integer getId() {
    return this.id;
}
   private RegistrationManager registrationManager;
   
   @ManyToOne(optional=false)
   public RegistrationManager getRegistrationManager() {
      return this.registrationManager;
   }
   
   public void setRegistrationManager(RegistrationManager registrationManager) {
      this.registrationManager = registrationManager;
   }
   
   private Event event;
   
   @ManyToOne(optional=false)
   public Event getEvent() {
      return this.event;
   }
   
   public void setEvent(Event event) {
      this.event = event;
   }
   
   private Person participants;
   
   @ManyToOne(optional=false)
   public Person getParticipants() {
      return this.participants;
   }
   
   public void setParticipants(Person participants) {
      this.participants = participants;
   }
   
   }
