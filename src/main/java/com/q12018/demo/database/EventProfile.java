/**
 * 
 */
package com.q12018.demo.database;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/*CREATE TABLE EVENT_PROFILE (
		 EVENT_ID SERIAL PRIMARY KEY,
		 EVENT_NAME text,
		 EVENT_TAG_LINE text
		);
insert into EVENT_PROFILE (EVENT_NAME,EVENT_TAG_LINE) values ('Q1 2018 Goal', 'Demo Project for Q1 2018 Goal. This content is getting fetched from Postgres Database');*/
/**
 * POJO to handle event profiles
 *
 */
@Table(name="EVENT_PROFILE")
@Entity
@SequenceGenerator(name="EventProfileIdSeq", sequenceName="event_profile_event_id_seq")
public class EventProfile implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name="EVENT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EventProfileIdSeq")
    private Integer eventId;
	
	@Column(name="EVENT_NAME")
	private String eventName;
    
    @Column(name="EVENT_TAG_LINE")
    private String eventTagLine;

	/**
	 * @return the eventId
	 */
	public Integer getEventId() {
		return eventId;
	}

	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	/**
	 * @return the eventTagLine
	 */
	public String getEventTagLine() {
		return eventTagLine;
	}

	/**
	 * @param eventTagLine the eventTagLine to set
	 */
	public void setEventTagLine(String eventTagLine) {
		this.eventTagLine = eventTagLine;
	}   
    
    
  
}