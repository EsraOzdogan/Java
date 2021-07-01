package GameProject.Concrete;

import GameProject.Abstract.UserValidationService;
import GameProject.Entities.Gamer;

public class UserValidationManager implements UserValidationService{

	@Override
	public boolean validate(Gamer gamer) {
		return true;
	}

}
