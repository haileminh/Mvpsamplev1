package net.hailm.mvpsample1.model.entity;

/**
 * Created by hai.lm on 26/01/2018.
 */

public class Demo {
    private String message;

    public Demo(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "message='" + message + '\'' +
                '}';
    }

}
