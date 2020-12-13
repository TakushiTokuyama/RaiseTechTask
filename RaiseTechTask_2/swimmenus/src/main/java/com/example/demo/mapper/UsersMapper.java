package com.example.demo.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Users;

@Mapper
public interface UsersMapper {

	void save(Users users);

	ArrayList<Users> findAll();

}
