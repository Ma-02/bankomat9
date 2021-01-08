package com.company;

public class Account {
    private double accountStatus;
    private DataBase dataBase;

    private boolean connectDataBase() throws NoConnectionEx {
        try {
            dataBase.connect();
        } catch (NoConnectionEx er) {
            throw er;
        }
        return true;
    }

    //Кидает исключение НетСоединения(NoConnectionEx) под номером или НетДенег(NoMoney)
    //Throws a No Connection exception under the number or No Money
    double withdrawMoney (int amount) {

        this.connectDataBase();
        // ... code который надо прописать
        // ... write code here
        return amount;
    }

    //Кидает исключение НетСоединения
    //Throws a No connection exception
    double deposit(double amount) {
        this.connectDataBase();
        // ... code который надо прописать
        // ... write code here

        return amount;
    }



}