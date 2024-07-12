package projectjava;

public class hoppy {
    
    private String course_name, coach_name, price;
    public hoppy(String course_name, String coach_name, String price){
        this.course_name=course_name;
        this.coach_name=coach_name;
        this.price=price;
    }

    /**
     * @return the course_name
     */
    public String getCourse_name() {
        return course_name;
    }

    /**
     * @param course_name the course_name to set
     */
    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    /**
     * @return the coach_name
     */
    public String getCoach_name() {
        return coach_name;
    }

    /**
     * @param coach_name the coach_name to set
     */
    public void setCoach_name(String coach_name) {
        this.coach_name = coach_name;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    
}
