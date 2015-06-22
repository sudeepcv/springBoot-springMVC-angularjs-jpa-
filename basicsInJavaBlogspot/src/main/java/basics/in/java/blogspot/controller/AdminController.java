package basics.in.java.blogspot.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import basics.in.java.blogspot.model.BlogPost;
import basics.in.java.blogspot.repository.BlogRepository;
import basics.in.java.blogspot.repository.CommentRepository;
@RestController
public class AdminController {
	@Autowired
	ServletContext context;
	
	@Autowired
	private BlogRepository blogRepository;
	@Autowired
	private CommentRepository commentRepository;

	@RequestMapping(value="/blog",method=RequestMethod.POST)
	@Transactional
	public BlogPost blogPost(@RequestBody BlogPost blogpost ){
		BlogPost singlePost=blogRepository.findByTitleEquals(blogpost.getTitle());	
		return singlePost;
	}
	



	@RequestMapping("/adminhome")
	public List<BlogPost> adminHome(){
		List<BlogPost> allPost=blogRepository.findAll();				
		return allPost;
	}	  
   

    @RequestMapping(value="/addpostAction")
    @Transactional
    public BlogPost addpostAction(@RequestBody BlogPost blogpost ){
    	blogpost.setDate(new Date());    
    	blogRepository.save(blogpost);
    	   return blogpost;
    }
    @RequestMapping(value="/deletePost",method=RequestMethod.POST)
    public BlogPost  deletPost(@RequestBody BlogPost blogpost){
    	BlogPost deletedPost=blogRepository.findOne(blogpost.getId());
    	blogRepository.delete(blogpost);
    	return deletedPost;
    }

}
