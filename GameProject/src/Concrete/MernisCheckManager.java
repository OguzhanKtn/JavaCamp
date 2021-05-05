package Concrete;

import Abstract.MemberCheckService;
import Entities.Member;

public class MernisCheckManager implements MemberCheckService{

	@Override
	public boolean checkIfRealPerson(Member member) {
		
		return true;
	}

}
