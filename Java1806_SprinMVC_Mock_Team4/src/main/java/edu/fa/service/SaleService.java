package edu.fa.service;

import java.util.List;

import edu.fa.model.Sale;

public interface SaleService {
	List<Sale> findAllSale();

	Sale save(Sale sale);

	Sale update(Sale sale);

	public void deleteSaleBySaleId(int saleId);
	
	public Sale findSaleBySaleId(int saleId);

}
