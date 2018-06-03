package com.spring.web.board.serivce;

import java.util.List;
import java.util.Map;

import com.spring.web.domain.BoardVO;
import com.spring.web.domain.Search;
import com.spring.web.domain.search;

public interface BoardService {
	
	public List<Map> boardList(Search search) throws Exception;

	public void boardRegist(BoardVO vo) throws Exception;

	public BoardVO boardView(BoardVO vo) throws Exception;

	public void boardDelete(int bno) ;





}
