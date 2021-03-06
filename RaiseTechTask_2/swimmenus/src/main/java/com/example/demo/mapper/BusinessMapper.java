package com.example.demo.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Business;

@Mapper
public interface BusinessMapper {

	List<Business> findOne(int id);

	Optional<Business> findId(int id);

	List<Business> findAll();

	List<Business> findTitle(String manageDay);

	void save(Business business);

	void update(Business business);

	void delete(int id);

}
