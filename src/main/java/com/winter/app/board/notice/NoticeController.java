package com.winter.app.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.winter.app.board.BoardVO;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value="/notice/*")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("list")
	public String list(Model model)throws Exception{
		//
		List<BoardVO> list = noticeService.list();
		
		model.addAttribute("list", list);
		
		return "notice/list";
	}
	
	@GetMapping("detail")
	public String detail(NoticeVO noticeVO, Model model)throws Exception{
//		String n=request.getParameter("boardNum");
//		int num = Integer.parseInt(n);
//		NoticeVO noticeVO = new NoticeVO();
//		noticeVO.setBoardNum(num);
		
		BoardVO boardVO = noticeService.detail(noticeVO);
		
		model.addAttribute("vo", boardVO);
		
		return "notice/detail";
	}
	
	@GetMapping("add")
	public void insert()throws Exception{
		NoticeVO noticeVO = new NoticeVO();
		noticeVO.setBoardTitle("title");
		noticeVO.setBoardContents("contents");
		noticeVO.setBoardWriter("writer");
		int result = noticeDAO.insert(noticeVO);
		
	}
}
