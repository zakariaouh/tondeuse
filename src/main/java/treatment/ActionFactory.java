package treatment;

import java.util.List;
import java.util.stream.Collectors;

public class ActionFactory {
    public static List<Action> create(String tasks) {
        return tasks.chars()
                .mapToObj(task -> new Action((char) task))
                .collect(Collectors.toList());

    }
}


