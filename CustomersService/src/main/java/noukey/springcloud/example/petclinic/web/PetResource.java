package noukey.springcloud.example.petclinic.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetResource {
	

	@RequestMapping("hello")
	public String hello(){
		return "hello world!";
	}

}
