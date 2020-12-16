package lambdas.with_generic;


@FunctionalInterface
public interface GetInformation<T> {
    public T get(Car car);
}
