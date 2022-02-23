package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;



import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Travel implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idTravel;
	private String destination;		
	@Temporal(TemporalType.DATE)
    private Date startDate;	
	@Temporal(TemporalType.DATE)
    private Date endDate;	
	@Enumerated(EnumType.STRING)
	private Objet objet;
	
	
	@ManyToOne
	private User user;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="travel")
	private Set<TravelPlanning> travelplannings ;
}