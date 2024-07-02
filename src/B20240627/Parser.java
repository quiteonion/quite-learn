package B20240627;

import java.util.ArrayList;
import java.util.List;

public interface Parser {
    ArrayList<URLContent> htmlList = new ArrayList<>();
    List<URLContent> parser(String html);
}
