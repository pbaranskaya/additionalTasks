package Reflection;

// + Создать класс Cat. Создать класс Tiger, наследоваться от Cat.
// + Добавить public, protected, private переменные в оба класса.
// + Добавить public, protected, private методы в оба класса.
//
// + Создать объект Class для Cat.
// + Создать объект Class для Tiger.
//
// Вывести на экран все методы Cat. (private в том числе) - getDeclaredMethods
// Вывести на экран все методы Tiger. (private в том числе) - getDeclaredMethods
//
// + Вывести на экран все названия переменных класса Cat. (private в том числе) - getDeclaredFields
// + Вывести на экран все названия переменных класса Tiger. (private в том числе) - getDeclaredFields
//
// + Изменить 1 переменную класса Cat. (private)
// + 1 переменную класса Tiger. (не private)
//
// + Добавить метод run в Tiger с private модификатором доступа,
// + вызвать с помощью invoke().
//
// + Создать свою аннотацию, добавить 2 переменные.
// + Добавить аннотацию в класс Cat.
// + Добавить аннотацию в класс Tiger.
// + Вывести на экран значение из аннотации.

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) {

        Cat c = new Cat("Cat", 2,"black");
        Tiger t = new Tiger("Tiger", 6, "red", "kind", 78, "blue");

        Class<Cat> catClass = Cat.class;
        Class<Tiger> tigerClass = Tiger.class;

        try {
            Field nameField = catClass.getDeclaredField("name");
            Field ageField = catClass.getDeclaredField("age");
            Field colorField = catClass.getDeclaredField("color");
            ageField.setAccessible(true);
            colorField.setAccessible(true);
            System.out.println(nameField.get(c));
            System.out.println(ageField.get(c));
            System.out.println(colorField.get(c));
            nameField.set(c, "kitten");
            System.out.println(nameField.get(c));

            Method[] declaredMethods = catClass.getDeclaredMethods();
            for (Method method : declaredMethods) {
                System.out.println(method);
            }

            Method growMethod = catClass.getDeclaredMethod("grow");
            System.out.println(growMethod);

            MoreInformation annotation = catClass.getAnnotation(MoreInformation.class);
            System.out.println(annotation.country());
            System.out.println(annotation.nameOfOwner());

            System.out.println("=============");


            Field characterField = tigerClass.getDeclaredField("character");
            Field linesField = tigerClass.getDeclaredField("lines");
            Field eyesColorField = tigerClass.getDeclaredField("eyesColor");
            linesField.setAccessible(true);
            eyesColorField.setAccessible(true);
            System.out.println(characterField.get(t));
            System.out.println(linesField.get(t));
            System.out.println(eyesColorField.get(t));
            characterField.set(t, "evil");
            System.out.println(characterField.get(t));

            MoreInformation annotation2 = tigerClass.getAnnotation(MoreInformation.class);
            System.out.println(annotation2.country());
            System.out.println(annotation2.nameOfOwner());

            Method runMethod = tigerClass.getDeclaredMethod("run");
            runMethod.setAccessible(true);
            runMethod.invoke(t);

        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
