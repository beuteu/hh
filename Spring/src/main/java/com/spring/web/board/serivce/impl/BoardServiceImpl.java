/*
 *------------------------------------------------------------------------------
 * AccCdServiceImpl.java
 * DESC : AccCdService 구현 ?��?��?��
 *
 * PROJ :  ?��?��?���?
 * Copyright 2012 LG CNS All rights reserved
 *------------------------------------------------------------------------------
 *                  �?         �?         ?��         ?��
 *------------------------------------------------------------------------------
 *   DATE       AUTHOR                  DESCRIPTION
 * -----------    -----------  -------------------------------------------------
 * 2015. 08. 18.   고인?��     최초 ?��로그?�� ?��?��
 *------------------------------------------------------------------------------
 */
package com.spring.web.board.serivce.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.spring.web.board.dao.BoardDao;
import com.spring.web.board.serivce.BoardService;
import com.spring.web.domain.BoardVO;


@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDao boardDao;


	@Override
	public List<Map> boardList(BoardVO vo) throws Exception {
		
		return boardDao.boardList(vo);
	}


	@Override
	public void boardRegist(BoardVO vo) throws Exception {
		boardDao.boardRegist(vo);
		
	}

	@Override
	public BoardVO boardView(BoardVO vo) throws Exception {
		
		return boardDao.boardView(vo);
	}






	

/*	public void boardCreate(BoardVO vo) throws Exception {
		boardDao.boardList(vo);
	}
*/

}
