package com.hp.house.house2.dao;

import com.hp.house.house2.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User selectUserByName(String username);
}
