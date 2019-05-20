package com.cdac.web.Dao;

import java.util.ArrayList;

import com.cdac.web.model.Product;

public class ProductService implements IProductService {

	@Override
	public ArrayList<Product> getProductDetails() {
		ArrayList<Product> obj=new ArrayList();
		Product p1=new Product(1,"Soap",7654327);
		Product p2=new Product(2,"Sugar",87);
		Product p3=new Product(3,"Rice",63247);
		Product p4=new Product(4,"Mobile",7980);
		obj.add(p1);
		obj.add(p2);
		obj.add(p3);
		obj.add(p4);
		return obj;
	}

}
