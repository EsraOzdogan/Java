package GameProject.Abstract;

import GameProject.Entities.Gamer;

public abstract class BaseGamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		 System.out.println("Added: " + gamer.getFirstName() + gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		 System.out.println("Updated: " + gamer.getFirstName() + gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		 System.out.println("Deleted: " + gamer.getFirstName() + gamer.getLastName());
		
	}

}
