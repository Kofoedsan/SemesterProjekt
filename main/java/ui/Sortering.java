package ui;

import persistence.DbOrderMapper;

public class Sortering {

   private DbOrderMapper dbOrderMapper;

    public Sortering(DbOrderMapper dbOrderMapper) {
        this.dbOrderMapper = dbOrderMapper;
    }

    public void showOrdersByTime(){
        System.out.println(dbOrderMapper.getAllOrders());




}
}
