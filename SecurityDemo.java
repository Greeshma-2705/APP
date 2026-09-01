interface BasicSecurity {
    void login();
    void logout();
}

interface AdvancedSecurity extends BasicSecurity {
    void fingerprintAuth();
    void faceAuth();
}

class BankingApplication implements AdvancedSecurity {
    public void login() { System.out.println("Login successful."); }
    public void logout() { System.out.println("Logout successful."); }
    public void fingerprintAuth() { System.out.println("Fingerprint verified."); }
    public void faceAuth() { System.out.println("Face recognition verified."); }
}

public class SecurityDemo {
    public static void main(String[] args) {
        BankingApplication app = new BankingApplication();
        app.login();
        app.fingerprintAuth();
        app.faceAuth();
        app.logout();
    }
}
