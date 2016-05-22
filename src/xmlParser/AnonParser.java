package xmlParser;

import java.io.File;
import java.util.Set;

public interface AnonParser {
    Set<String> getAttributes(File file);

    String getAttributeValues(String attr);
}
