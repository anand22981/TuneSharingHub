package tunehub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tunehub.entities.Playlist;

public interface PlaylistRepository extends 
      JpaRepository<Playlist, Integer>{

}
