package com.manhua.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.manhua.app.entity.Link;
public interface  LinkRepository extends CrudRepository<Link, Long>{
	@Query("from Link where level = 10 ")
	Iterable<Link> getManHua();
	@Query("from Link where level = 11 and parentId = ?1")
	Iterable<Link> getManHuaById(Long parentId);
	@Query("from Link where level = 13 and parentId = ?1")
	Iterable<Link> getManHuaBanById(Long parentId);
}
