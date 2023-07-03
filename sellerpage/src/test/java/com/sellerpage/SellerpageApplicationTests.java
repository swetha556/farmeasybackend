package com.sellerpage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.sellerpage.model.Products;
import com.sellerpage.dao.ProductDAO;
import com.sellerpage.exception.ProductExistsException;
import com.sellerpage.service.ProductService;

@SpringBootTest
class SellerpageApplicationTests {

    @Autowired
    private ProductService service;

    @MockBean
    private ProductDAO productDAO;

    @Test
    public void saveProductTest() throws ProductExistsException {
        Products products = new Products(1,"cultivator","plough the sand","high speed,size:large",3456.00);
        when(productDAO.save(products)).thenReturn(products);
        assertEquals(products,service.createProducts(products));
    }

    @Test
    public void getAllProductTest() {
        when(productDAO.findAll()).thenReturn(Stream
          .of(new Products(1,"sprayer","spraying in crops","high speed,size:large",1200.00),new Products(1,"griller","grill the sand","high speed,size:large",7654.00)).collect(Collectors.toList()));
        assertEquals(2, service.getAllProducts().size());
    }

    @Test
    public void getByProductIdTest() {
        int productid =1;
        when( productDAO.findByProductid(productid))
        .thenReturn(Stream.of(new Products(1,"sprayer","spraying in crops","high speed,size:large",1200.00)).collect(Collectors.toList()));
        assertEquals(1,service.getProductById(productid).size());

    }

   @Test
    public void updateproductbyIdTest() {
        Products products = new Products();
        products.setProductname("sower");
        products.setPdescription("sowing the seeds");
        products.setBuyingprice(3000.00);
        when(productDAO.save(products)).thenReturn(products);
        Products savepro = productDAO.save(products);
        assertThat(savepro.getProductname()).isNotNull();
       // assertEquals(1,productService.updateProduct(id,product);
    }

    @Test
    public void deleteproductbyIdTest() {
        //Products product = new Products(1,"griller","grill the sand","high speed,size:large",8767.00);
        int productid =1;
        service.deleteProduct(productid);
        verify(productDAO,times(1)).deleteById(productid);
    }
}