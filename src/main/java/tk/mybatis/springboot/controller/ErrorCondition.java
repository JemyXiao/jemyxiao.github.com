package tk.mybatis.springboot.controller;

/**
 * Created by jmx on 16/7/15.
 */
public class ErrorCondition {
    private String name;
    private String idCard;
    private String status;
    private String message;

    public ErrorCondition(String name, String idCard, String status, String message) {
        this.name = name;
        this.idCard = idCard;
        this.status = status;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
