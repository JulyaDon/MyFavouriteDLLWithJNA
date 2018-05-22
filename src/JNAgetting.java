import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * Created by July on 22.05.2018.
 */
public class JNAgetting {
    public interface DllInterface extends Library {
        DllInterface INSTANCE = (DllInterface) Native.loadLibrary("simpleDLL", DllInterface.class);

        String getSentence (int number);
    }

    public String getSentence () {
        String v = DllInterface.INSTANCE.getSentence (6);
        return v;
    }
}
