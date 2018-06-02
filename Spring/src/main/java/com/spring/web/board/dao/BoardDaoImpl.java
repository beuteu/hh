/*
 *------------------------------------------------------------------------------
 * AccCdServiceImpl.java
 * DESC : AccCdService Íµ¨ÌòÑ ?Å¥?ûò?ä§
 *
 * PROJ :  ?ù∏?Ç¨?öåÍ≥?
 * Copyright 2012 LG CNS All rights reserved
 *------------------------------------------------------------------------------
 *                  Î≥?         Í≤?         ?Ç¨         ?ï≠
 *------------------------------------------------------------------------------
 *   DATE       AUTHOR                  DESCRIPTION
 * -----------    -----------  -------------------------------------------------
 * 2015. 08. 18.   Í≥†Ïù∏?ò∏     ÏµúÏ¥à ?îÑÎ°úÍ∑∏?û® ?ûë?Ñ±
 *------------------------------------------------------------------------------
 */
package com.spring.web.board.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.spring.web.board.serivce.BoardService;
import com.spring.web.domain.BoardVO;


@Service("boardDao")
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private static final String NAME_SPACE = "com.spring.web.mapper.Mapper.";

	@Override
	public List<Map> boardList(BoardVO vo) throws Exception {
		return sqlSession.selectList(NAME_SPACE + "boardList",vo);
	}

	@Override
	public void boardRegist(BoardVO vo) throws Exception {
		sqlSession.insert(NAME_SPACE + "boardRegist",vo);
	}

	@Override
	public BoardVO boardView(BoardVO vo) throws Exception {
		return sqlSession.selectOne(NAME_SPACE + "boardView",vo);

	}



	



	

/*	public void boardCreate(BoardVO vo) throws Exception {
		boardDao.boardList(vo);
	}
*/

}
