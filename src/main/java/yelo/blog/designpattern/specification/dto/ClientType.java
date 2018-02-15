package yelo.blog.designpattern.specification.dto;

/**
 * Created by yassineelouardi on 15/11/2017.
 */
public enum ClientType {
    PROSPECT("Not Client",0),
    BANK("Client Banque",1),
    INSURANCE("Client Assurance",2);

    private String description;
    private int idProfile;

    ClientType(String description,int idProfile) {
        this.description = description;
        this.idProfile = idProfile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(int idProfile) {
        this.idProfile = idProfile;
    }
}
