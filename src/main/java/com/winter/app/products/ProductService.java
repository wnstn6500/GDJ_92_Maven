package com.winter.app.products;

import java.util.List;

import com.winter.app.board.notice.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final NoticeService noticeService;
	
	@Autowired
	private ProductDAO productDAO;

    ProductService(NoticeService noticeService) {
        this.noticeService = noticeService;
    }
	
	public List<ProductVO> list()throws Exception{
		return productDAO.list();
	}
	
	public ProductVO detail(ProductVO productVO) throws Exception{
		return productDAO.detail(productVO);
	}

}
