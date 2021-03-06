//purpose of this class to manage complicated work beyond the controller
package vndemy.org.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vndemy.org.dao.Offer;
import vndemy.org.dao.OffersDAO;

@Service("offersService")		//equivalent to @Component
public class OffersService {
	
	private OffersDAO offersDao;
	
	
	public OffersDAO getOffersDao() {
		return offersDao;
	}
	
	@Autowired
	public void setOffersDao(OffersDAO offersDao) {
		this.offersDao = offersDao;
	}
	public List<Offer> getCurrent() {
		return offersDao.getOffers();
	}
	public OffersService() {
		// TODO Auto-generated constructor stub
	}

	public void create(@Valid Offer offer) {
		offersDao.create(offer);
		
	}

	public void delete(@Valid int id) {
		offersDao.delete(id);
		
	}

	public void update(@Valid Offer offer) {
		offersDao.update(offer);
		
	}

}
