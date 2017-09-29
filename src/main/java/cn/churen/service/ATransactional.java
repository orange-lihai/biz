package cn.churen.service;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ATransactional {
  String[] before() default {};
  String[] end() default {};
}
