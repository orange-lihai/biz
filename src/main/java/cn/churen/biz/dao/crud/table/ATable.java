package cn.churen.biz.dao.crud.table;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ATable {
  String name();
}
