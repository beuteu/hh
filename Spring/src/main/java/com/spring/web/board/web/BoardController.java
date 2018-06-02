package com.spring.web.board.web;


import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.spring.web.board.serivce.BoardService;
import com.spring.web.domain.BoardVO;
import com.spring.web.factory.ContextFactory;

@Controller
@RequestMapping("/board")

public class BoardController {
	
	
	@Inject
	private BoardService service;

	   @RequestMapping(value="/list")
	    public ModelAndView boardList( BoardVO vo) throws Exception{
		   
		   ModelAndView mv = new ModelAndView();
		   
		   System.out.print("데이터 있나" + service.boardList(vo));
		   service.boardList(vo);
		   mv.addObject("list", service.boardList(vo));
	       mv.setViewName("/board/list");//타일즈 view => 일반 view
	       return mv;
	    }

	   @RequestMapping(value="/register", method = RequestMethod.GET)
	    public ModelAndView boardRegister( BoardVO vo) throws Exception{
			
		    ModelAndView mv = new ModelAndView();
	        mv.setViewName("/board/register");//타일즈 view => 일반 view
	        return mv;
	    }
	
	   
	   @RequestMapping(value="/register" , method = RequestMethod.POST)

	    public String boardRegister2( BoardVO vo) throws Exception{
		   
		   System.out.print(vo);
			
		    ModelAndView mv = new ModelAndView();
		    service.boardRegist(vo);
		    
			return "redirect:/board/list" ;

	    }
	   
	   @RequestMapping(value="/view", method = RequestMethod.GET)
	    public ModelAndView boardView( BoardVO vo) throws Exception{
			
		    ModelAndView mv = new ModelAndView();
		    System.out.print(vo);

		    service.boardView(vo);

		    System.out.print("GETGETGETGETGETGETGETGETGETGETGETGETGETGETGETGETGETGETGETGETGET");
			mv.addObject("view", service.boardView(vo));

	        mv.setViewName("/board/view");//타일즈 view => 일반 view
	        return mv;
	    }
	   
	   @RequestMapping(value="/listAjax.do")
	    public @ResponseBody Map<String , Object> getJsonByMap( BoardVO vo) throws Exception {
	        Map<String, Object> jsonObject = new HashMap<String, Object>();
			
	        jsonObject = new HashMap<String, Object>();
	        jsonObject.put("list", service.boardList(vo));

	             
	        return jsonObject;

	   }
	   
	   @RequestMapping(value="/listAjax")
	    public ModelAndView boardListAjax( BoardVO vo) throws Exception{
		   
		   ModelAndView mv = new ModelAndView();
		   
		   System.out.print("데이터 있나" + service.boardList(vo));
	       mv.setViewName("/board/listAjax");//타일즈 view => 일반 view
	       return mv;
	    }
	   
}
