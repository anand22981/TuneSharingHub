package tunehub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tunehub.entities.Playlist;
import tunehub.repositories.PlaylistRepository;

@Service
public class PlaylistServiceImplementation 
   implements PlaylistService
   {
    @Autowired
    PlaylistRepository repo;
	@Override
	public void addPlaylist(Playlist playlist) {
		// TODO Auto-generated method stub
		repo.save(playlist);
		
	}
	@Override
	public List<Playlist> fetchAllPlaylists() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
