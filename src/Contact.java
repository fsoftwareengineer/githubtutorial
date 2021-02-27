public class Contact {
// merge conflict


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    String name;
    String email;
    String phoneNumber;
// merge conflict
    private String name;
    private String email;
    private String phoneNumber;
// merge conflict 
}
public void setName(String name) {
this.name = name;
}
public void setEmail(String email) {
this.email = email;
}
public void setPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber;
}

public String getName() {
return name;
}
public String getEmail() {
return email;
}
public String getPhoneNumber() {
this.phoneNumber = phoneNumber;
}