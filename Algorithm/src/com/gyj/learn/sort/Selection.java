package com.gyj.learn.sort;

/**
 * 选择排序：
 * 1、找到数组中最小的那个元素
 * 2、将最小的元素和数组中第一个元素交换位置
 * 3、再剩下的元素中找到最小的元素
 * 4、将最小的元素和数组中第一个元素交换位置
 * @author  姓名 工号
 * @version  [版本号, 2015年8月13日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Comparable[] a = new int[]{"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
		int[] a = new int[]{23,33,22,12,1,45};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println("\n");
		new Selection().sort(a);
	}
	
	public Example example = new Example();
	/**
	 * 选择排序
	 * @param a
	 * @see [类、类#方法、类#成员]
	 */
	public void sort(int[] a){
		int N = a.length;
		for (int i = 0; i < N; i++) {
		//	int min = i;
			for (int j = i + 1; j < N; j++) {
					
				if (a[j] > a[i]) {
					//min = j;
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
			
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j] + "\t");
			}
			System.out.println("\n");
		}
		
		//example.show(a);
	}
	
	
	

}
