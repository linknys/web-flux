package com.apirest.webflux;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.apirest.webflux.document.Playlist;
import com.apirest.webflux.repository.PlaylistReposotory;

import reactor.core.publisher.Flux;

//@Component
//public class DummyData implements CommandLineRunner{
//	
//	private final PlaylistReposotory playlistReposotory;
//	
//	DummyData(PlaylistReposotory playlistReposotory){
//		this.playlistReposotory = playlistReposotory;
//	}
//	
//	public void run(String... args) throws Exception {
//		playlistReposotory.deleteAll()
//			.thenMany(
//					Flux.just("Teste 1", "Teste 2", "Teste 3", "Teste 4", "Teste 5")
//						.map(nome -> new Playlist(UUID.randomUUID().toString(), nome))
//						.flatMap(playlistReposotory::save))
//			.subscribe(System.out::println);
//	}
//}
