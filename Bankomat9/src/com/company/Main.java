package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DataBase db1 = new DataBase();
        Account ac1 = new Account();
        ac1.setDataBase(db1);  //

        ac1.deposit(100);
        ac1.withdrawMoney(200);
    }
}
