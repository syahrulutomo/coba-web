package com.sagecode.coba.web.entity.dao;

import com.sagecode.coba.web.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserDao extends PagingAndSortingRepository<User,String>{
    
}
