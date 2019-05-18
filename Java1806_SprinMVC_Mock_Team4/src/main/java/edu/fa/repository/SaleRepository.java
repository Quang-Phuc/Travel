package edu.fa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.fa.model.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer> {
	public Sale findSaleBySaleId(int saleId);
	

	

}
