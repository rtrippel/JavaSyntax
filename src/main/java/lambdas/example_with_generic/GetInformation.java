package lambdas.example_with_generic;


@FunctionalInterface
public interface GetInformation<T> {
    public T get(Car car);
}
