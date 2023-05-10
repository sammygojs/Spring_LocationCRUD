package com.sammyGoJs.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sammyGoJs.location.entities.Location;
import com.sammyGoJs.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository repository;
	
	@Override
	public Location saveLocation(Location location) {
		// TODO Auto-generated method stub
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		// TODO Auto-generated method stub
		return repository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		// TODO Auto-generated method stub
		repository.delete(location);

	}

	@Override
	public Location getLocationById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public List<Location> getAllLocations() {
		// TODO Auto-generated method stub
		return (List<Location>) repository.findAll();
	}

	public LocationRepository getRepository() {
		return repository;
	}

	public void setRepository(LocationRepository repository) {
		this.repository = repository;
	}

}
