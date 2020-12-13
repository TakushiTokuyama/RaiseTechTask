package com.example.demo.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Menu;

@Mapper
public interface MenuMapper {
	void save(Menu user);

	List<Menu> findAll();

	Optional<Menu> findById(int id);

	void update(Menu menu);

	void delete(int id);
}