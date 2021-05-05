package Adapter;

import java.rmi.RemoteException;

import Abstract.MemberCheckService;
import Entities.Member;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements MemberCheckService{

	@Override
	public boolean checkIfRealPerson(Member member) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(member.getNationalityId()),
					member.getFirstName().toUpperCase(),
					member.getLastName().toUpperCase(), 
					member.getBirthOfYear());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
