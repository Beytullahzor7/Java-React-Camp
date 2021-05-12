package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		try {
			return client.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName(),
					customer.getLastName(), customer.getDateBirth());

		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return false;
	}

}
