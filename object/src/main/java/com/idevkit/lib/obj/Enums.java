package me.ele.xy.siri.common.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;


/**
 * 枚举类辅助工具
 *
 * @author eleme taozhou.tao@alibaba-inc.com
 * @date 2022/5/12 12:24 周四
 * @apiNote
 */
public class Enums {

    /**
     * 从指定枚举类{@code clazz} 中找到枚举名称为{@code  name} 的枚举类
     *
     * @param clazz 枚举类
     * @param name  枚举名称
     * @param <E>   枚举类的泛型
     * @return 找到的枚举包裹类, 该方法为 {{@link #of(Class, Object, Function)}} 方法的在 targetAttr 为 枚举name的时候的场景
     */
    public static <E extends Enum<E>> Optional<E> of(Class<E> clazz, String name) {
        return of(clazz, name, Enum::name);
    }

    /**
     * 从指定枚举类{@code clazz} 中找到枚举属性为{@code  targetAttr} 的枚举类
     *
     * @param clazz      枚举类
     * @param targetAttr 目标属性
     * @param attrGetter 对应枚举类的属性值
     * @param <E>        枚举类的泛型
     * @param <T>        属性值的泛型
     * @return 找到的枚举包裹类
     */
    public static <E extends Enum<E>, T> Optional<E> of(Class<E> clazz, T targetAttr, Function<E, T> attrGetter) {
        if (targetAttr == null || attrGetter == null) {
            return Optional.empty();
        }
        EnumSet<E> enumSet = EnumSet.allOf(clazz);
        for (E e : enumSet) {
            T attr = attrGetter.apply(e);
            if (Objects.equals(targetAttr, attr)) {
                return Optional.of(e);
            }
        }
        return Optional.empty();
    }

    /**
     * 从指定枚举类{@code clazz} 找到某个属性并封装为集合
     *
     * @param clazz      枚举类
     * @param attrGetter 属性获取
     * @param <E>        枚举泛型
     * @param <T>        属性泛型
     * @return 封装后的集合
     */
    public static <E extends Enum<E>, T> List<T> map(Class<E> clazz, Function<E, T> attrGetter) {
        if (clazz == null) {
            return Collections.emptyList();
        }

        EnumSet<E> enumSet = EnumSet.allOf(clazz);
        List<T> data = new ArrayList<>();
        for (E e : enumSet) {
            final T attr = attrGetter.apply(e);
            data.add(attr);
        }
        return data;
    }
}
