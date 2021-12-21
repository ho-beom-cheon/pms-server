package com.iteyes.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iteyes.dto.board.BoardDTO;
import com.iteyes.service.BoardService;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping(value = "/board", method = {RequestMethod.GET, RequestMethod.POST})
public class BoardController {
	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "/select")
    public @ResponseBody String select(HttpServletRequest request) throws Exception{

		/* 파라미터 확인 */
		log.debug("# cond1 :: " + request.getParameter("cond1"));
		ObjectMapper mapper = new ObjectMapper();
    	List<BoardDTO> list = boardService.select();

    	HashMap<String, Object> hm = new HashMap();
    	HashMap<String, Object> hm1 = new HashMap();
    	HashMap<String, Object> hm1_pagination = new HashMap();
    	hm.put("result", true);
    	hm1.put("contents", list);
    	hm1_pagination.put("page", 1);
    	hm1_pagination.put("totalCount", 100);
    	hm1.put("pagination", hm1_pagination);
    	hm.put("data", hm1);

    	return mapper.writeValueAsString(hm);
    }

	@RequestMapping(value = "/ins")
    public @ResponseBody boolean ins(HttpServletRequest request) throws Exception{
		boolean result = false;
//		Set<String> keySet = request.getParameterMap().keySet();
//		for(String key: keySet) {
//			log.debug(key + ": " + request.getParameter(key));
//		}

		BoardDTO BoardDTO = new BoardDTO();

		BoardDTO.setTitle( request.getParameter("title") ) ;
		BoardDTO.setContent( request.getParameter("contents") ) ;

		result = boardService.ins(BoardDTO) ;

		log.debug("dto : " + BoardDTO.getTitle()) ;
		log.debug("dto : " + BoardDTO.getContent()) ;

    	return result;
    }
}
