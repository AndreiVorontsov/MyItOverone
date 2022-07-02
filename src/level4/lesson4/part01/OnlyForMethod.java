package level4.lesson4.part01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface OnlyForMethod {
}
