package com.dxc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import java.util.ArrayList;
import java.util.Arrays;

import com.dxc.DAO.OrdersDAO;
import com.dxc.exception.OrderException;
import com.dxc.model.Orders;
import static org.mockito.Mockito.*;
import com.dxc.services.OrderServices;

@SpringBootTest

public class BuyerPageApplicationTests {

      @MockBean
      private OrdersDAO ordersDAO;//repository class

      @Autowired
      private OrderServices orderservice;

      @Test
      public void saveCreateTest() throws OrderException {
          //when(ordersDAO.save(order)).thenReturn(order);
          //when(ordersDAO.save(any(Order.class))).thenReturn(new Order);
        when(ordersDAO.save(any(Orders.class))).thenReturn(new Orders());
        Orders order = new Orders();
        Orders createdOrder=orderservice.order(order);
        assertNotNull(createdOrder);
        verify(ordersDAO,times(1)).save(order);
    }

//      @Test
//      public void getAll(){
//          when(ordersDAO.findAll()).thenReturn(Stream
//              .of(new Orders(1,1,"sprayer","swetha",90875564,"sulur","card")).collect(Collectors.toList()));
//              Orders order1 = new Orders();
//              order1.setOrderid(1);
//              Orders order2 = new Orders();
//              order2.setOrderid(3);
//          when(ordersDAO.findAll()).thenReturn(Arrays.asList(order1,order2));
//         // call getAllOrders from service class;
//          List<Orders> orders=orderservice.getAllOrders();
//          //assert result
//          assertEquals(2,orders.size());
//          assertEquals( order1.getOrderid(),orders.get(2).getOrderid());
//          assertEquals( order2.getOrderid(),orders.get(3).getOrderid());
//          verify(ordersDAO,times(1)).findAll();
//}
      @Test
      public void getAllTest()
      {
    	  List<Orders> list = new ArrayList<Orders>();
          Orders order1 = new Orders(1,1,"sprayer","swetha","ganesan",908755643,876654433,"sulur");
          Orders order2 = new Orders(2,2,"seeder","sana","vikram",933324556,987987867,"salem");
          Orders order3 = new Orders(3,3,"plougher","vinu","rajendran",908345464,887655424,"srinagar");
          list.add(order1);
          list.add(order2);
          list.add(order3);
          when(ordersDAO.findAll()).thenReturn(list);
        //  test
        List<Orders> orderList = orderservice.getAllOrders();
        assertEquals(3, orderList.size());
        verify(ordersDAO, times(1)).findAll();
    }

    @Test
    public void getOrderbyProduct() {

        int productid =1;
        when(ordersDAO.findByProductid(productid))
        .thenReturn(Stream.of(new Orders(1,1,"sprayer","swetha","ganesan",90875564,98765543,"sulur")).collect(Collectors.toList()));
        assertEquals(1,orderservice.getAllOrdersByProductid(productid).size());
    }
}