package com.app.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.GymMember;
import com.app.entities.User;

public interface GymMemberDao extends JpaRepository<GymMember, Integer> {
 
	//GymMember findByEmail(String email);
	//List<GymMember> findByRole(String role);
}