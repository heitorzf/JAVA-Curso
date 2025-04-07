package entities;

public class RoomRent {
    private String name;
    private String Email;
    public RoomRent(String name , String Email) {
        this.name = name;
        this.Email = Email;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return Email;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email) {
        Email = email;
    }
    public String toString(){

        return  name + ", " + Email;
    }
}
