package generics;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GenericTypes {
    public static class MyList<T> {
        public <T> void asMyList(Collection<T> collection) {
            for (T element : collection) {
                System.out.println(element);
            }
        }

        public static void main(String []args) {
            MyList<String> st = new MyList<>();
            List<String> list = Collections.singletonList("test");
            st.asMyList(list);
            List<Dog> list1 = Collections.singletonList(new Dog());
            st.asMyList(list1);
        }
    }
static class Dog{
    @Override
    public String toString() {
        return "я собака";
    }
}
}
