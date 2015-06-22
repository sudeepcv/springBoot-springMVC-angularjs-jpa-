package basics.in.java.blogspot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import basics.in.java.blogspot.model.Comment;

@Repository("commentRepository")
public interface CommentRepository extends JpaRepository<Comment, Long> {
   @Modifying
   @Query("update Comment c set c.status=true where c.id=:commentId")
	void setStatus(@Param("commentId")Long commentId);

}
