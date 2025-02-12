//package com.TacoBites.repository;
//
//import com.TacoBites.model.Order;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
//import org.springframework.stereotype.Repository;
//
//
//@Repository
//public class JdbcOrderRepository implements OrderRepository{
//
//    private SimpleJdbcInsert orderInserter;
//    private SimpleJdbcInsert orderTacoInserter;
//    private ObjectMapper objectMapper;
//    @Autowired
//    public JdbcOrderRepository(JdbcTemplate jdbc) {
//        this.orderInserter = new SimpleJdbcInsert(jdbc)
//                .withTableName("Taco_Order")
//                .usingGeneratedKeyColumns("id");
//        this.orderTacoInserter = new SimpleJdbcInsert(jdbc)
//                .withTableName("Taco_Order_Tacos");
//        this.objectMapper = new ObjectMapper();
//    }
//
//
//    @Override
//    public Order save(Order order) {
//        return null;
//    }
//}
