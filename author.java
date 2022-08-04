public class author {

    String name;
    String email;
    public author(String name,String email){
        this.name=name;
        this.email=email;

    }
    public String getname(){
        return name;

    }
    public String getemail(){
        return email;

    }
    public void setemail(String email){
        this.name=name;

    }
    public String tostring(){
        return "author(name="+name+" the email is "+email+")";


    }

}
