//package com.TacoBites.repository;
//
//import com.TacoBites.model.Ingredient;
//import com.TacoBites.model.Type;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//
//public class JDBCIngredientRepository implements IngredientRepository{
//
//    private JdbcTemplate jdbc;
//
//    @Autowired
//    public JDBCIngredientRepository(JdbcTemplate jdbc) {
//        this.jdbc = jdbc;
//    }
//    @Override
//    public Iterable<Ingredient> findAll() {
//        return jdbc.query("select id, name, type from Ingredient",
//                this::mapRowToIngredient);
//    }
//
//
////    alternate solution with rowmapper interface implementation.
////    @Override
////    public Ingredient findOne(String id) {
////        return jdbc.queryForObject(
////                "select id, name, type from Ingredient where id=?",
////                new RowMapper<Ingredient>() {
////                    public Ingredient mapRow(ResultSet rs, int rowNum)
////                            throws SQLException {
////                        return new Ingredient(
////                                rs.getString("id"),
////                                rs.getString("name"),
////                               Type.valueOf(rs.getString("type")));
////                    };
////                }, id);
////    }
//    @Override
//    public Ingredient findOne(String id) {
//        return jdbc.queryForObject(
//                "select id, name, type from Ingredient where id=?",
//                this::mapRowToIngredient, id);
//    }
//
//
//    @Override
//    public Ingredient save(Ingredient ingredient) {
//        jdbc.update(
//                "insert into Ingredient (id, name, type) values (?, ?, ?)",
//                ingredient.getId(),
//                ingredient.getName(),
//                ingredient.getType().toString());
//        return ingredient;
//    }
//
//    private Ingredient mapRowToIngredient(ResultSet rs, int rowNum)
//            throws SQLException {
//        return new Ingredient(
//                rs.getString("id"),
//                rs.getString("name"),
//                Type.valueOf(rs.getString("type")));
//    }
//}
