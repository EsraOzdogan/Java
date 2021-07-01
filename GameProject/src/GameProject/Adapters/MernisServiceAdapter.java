package GameProject.Adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import GameProject.Abstract.UserValidationService;
import GameProject.Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserValidationService{

	@Override
	public boolean validate(Gamer gamer) {
       KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result = true;
		try {
			result=client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalIdentity()), gamer.getFirstName().toUpperCase(new Locale("tr")), 
					gamer.getLastName().toUpperCase(new Locale("tr")), gamer.getBirthOfYear());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
