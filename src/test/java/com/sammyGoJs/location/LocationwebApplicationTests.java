package com.sammyGoJs.location;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.sammyGoJs.location.entities.Location;
import com.sammyGoJs.location.repos.LocationRepository;

@SpringBootTest
class LocationwebApplicationTests {

	@Autowired
	LocationRepository repository;
	
	@Test
	void testLocation() {
		Location location = new Location();
		location.setName("name");
		location.setCode("code");
		location.setType("type");
		repository.save(location);
	}

}
