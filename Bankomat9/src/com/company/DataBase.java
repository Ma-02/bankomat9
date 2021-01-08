package com.company;
import java.util.Random;

public class DataBase {
    public boolean connection;

    //вкидывает исключение ОтсуствиеСоединения
    //throws an exception from the missing connection

    boolean connect() throws NoConnectionEx{
        Random rand = new Random();
        int error = rand.nextInt(10);

        //error >=6 - ошибка соединения - вкидывает исключени под этим номером
        //error >=6-connection error-throws exceptions under this number

        if (error>=6) {
            NoConnectionEx nc1 =new NoConnectionEx();
            nc1.setNrError(error);
            throw new NoConnectionEx();
        }

        connection= true;
        return true;

    }
}
