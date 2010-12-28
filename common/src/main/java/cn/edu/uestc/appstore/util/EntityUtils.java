/**
 * 
 */
package cn.edu.uestc.appstore.util;

import java.lang.reflect.Field;

/**
 * @author Selerda
 *
 */
public class EntityUtils {
	
	public static String toFormatString(Object entity) {
		if (entity == null)
			return "";
		StringBuffer sb = new StringBuffer();
		sb.append("==========" + entity.getClass().getName() + "==========\n");
		for (Field f : entity.getClass().getDeclaredFields()) {
			try {
				f.setAccessible(true);
				sb.append(f.getName() + ":" + f.get(entity) + "\n");
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		sb.append("========================================\n");
		return sb.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
