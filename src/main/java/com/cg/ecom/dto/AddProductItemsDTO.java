package com.cg.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddProductItemsDTO {


	private String ProductName;
	private int price;
	private int quantity;
	private int productSupplierId;



	
}