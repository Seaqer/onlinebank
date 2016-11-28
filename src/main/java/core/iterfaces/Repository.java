package core.iterfaces;

import java.util.List;

public interface Repository<T> {
        T addElement(T element);
        T updateElement(T element);
        boolean deleteElement(T element);
        List<T> getElements(T element);
}
