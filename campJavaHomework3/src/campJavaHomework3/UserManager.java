package campJavaHomework3;

public class UserManager {

	public void addComment(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+": yorum yapt�.");
    }
    public void editComment(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+": yorumunu d�zenledi.");
    }
    public void deleteComment(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+": yorumunu sildi.");
    }
    public void login(User user){
        System.out.println("Giri� ba�ar�l�..!");
    }
}
