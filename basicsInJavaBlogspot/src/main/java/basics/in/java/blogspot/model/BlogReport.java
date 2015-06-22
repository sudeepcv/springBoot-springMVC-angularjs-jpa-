package basics.in.java.blogspot.model;

import java.util.Date;

public class BlogReport {
	
	private String title;
	private String blogContent;
	private Date date;
	private String name;
	private String commentContent;
	
	public BlogReport(String title,String blogContent,Date date,String name,String commentContent){
		this.title=title;
		this.blogContent=blogContent;
		this.date=date;
		this.name=name;
		this.commentContent=commentContent;
	}
	
	
	public String getBlogContent() {
		return blogContent;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public Date getDate() {
		return date;
	}
	public String getName() {
		return name;
	}
	public String getTitle() {
		return title;
	}
	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
