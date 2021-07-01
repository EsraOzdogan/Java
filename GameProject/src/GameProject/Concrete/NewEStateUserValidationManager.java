package GameProject.Concrete;

import GameProject.Abstract.UserValidationService;
import GameProject.Entities.Gamer;

public class NewEStateUserValidationManager implements UserValidationService{

	@Override
	public boolean validate(Gamer gamer) {
		return true;
	}

}
