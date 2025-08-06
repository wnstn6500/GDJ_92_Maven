package com.winter.app.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.board.BoardDAO;
import com.winter.app.board.BoardService;
import com.winter.app.board.BoardVO;
import com.winter.app.commons.Pager;

@Service
public class NoticeService implements BoardService {
	
	@Autowired
	private NoticeDAO noticeDAO;

	@Override
	public List<BoardVO> list(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		Long totalCount= noticeDAO.totalCount();
		pager.makeNum(totalCount);
		return noticeDAO.list(pager);
	}
	
	@Override
	public BoardVO detail(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.detail(boardVO);
	}
	
	@Override
	public int insert(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.insert(boardVO);
	}
	
	@Override
	public int update(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.update(boardVO);
	}
	
	@Override
	public int delete(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.delete(boardVO);
	}
}
