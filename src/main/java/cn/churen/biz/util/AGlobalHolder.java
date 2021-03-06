package cn.churen.biz.util;

import org.glassfish.grizzly.Grizzly;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class AGlobalHolder {

  private static final Map<String, Object> global = new HashMap<>();
  private static Logger logger = Grizzly.logger(AGlobalHolder.class);

  @SuppressWarnings({"unchecked"})
  public static <T> T get(String key, Class<T> clazz) {
    Object o = AGlobalHolder.global.get(key);
    return (null != o && o.getClass().isAssignableFrom(clazz)) ? (T) o : null;
  }

  @SuppressWarnings({"unchecked"})
  public static <T> T getOrDefault(String key, Class<T> clazz, Object defaultValue) {
    Object rtn = AGlobalHolder.get(key, clazz);
    return rtn == null ? (T) defaultValue : (T) rtn;
  }

	public static void set(Map<String, Object> entries) {
		AGlobalHolder.global.putAll(entries);
	}

	public static void set(String key, Object value) {
		AGlobalHolder.global.put(key, value);
	}

	// ... ... ... ... ...
  public static void invokeMethodInAnnotation(String[] methodNames, Object[] params) {
    for (int i = 0; null != methodNames && i < methodNames.length; i++) {
      String[] arr = methodNames[i].split("\\.");
      if (arr.length != 2) {
        continue;
      }
      String serviceName = arr[0];
      String methodName = arr[1];
    }
  }
}
