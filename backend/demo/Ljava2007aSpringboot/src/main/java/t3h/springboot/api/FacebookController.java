package t3h.springboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import t3h.springboot.pojo.FacebookResponse;
import t3h.springboot.service.FacebookService;

@RestController
@RequestMapping(value = "/api")
public class FacebookController {
	
	@Autowired
	FacebookService facebookService;

	@RequestMapping(value = "/kiemTra/{username}/{password}")
	public ResponseEntity<FacebookResponse> kiemTraLogin(
			@PathVariable String username,
			@PathVariable String password) {
		FacebookResponse response = 
				facebookService.kiemTraLogin(
						username, password);
		return ResponseEntity.ok(response);
	}
}
