package Concrete;

import Abstract.MemberCheckService;
import Abstract.MemberService;
import Entities.Member;

public class MemberManager implements MemberService {
	
	MemberCheckService memberCheckService;
	
	public MemberManager(MemberCheckService memberCheckService) {
		this.memberCheckService = memberCheckService;
	}

	@Override
	public void add(Member member) {
		if(memberCheckService.checkIfRealPerson(member)) {
		  System.out.println(member.getFirstName() + " "+ member.getLastName()+" "+ "adl� oyuncu sisteme eklendi.");

		}else {
			System.out.println("Not a valid person");
		}
		
	}

	@Override
	public void update(Member member) {
		System.out.println(member.getFirstName() + " "+ member.getLastName()+" "+ "adl� oyuncunun bilgileri g�ncellendi.");

		
	}

	@Override
	public void delete(Member member) {
		System.out.println(member.getFirstName() + " "+ member.getLastName()+" "+ "adl� oyuncu sistemden silindi.");

		
	}



	



	

}
