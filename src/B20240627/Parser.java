package B20240627;

import java.util.ArrayList;
import java.util.List;

public interface Parser {
    List<String> htmlList = new ArrayList<>();
    List<String> parser(String html);
}
