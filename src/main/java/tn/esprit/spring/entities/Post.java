package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Post implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idPost;
	private String content;
	
	private int  likes;
	private int  dislikes;
	private int views;
	private String subject;
	
	
	
	
	
	
	
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="post")
	private Set<Comment> comments ;
	
	 @ManyToOne
	    private User user;
}
