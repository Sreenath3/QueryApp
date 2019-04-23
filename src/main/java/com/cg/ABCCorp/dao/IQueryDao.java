package com.cg.ABCCorp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.ABCCorp.model.QueryMaster;

public interface IQueryDao extends JpaRepository<QueryMaster, Integer> {

}
