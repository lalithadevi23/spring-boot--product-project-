package com.product.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;                        
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Product {
	@Id
	@SequenceGenerator(
			name="pdtId_seq",
			initialValue = 00001,
			allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long productId;
	private String productName;
	private long productPrice;
	private String productCategory;
	private Date productMnfDate;
	private Date productExpDate;
	
	
	

}
