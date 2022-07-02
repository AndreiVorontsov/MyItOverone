package level4.lesson4.part01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//Создайте 2 аннотации: OnlyForField, OnlyForMethod.
// Сделайте так, чтобы 1ую аннотацию можно было добавлять только к полям,
// а 2ую аннотацию только к методам. Создайте класс с 2 любыми полями и
// 2 любыми методами, добавьте @OnlyForField на оба поля и @OnlyForMethod только на 1 любой метод.
@Target(ElementType.FIELD)
public @interface OnlyForField {
}


