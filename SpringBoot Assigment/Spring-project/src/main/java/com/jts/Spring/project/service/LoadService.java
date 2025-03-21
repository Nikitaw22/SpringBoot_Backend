package com.jts.Spring.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jts.Spring.project.entity.Load;
import com.jts.Spring.project.repository.LoadRepository;

@Service
public class LoadService {
	
	
	@Autowired
	private LoadRepository loadRepository;

	public Load saveload(Load load) {
		return loadRepository.save(load);

	}

	public Load findById(Long loadid) {
		Optional<Load> load = loadRepository.findById(loadid);

		if (load.isEmpty()) {
			throw new RuntimeException("Load not found");
		}

		return load.get();

	}

	public List<Load> findAll1() {
		return loadRepository.findAll();

	}

	public Load updateload(Load load) {
		Optional<Load> dbload = loadRepository.findById((Long) load.getload_id());

		if (dbload.isEmpty()) {
			throw new RuntimeException("Load not found");
		}

		Load existingLoad = dbload.get();
		existingLoad.setload_id(load.getload_id());

		return loadRepository.save(existingLoad);

	}

	public void deleteload(int loadid) {
		Optional<Load> dbload = loadRepository.findById((long) loadid);

		if (dbload.isEmpty()) {
			throw new RuntimeException("Load not found");
		}

		loadRepository.delete(dbload.get());

	}

	public List<Load> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
