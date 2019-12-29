package anonymousClass;

/**
 * Should be used LOCAL and when we want use it just once
 */
public class Anonymous{
    public static void main(String[] args) {
        AnonymousLanguage python = () -> System.out.println("Using Python"); // Lambda

        AnonymousLanguage java = new AnonymousLanguage() {
            @Override
            public void languageSpeak() {
                System.out.println("Using Java");
            }
        };

        python.languageSpeak();
        java.languageSpeak();
    }


}
/**
 */