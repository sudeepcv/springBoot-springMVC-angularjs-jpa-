package basics.in.java.blogspot.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import basics.in.java.blogspot.model.BlogPost;
import basics.in.java.blogspot.model.BlogReport;
import basics.in.java.blogspot.repository.BlogRepository;

@RestController
public class BlogAdminController {
	
	@Autowired
	private BlogRepository blogRepository;
	
	@Value("${spring.datasource.url}")
	private String urla;
	@RequestMapping("/allname")
	public ArrayList<Map<String, Object>> adminhome(){
		ArrayList<Map<String, Object>> result =new ArrayList<Map<String, Object>>();
		Map<String, Object> json=new LinkedHashMap<String, Object>();
		json.put("name", "sudeep");
		json.put("name", "arun");
		json.put("dburl", urla);
		BlogPost newblog=new BlogPost();
		newblog.setContent("sdafasdfsfasdfsadfasfa");
		newblog.setTitle("titlesssssssssssss");	
		blogRepository.save(newblog);
		
		json.put("testpost",blogRepository.findAll());
		
				
		result.add(json);
		return result;
		
		
	}

}
