package com.tka.eci.client;

import java.util.List;

import com.tka.eci.controller.ECIcontroller;
import com.tka.eci.entity.Candidate;

public class ECIclient {
	public static void main(String[] args) {
		
		
		ECIcontroller con = new ECIcontroller();
		
		List<Candidate> allCandidate = con.allCandidate();
//		System.out.println(allCandidate);
		
		List<Candidate> listByParty = con.listByParty("BJP");
//		System.out.println(listByParty);
		
		List<Candidate> listByAssembly = con.listByAssembly("Katol");
//		System.out.println(listByAssembly);
		
		List<Candidate> listByStateParty = con.listByStateParty("MH", "NCP");
//		System.out.println(listByStateParty);
		
		List<Candidate> listByGender = con.listByGender("Female");
//		System.out.println(listByGender);
		
		List<Candidate> listByAge = con.listByAge(82);
		System.out.println(listByAge);
	}

}
