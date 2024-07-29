package ep11;

public class Person {
    private String fname;
    private String lname;
    private String phone;

    public Person(String fname,String lname,String phone) {
        this.fname = fname;
        this.lname=lname;
        this.phone=phone;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "first name: "+this.fname+" , "+"last name: "+this.lname+" , "+"phone: "+this.phone;
    }
    public boolean equals(Object obj){
        Person p=(Person) obj;
        if(this.fname.compareTo(p.fname)==0&&this.lname.compareTo(p.lname)==0
                &&this.phone.compareTo(p.phone)==0)
            return true;
        else return false;
    }
}

