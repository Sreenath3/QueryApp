package com.cg.ABCCorp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ABCCorp.dao.IQueryDao;
import com.cg.ABCCorp.model.QueryMaster;

@Service("queryService")
public class QueryMasterImpl implements IQueryService{
	
	@Autowired
	private IQueryDao queryDao;

	@Override
	public List<QueryMaster> findAll() {
		List<QueryMaster> querylist = queryDao.findAll();
		return querylist;
	}

	@Override
	public void save(QueryMaster querymaster) {
		queryDao.save(querymaster);

	}

	@Override
	public QueryMaster findById(int id) {
		try {
		QueryMaster que=queryDao.findById(id).get();
		return que;
		}catch(Exception e) {
			return null;
		}
	}

	
	

}
