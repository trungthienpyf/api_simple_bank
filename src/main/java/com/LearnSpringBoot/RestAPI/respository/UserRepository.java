package com.LearnSpringBoot.RestAPI.respository;

import com.LearnSpringBoot.RestAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
   User findByUsernameAndPassword(String username,String password);
}
