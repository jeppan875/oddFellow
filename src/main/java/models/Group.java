package models;

public class Group {

    public Group(String name, String description, String sender, String rubrikPrefix) {
        this.name = name;
        this.description = description;
        this.sender = sender;
        this.rubrikPrefix = rubrikPrefix;
    }

    private  String name;
    private String description;
    private String sender;
    private String rubrikPrefix;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRubrikPrefix() {
        return rubrikPrefix;
    }

    public void setRubrikPrefix(String rubrikPrefix) {
        this.rubrikPrefix = rubrikPrefix;
    }
}
