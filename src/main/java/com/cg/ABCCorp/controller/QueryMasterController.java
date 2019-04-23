package com.cg.ABCCorp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.ABCCorp.model.QueryMaster;
import com.cg.ABCCorp.service.QueryMasterImpl;

@RestController
@RequestMapping("/query")
public class QueryMasterController {
	@Autowired
	private QueryMasterImpl queryService;

	int queryid;

	@PostMapping("/show")
	public ModelAndView ManagerLogin(@RequestParam int id) {
		ModelAndView modelAndView;

		QueryMaster que = queryService.findById(id);
		queryid = id;
		if (que == null) {
			modelAndView = new ModelAndView("querynotfound");
			modelAndView.addObject("SHOW", id);

			return modelAndView;
		} else {
			
			modelAndView = new ModelAndView("addquery");
			modelAndView.addObject("SHOW", que);
			return modelAndView;
		}
		
	}

	@PostMapping("/save")
	public ModelAndView save(@RequestParam String solution, @RequestParam String answered_by) {
		QueryMaster queryMaster = queryService.findById(queryid);
		queryMaster.setSolution(solution);
		queryMaster.setAnswered_by(answered_by);;

		queryService.save(queryMaster);

		
		ModelAndView modelAndView = new ModelAndView("listquery");
		modelAndView.addObject("QUERYLIST", queryMaster);
		return modelAndView;
	}

}
