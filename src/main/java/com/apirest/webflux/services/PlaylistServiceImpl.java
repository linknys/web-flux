package com.apirest.webflux.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.webflux.document.Playlist;
import com.apirest.webflux.repository.PlaylistReposotory;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlaylistServiceImpl implements PlaylistService{

	@Autowired
	PlaylistReposotory playlistReposotory;
	
	@Override
	public Flux<Playlist> findAll() {
		return playlistReposotory.findAll();
	}

	@Override
	public Mono<Playlist> findById(String id) {
		return playlistReposotory.findById(id);
	}

	@Override
	public Mono<Playlist> save(Playlist playlist) {
		return playlistReposotory.save(playlist);
	}
	
	

}
