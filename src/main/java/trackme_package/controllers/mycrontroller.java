package trackme_package.controllers;

import trackme_package.Location;

import java.util.HashMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/ws/")
public class mycrontroller {

	 //@RequestMapping(value="savelocation", method = RequestMethod.POST)
	 
	//din JS : var url = "http://94.177.217.21:8080/ws/savelocation";
	
	
	@PostMapping(value = "/savelocation") //<- sunt impreuna
	  public String saveLocation(@RequestBody HashMap<String, String> locationData) {
		 //@RequestParam("arg1") String arg1, <-- alti parametri
				 
		
		String description = locationData.get("description"); //<- metoda din Map
		
		String id = locationData.get("id"); //<- metoda din Map
		
		
		System.out.println("S-a trimis final : " + id + " : " + description); // <- o parte din JSON
		 
		Location location = new Location();
		location.setLocation("my_location1");
		
		
		 
		 return "Am primit in final : " + locationData.get("description");
		 
	 }
	 
	 
	 
	 
	 //se apeleaza http://127.0.0.1:8080/ws/getlocation/123
	 
	 @RequestMapping(value="getlocation/{id}", method = RequestMethod.GET) // sau GetMapping
	  public void getLocation(@PathVariable long id) {
		 
		 System.out.println("GET method called"  + id);
	 }
	
}
  
