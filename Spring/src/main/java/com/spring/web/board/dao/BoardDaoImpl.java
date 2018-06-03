/*
 *------------------------------------------------------------------------------
 * AccCdServiceImpl.java
 * DESC : AccCdService ๊ตฌํ ?ด??ค
 *
 * PROJ :  ?ธ?ฌ?๊ณ?
 * Copyright 2012 LG CNS All rights reserved
 *------------------------------------------------------------------------------
 *                  ๋ณ?         ๊ฒ?         ?ฌ         ?ญ
 *------------------------------------------------------------------------------
 *   DATE       AUTHOR                  DESCRIPTION
 * -----------    -----------  -------------------------------------------------
 * 2015. 08. 18.   ๊ณ ์ธ?ธ     ์ต์ด ?๋ก๊ทธ?จ ??ฑ
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
import com.spring.web.domain.Search;


@Service("boardDao")
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private static final String NAME_SPACE = "com.spring.web.mapper.Mapper.";

	@Override
	public List<Map> boardList(Search search) throws Exception {
		return sqlSession.selectList(NAME_SPACE + "boardList",search);
	}

	@Override
	public void boardRegist(BoardVO vo) throws Exception {
		sqlSession.insert(NAME_SPACE + "boardRegist",vo);
	}

	@Override
	public BoardVO boardView(BoardVO vo) throws Exception {
		return sqlSession.selectOne(NAME_SPACE + "boardView",vo);

	}

	@Override
	public void boardDelete(int bno) throws Exception {
		sqlSession.delete(NAME_SPACE + "boardDelete",bno);
	}
		

}
