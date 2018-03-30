package java8.optional;

import java.util.Optional;

/**
 * Created by zhaooyii on 2018/3/7.
 */
public class Car {
    private Optional<Insurance> insurance=Optional.empty();

    public Optional<Insurance> getInsurance() {
        return insurance;
    }
}
