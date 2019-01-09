public class SimpleLoginApp
{
    public static void main(String[] args)
    {
	Properties login = new Properties();
	try (FileReader in = new FileReader("login.properties")) {
	    login.load(in);
	}
	String username = login.getProperty("username");
	String password = login.getProperty("password");
    }
}
