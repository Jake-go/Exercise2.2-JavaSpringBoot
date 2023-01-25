package ca.sheridancollege.gollej.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ca.sheridancollege.gollej.beans.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
