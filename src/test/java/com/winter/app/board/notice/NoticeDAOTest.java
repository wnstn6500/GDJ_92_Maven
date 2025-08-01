package com.winter.app.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.winter.app.board.BoardVO;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class NoticeDAOTest {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	@Test
	void listTest()throws Exception{
		List<BoardVO> list = noticeDAO.list();
		
		assertNotEquals(0, list);
				
	}
	
	//@Test
	void detailTest()throws Exception{
		NoticeVO noticeVO = new NoticeVO();
		noticeVO.setBoardNum(1L);
		BoardVO boardVO = noticeDAO.detail(noticeVO);
		log.info("result : {}", boardVO);
		assertNotNull(boardVO);
	}

	//@Test
	void insertTest()throws Exception {
		NoticeVO noticeVO = new NoticeVO();
		noticeVO.setBoardTitle("title3");
		noticeVO.setBoardContents("contents3");
		noticeVO.setBoardWriter("writer3");
		int result = noticeDAO.insert(noticeVO);
		
		//단정문
		assertEquals(0, result);
		
		
	}
	
	

}
