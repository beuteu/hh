package com.spring.web.board.dao;

import java.util.List;
import java.util.Map;

import com.spring.web.domain.BoardVO;

public interface BoardDao {

	List<Map> boardList(BoardVO vo) throws Exception;

	void boardRegist(BoardVO vo) throws Exception;

	BoardVO boardView(BoardVO vo) throws Exception;
	

}
