package nhitruong.com.chatfirebase;

/**
 * Class responsible to register all the callbacks necessary
 * for the application
 */
public interface ActivityCallback {
    void openChat();
    void openCreateAccount();
    void logout();
}