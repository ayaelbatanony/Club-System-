package projectjava;

public class form1_table {
    private String Hobby, Session, Price,Coach_name;
    
    public form1_table(String Hobby, String Session, String Price, String Coach_name){
        this.Hobby=Hobby;
        this.Session=Session;
        this.Price=Price;
        this.Coach_name=Coach_name;
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

    public String getCoach_name() {
        return Coach_name;
    }

    public void setCoach_name(String Coach_name) {
        this.Coach_name = Coach_name;
    }
    
}
