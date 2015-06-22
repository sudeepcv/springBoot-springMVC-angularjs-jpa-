package basics.in.java.blogspot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import basics.in.java.blogspot.model.BlogPost;
import basics.in.java.blogspot.model.BlogReport;
@Repository("blogRepository")
public interface BlogRepository extends JpaRepository<BlogPost,Long> {

	BlogPost findByTitleEquals(String postTitle);
    @Query("Select new basics.in.java.blogspot.model.BlogReport(b.title,b.content,b.date,c.name,c.content) from BlogPost b,Comment c where b.id=c.blogPost.id AND b.id=:blogId AND c.status=true")
	List<BlogReport> getBlogReport(@Param("blogId") Long blogId);
	@Query("Select b.title from BlogPost b where UPPER(b.title) like :strwithwild")
    List getAllBlogTitles(@Param(value="strwithwild")String strwithwild);
	List<BlogPost> findByTitleContainingIgnoreCase(String blogTitle);


}
