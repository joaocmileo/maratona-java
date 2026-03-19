package academy.devdojo.maratonajava.javacore.TResorceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResorceBundleTest01 {
    static void main() {
        Locale localUS = Locale.US;

        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages",Locale.getDefault());
        System.out.println(resourceBundle.getString("vai.corinthians"));
        resourceBundle = ResourceBundle.getBundle("messages",localUS);
        System.out.println(resourceBundle.getString("vai.corinthians"));
    }
}
