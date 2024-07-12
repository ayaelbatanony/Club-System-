package projectjava;

public class form2_table {
    private String Hobby, Session, Price;
    
    public form2_table(String Hobby, String Session, String Price){
        this.Hobby=Hobby;
        this.Session=Session;
        this.Price=Price;
    }

    public String getHobby() {
        return Hobby;
    }

    public void setHobby(String Hobby) {
        this.Hobby = Hobby;
    }

    public String getSession() {
        return Session;
    }

    public void setSession(String Session) {
        this.Session = Session;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

}
