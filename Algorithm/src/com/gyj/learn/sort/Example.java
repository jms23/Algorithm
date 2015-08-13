package com.gyj.learn.sort;
/**
 * 排序类模板
 * 
 * @author gyj
 * @version  [版本号, 2015年8月13日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Example {
	
	/**
	 * 对元素进行比较
	 * @param v
	 * @param w
	 * @return v 在 w 前面返回true， 否则false
	 * @see [类、类#方法、类#成员]
	 */
	public static boolean less(Comparable v, Comparable w){
		return v.compareTo(w) < 0;
	}
	
	/**
	 * 交换i和j的位置
	 * @param a
	 * @param i
	 * @param j
	 * @see [类、类#方法、类#成员]
	 */
	public static void exch(Comparable[] a, int i, int j){
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	/**
	 * 打印数组
	 * @param a
	 * @see [类、类#方法、类#成员]
	 */
	public static void show(Comparable[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "");
		}
		System.out.println();
	}

}
