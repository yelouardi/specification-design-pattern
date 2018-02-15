package yelo.blog.designpattern.specification.dto;

import java.util.Date;

/**
 * Created by yassineelouardi on 15/11/2017.
 */
public class Agreement {

    private int idAgrement;
    private Date agrementDate;
    private String description;

    public Agreement() {
    }

    public Agreement(int idAgrement, Date agrementDate, String description) {
        this.idAgrement = idAgrement;
        this.agrementDate = agrementDate;
        this.description = description;
    }

    public int getIdAgrement() {
        return idAgrement;
    }

    public void setIdAgrement(int idAgrement) {
        this.idAgrement = idAgrement;
    }

    public Date getAgrementDate() {
        return agrementDate;
    }

    public void setAgrementDate(Date agrementDate) {
        this.agrementDate = agrementDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
