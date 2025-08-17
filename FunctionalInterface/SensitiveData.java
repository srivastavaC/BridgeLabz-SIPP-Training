import java.util.Scanner;
public class SensitiveDataTagging {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter username : ");
        String uname = sc.nextLine();

        System.out.print("Enter password : ");
        String pwd = sc.nextLine();

        
        UserAccount user = new UserAccount(uname, pwd);

        
        EncryptionService.processObject(user);
	}
}