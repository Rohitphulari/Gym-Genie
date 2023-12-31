package com.app.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.daos.GymMemberDao;
import com.app.entities.GymMember;
import com.app.entities.User;



@Transactional
@Service
public class GymMemberServiceImpl implements GymMemberService{

	
	  @Autowired 
		private GymMemberDao gymMemberDao;
	  
	  @Override
		public GymMember findById(int memberId) {
			Optional<GymMember> b = gymMemberDao.findById(memberId);
			return b.orElse(null);
		}
	  
	  @Override
		public List<GymMember> findAll() {
			return gymMemberDao.findAll();
		}

		@Override
		public GymMember save(GymMember gm) {
			return gymMemberDao.save(gm);
		}
		
		@Override
		public GymMember update(GymMember gm) {
			return gymMemberDao.save(gm);
		}

		@Override
		public void deleteById(int memberId) {
			gymMemberDao.deleteById(memberId);

		}

		
		
		

	
		
//		@Override
//		public GymMember findByEmail(String email) {
//			return gymMemberDao.findByEmail(email);
//		}
//
//		@Override
//		public List<User> findByRole(String role) {
//			return userDao.findByRole(role);
//		}
}
