package com.app.project.fics.dao;


import com.app.project.fics.model.Users;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    //@Select("Select * from users")
    public List<Users> selectUser();
}
