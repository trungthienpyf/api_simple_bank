package com.LearnSpringBoot.RestAPI.respository;

import com.LearnSpringBoot.RestAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
   User findByUsernameAndPassword(String username,String password);
   @Query("SELECT a FROM User a WHERE a.id = ?1")
   Optional<User> getAccountForUpdate(Long id);
}
