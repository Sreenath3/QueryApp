package com.cg.ABCCorp.service;

import java.util.List;

import com.cg.ABCCorp.model.QueryMaster;

public interface IQueryService {
	public QueryMaster findById(int id);

	public List<QueryMaster> findAll();

	public void save(QueryMaster querymaster);

}
