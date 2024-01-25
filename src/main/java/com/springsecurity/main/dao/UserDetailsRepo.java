package com.springsecurity.main.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springsecurity.main.entites.UserDe;

@Repository
public interface UserDetailsRepo extends CrudRepository<UserDe, Integer> {

    @Query("from UserDe u where u.userName=:userName")
    UserDe getuserbyname(@Param("userName") String userName);
}
