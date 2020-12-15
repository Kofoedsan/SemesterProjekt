package persistence;

import domain.Order;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbOrderMapper {

    private Database database;

    public DbOrderMapper(Database database) {
        this.database = database;
    }

        public List<Order> orderList = new ArrayList<>();
    public List<Order> getAllOrders() {


        String sql = "select * from mario.order  order by pickup_time DESC ";

        try (Connection connection = database.connect()) {
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int order_nr = rs.getInt("order_nr");
                    int pizza_id = rs.getInt("pizza_id");
                    int amount = rs.getInt("amount");
                    int pickup_time = rs.getInt("pickup_time");
                    Timestamp order_time = rs.getTimestamp("order_time");
                    String custemor_name = rs.getString("custemor_name");
                    String phone = rs.getString("phone");
//                    int price = rs.getInt("price");
                    orderList.add(new Order(order_nr, pizza_id, amount, pickup_time, order_time, custemor_name, phone));
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return orderList;
    }

    public Order insertOrder(Order order) {
        boolean result = false;
        int newId = 0;

//
        String sql = "INSERT INTO mario.order ( pizza_id, amount, pickup_time, order_time, custemor_name, phone, remove) values (?, ?, ?,NOW(),?,?,?)";
        try (Connection connection = database.connect()) {
            try (PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, order.getPizzaId());
                ps.setInt(2, order.getAmount());
                ps.setInt(3, order.getPickuptime());
                ps.setString(4, order.getCustomerName());
                ps.setString(5, order.getPhone());
                ps.setBoolean(6, order.isRemove());

                int rowsAffected = ps.executeUpdate();
                if (rowsAffected == 1) {
                    result = true;
                }

                ResultSet idResultset = ps.getGeneratedKeys();
                if (idResultset.next()) {
                    newId = idResultset.getInt(1);
                    order.setOrderNr(newId);
                } else {
                    order = null;
                }
            } catch (SQLException throwables) {
                // TODO: Make own throwable exception and let it bubble upwards
                throwables.printStackTrace();
            }
        } catch (SQLException throwables) {
            // TODO: Make own throwable exception and let it bubble upwards
            throwables.printStackTrace();
        }
        return order;
    }
//    public Order (int pizzaNo) {
//        Pizza pizza = null;
//        String sql = "select * from pizza where pizza_no = ?";
//        try (Connection connection = database.connect()) {
//            try (PreparedStatement ps = connection.prepareStatement(sql)) {
//                ps.setInt(1, pizzaNo);
//                ResultSet rs = ps.executeQuery();
//                if (rs.next()) {
//                    int pizza_id = rs.getInt("pizza_id");
//                    int pizza_no = rs.getInt("pizza_no");
//                    String name = rs.getString("name");
//                    String ingredients = rs.getString("ingredients");
//                    int price = rs.getInt("price");
//                    pizza = new Pizza(pizza_id, pizza_no, name, ingredients, price);
//                }
//            } catch (SQLException throwables) {
//                // TODO: Make own throwable exception and let it bubble upwards
//                throwables.printStackTrace();
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return pizza;
//    }
//
//    public boolean deletePizza(int pizzaNo) {
//        boolean result = false;
//        String sql = "delete from pizza where pizza_no = ?";
//        try (Connection connection = database.connect()) {
//            try (PreparedStatement ps = connection.prepareStatement(sql)) {
//                ps.setInt(1, pizzaNo);
//                int rowsAffected = ps.executeUpdate();
//                if (rowsAffected == 1) {
//                    result = true;
//                }
//            } catch (SQLException throwables) {
//                // TODO: Make own throwable exception and let it bubble upwards
//                throwables.printStackTrace();
//            }
//        } catch (SQLException throwables) {
//            // TODO: Make own throwable exception and let it bubble upwards
//            throwables.printStackTrace();
//        }
//        return result;
//    }
//
//    public Pizza insertPizza(Pizza pizza) {
//        boolean result = false;
//        int newId = 0;
//        String sql = "insert into pizza (pizza_no, name, ingredients, price) values (?,?,?,?)";
//        try (Connection connection = database.connect()) {
//            try (PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
//                ps.setInt(1, pizza.getPizzaNo());
//                ps.setString(2, pizza.getName());
//                ps.setString(3, pizza.getIngredients());
//                ps.setInt(4, pizza.getPrice());
//                int rowsAffected = ps.executeUpdate();
//                if (rowsAffected == 1) {
//                    result = true;
//                }
//                ResultSet idResultset = ps.getGeneratedKeys();
//                if (idResultset.next()) {
//                    newId = idResultset.getInt(1);
//                    pizza.setPizzaId(newId);
//                } else {
//                    pizza = null;
//                }
//            } catch (SQLException throwables) {
//                // TODO: Make own throwable exception and let it bubble upwards
//                throwables.printStackTrace();
//            }
//        } catch (SQLException throwables) {
//            // TODO: Make own throwable exception and let it bubble upwards
//            throwables.printStackTrace();
//        }
//        return pizza;
//    }
//
//    public boolean updatePizza(Pizza pizza) {
//        boolean result = false;
//        String sql = "update pizza set pizza_no = ?, name = ?, ingredients = ?, price = ? where pizza_no = ?";
//        try (Connection connection = database.connect()) {
//            try (PreparedStatement ps = connection.prepareStatement(sql)) {
//                ps.setInt(1, pizza.getPizzaNo());
//                ps.setString(2, pizza.getName());
//                ps.setString(3, pizza.getIngredients());
//                ps.setInt(4, pizza.getPrice());
//                ps.setInt(5, pizza.getPizzaNo());
//                int rowsAffected = ps.executeUpdate();
//                if (rowsAffected == 1) {
//                    result = true;
//                }
//            } catch (SQLException throwables) {
//                // TODO: Make own throwable exception and let it bubble upwards
//                throwables.printStackTrace();
//            }
//        } catch (SQLException throwables) {
//            // TODO: Make own throwable exception and let it bubble upwards
//            throwables.printStackTrace();
//        }
//        return result;
//    }
}
