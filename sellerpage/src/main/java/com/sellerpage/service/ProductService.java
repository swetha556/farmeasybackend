package com.sellerpage.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;

import com.sellerpage.model.Products;
import com.sellerpage.dao.ProductDAO;
import com.sellerpage.exception.ProductExistsException;

@Service
public class ProductService implements IProductService {

	 @Autowired
	   private ProductDAO productDAO;
	

	@Override
	public Products createProducts(Products products) throws ProductExistsException {
		Optional<Products> productNew =productDAO.findById(products.getProductid());
        if(productNew.isPresent())
            throw new ProductExistsException();
        else
            return productDAO.save(products);
	}
	
	
	 
//	 public void saveProductToDB(MultipartFile file, String productname, String pdescription,String specification,
//	            Double buyingprice) {
//
//	        Products products =new Products();
//
//	        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
//
//	        if(fileName.contains(".."))
//	        {
//
//	            System.out.println("not a valid file");
//
//	        }
//
//	        try {
//
//	            products.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
//
//	        } catch (IOException e) {
//
//	            // TODO Auto-generated catch block
//
//	            e.printStackTrace();
//
//	        }
//	        products.setPdescription(pdescription);
//	        products.setProductname(productname);
//	        products.setSpecification(specification);
//	        products.setBuyingprice(buyingprice);
//            productDAO.save(products);
//            //return "redirect://createproduct.compohtml";
//	    }
//	 
	@Override
	public void updateProduct(int productid, Products products) {
		productDAO.findById(productid).get();
        productDAO.save(products);
		
	}

	@Override
	public void deleteProduct(int productid) {
		productDAO.deleteById(productid);
		
	}
	
	@Override
	public List<Products> getAllProducts() {
		List<Products> planList = productDAO.findAll();
        if(planList.size()>0)
            return planList;
        else
            return null;

    }
	
	@Override
	public List<Products> getProductById(int productid) {
        return productDAO.findByProductid(productid);

    }

	
}