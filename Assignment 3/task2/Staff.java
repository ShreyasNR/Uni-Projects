

public abstract class Staff {

    /* fields declarations*/
    private String name;
    private String id;
    private String position;

    public Staff() {
    }

    /*constructor to initialise data field */
    public Staff(String name, String id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }

    /*setters for all fields*/
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    /*getters for all fields*/
    public String getPosition() {
        return position;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

 
    public abstract String toString();

}
