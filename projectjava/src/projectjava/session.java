/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

public class session {
     private String course, session1, session2;
     public session(String course, String session1, String session2) {
        this.course = course;
        this.session1 = session1;
        this.session2 = session2;
    }
   public String getCourse() {
        return course;
    }

    public String getSession1() {
        return session1;
    }

    public String getSession2() {
        return session2;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setSession1(String session1) {
        this.session1 = session1;
    }

    public void setSession2(String session2) {
        this.session2 = session2;
    }
}
