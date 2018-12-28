package com.biz.bbs.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.bbs.dao.BBsMainDao;
import com.biz.bbs.dao.BBsMainDaoImp;
import com.biz.bbs.vo.BBsMainVO;

public class BBsMainService {

	List<BBsMainVO> bbsMainList;
	
	BBsMainDao mainDao;
	
	public BBsMainService() {

		bbsMainList = new ArrayList();
		mainDao = new BBsMainDaoImp();
	}
	
	public void viewBBsList() {
		bbsMainList = mainDao.selectAll();
		System.out.println("=================================================");
		System.out.println("나의 게시판 v1.0");
		System.out.println("=================================================");
		System.out.println("NO     날짜     작성자     제목");
		System.out.println("-------------------------------------------------");
		for(BBsMainVO vo : bbsMainList) {
			System.out.print(vo.getB_id());
			System.out.print(vo.getB_date());
			System.out.print(vo.getB_auth());
			System.out.print(vo.getB_subject()+"\n");
		}
		
		
	}
	
}
