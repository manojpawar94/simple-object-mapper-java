package org.manoj.sm;

import java.lang.reflect.Field;
import java.util.HashMap;

/**
 * SMapper provides method to map the source object with targe object.
 * 
 * @author Manoj Pawar
 * @version 1.0
 */
public class SMapper {

    /**
     * 
     * It maps all non null fields of a source object with fields of a target object
     * based upon the mapping congfigured using SField annotation.
     * 
     * @param s      An instance of the source object.
     * @param tClass A Class type of the target object.
     * @return It returns the object instance of the target object which is
     *         intialized based upon mapping configured.
     */
    @SuppressWarnings("unchecked")
    public <S, T> T map(S s, Class<T> tClass) {
        Class<S> sClass = (Class<S>) s.getClass();
        T tObject = null;

        try {
            HashMap<String, String> mapping = new HashMap<>();
            tObject = tClass.newInstance();
            Field[] sFields = sClass.getDeclaredFields();
            for (Field field : sFields) {
                field.setAccessible(true);
                if (field.isAnnotationPresent(MField.class)) {
                    mapping.put(field.getAnnotation(MField.class).value(), field.getName());
                }
            }

            Field[] tFields = tClass.getDeclaredFields();
            for (Field field : tFields) {
                field.setAccessible(true);
                if (field.isAnnotationPresent(MField.class)) {
                    mapping.put(field.getName(), field.getAnnotation(MField.class).value());
                }
            }

            for (Field field : tFields) {
                field.setAccessible(true);
                if (mapping.get(field.getName()) != null) {
                    Field sField = sClass.getDeclaredField(mapping.get(field.getName()));
                    sField.setAccessible(true);
                    field.set(tObject, sField.get(s) != null ? sField.get(s) : null);
                }
            }

        } catch (InstantiationException | IllegalAccessException | SecurityException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        return tObject;
    }

}