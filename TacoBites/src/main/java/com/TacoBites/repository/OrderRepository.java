package com.TacoBites.repository;


import com.TacoBites.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByDeliveryZip(String deliveryZip);

    List<Order> readOrdersByDeliveryZipAndPlacedAtBetween(
            String deliveryZip, Date startDate, Date endDate);
    List<Order> findByDeliveryToAndDeliveryCityAllIgnoresCase(
            String deliveryTo, String deliveryCity);
    List<Order> findByDeliveryCityOrderByDeliveryTo(String city);
}
