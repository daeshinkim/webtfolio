package com.webtfolio.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webtfolio.dao.PortfolioDao;
import com.webtfolio.entity.Portfolio;

@Service("adminPortfolioService")
public class PortfolioService {
	/*관리자 포트폴리오 페이지 insert, update, delete 서비스 구현*/
	@Autowired
	private PortfolioDao portfolioDao;

	@Transactional
	public List<Portfolio> getPortfolioList(String id, Integer page) {

		List<Portfolio> result = portfolioDao.getList(id, page);
		return result;
	}

	@Transactional
	public Portfolio getPortfolio(Integer id) {
		Portfolio result = portfolioDao.get(id);
		return result;
	}
}
