package com.academy;

/**
 * @author HungKuen
 */
public class User {

    private int id;

    /**
     * -konstruktor
     *
     * @param id användarens id
     */
    public void User(int id) {
        try {
            if (this.id < 0) {
                throw new IllegalArgumentException("det var inte ett positivt heltal");
            }
        } catch (ExceptionInInitializerError error) {
            System.out.println(error);
        }
        this.id = id;
        System.out.println("klart");
    }
}
