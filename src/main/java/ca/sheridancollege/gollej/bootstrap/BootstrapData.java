package ca.sheridancollege.gollej.bootstrap;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.gollej.beans.Player;
import ca.sheridancollege.gollej.repository.PlayerRepository;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {

	private PlayerRepository playerRepo;

	@Override
	public void run(String... args) throws Exception {

		// Bronze (0-99)
		// Silver (100-299)
		// Gold (300-599)
		// Platinum (600-999)
		// Diamond (more than 1000)

		Player player1 = new Player("John Doe", 67, 23, 12, 30);
		Player player2 = new Player("Jane Doe", 23, 67, 12, 60);
		Player player3 = new Player("John Smith", 12, 12, 12, 90);
		Player player4 = new Player("Jane Smith", 91, 14, 16, 120);
		Player player5 = new Player("Timothy Typhus", 67, 23, 18, 250);
		Player player6 = new Player("Tiffany Typhus", 101, 18, 19, 280);
		Player player8 = new Player("Torrance Telecaster", 140, 24, 20, 310);
		Player player9 = new Player("Tiffany Telecaster", 67, 23, 21, 440);
		Player player10 = new Player("George Strombopolous", 68, 23, 22, 570);
		Player player11 = new Player("Okay I ran out of long names", 71, 21, 23, 600);
		Player player12 = new Player("Very Super Long Gamer Name", 89, 23, 26, 730);
		Player player13 = new Player("Very Super Longer Gamer Name", 91, 23, 29, 830);
		Player player14 = new Player("Very Super Longest Gamer Name", 100, 17, 31, 1000);
		Player player15 = new Player("Very Super Longestest Gamer Name", 101, 16, 32, 1030);
		Player player16 = new Player("Very Super Longestestest Gamer Name", 102, 15, 33, 1060);

		playerRepo.saveAll(
				List.of(player1, player2, player3, player4, player5, player6, player8, player9, player10, player11,
						player12, player13, player14, player15, player16));
	}

}
