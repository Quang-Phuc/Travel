package edu.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fa.model.Sale;
import edu.fa.repository.SaleRepository;
import edu.fa.service.SaleService;

@Service
public class SaleServiceImpl implements SaleService {

	@Autowired
	private SaleRepository saleRepository;

	@Override
	public List<Sale> findAllSale() {
		// TODO Auto-generated method stub
		return saleRepository.findAll();
	}

	@Override
	public Sale save(Sale sale) {
		// TODO Auto-generated method stub
		return saleRepository.save(sale);
	}

	@Override
	public Sale update(Sale sale) {
		// TODO Auto-generated method stub
		return saleRepository.save(sale);
	}

	@Override
	public void deleteSaleBySaleId(int saleId) {
		saleRepository.delete(saleId);

	}

	@Override
	public Sale findSaleBySaleId(int saleId) {
		// TODO Auto-generated method stub
		return saleRepository.findSaleBySaleId(saleId);
	}

}
