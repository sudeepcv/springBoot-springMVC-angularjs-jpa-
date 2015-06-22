package basics.in.java.blogspot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
public class BlogPost {
	@Id	
	@GeneratedValue
	private Long id;
	private String title;
	@OneToMany(mappedBy="blogPost",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Comment> comments=new ArrayList<Comment>();
	public List<Comment> getComments() {
		return comments;
	}
	
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	@Column(columnDefinition="TEXT",length = 5000)
	private String content;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	public String getContent() {
		return content;
	}
	public Date getDate() {
		return date;
	}
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}	

}
