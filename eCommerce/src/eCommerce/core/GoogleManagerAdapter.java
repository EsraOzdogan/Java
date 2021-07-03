package eCommerce.core;

import eCommerce.Google.GoogleManager;

public class GoogleManagerAdapter implements GoogleService{

	@Override
	public void registerToSystem(String message) {
		GoogleManager manager = new GoogleManager();
		manager.register(message);
	}

}
