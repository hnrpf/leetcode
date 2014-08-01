package leetcode;
public class Test {

	private int a[] = {1,2,3,4,5};//数组初始值1 2 3 4 5

	public void delete(int n)//删除数组中n的值
	{
	for (int i = 0; i < a.length; i++) {
	if(a[i] == n)
	{
	for(int j = i; j < a.length-1; j++)
	{
	a[j] = a[j+1];
	}
	}
	}
	}
	public void print()//打印数组
	{
	for (int i = 0; i < a.length; i++) {
	System.out.println (a[i]);
	}
	}

	    public static void main(String[] args) {
	Test t = new Test();
	t.delete(4);
	t.print();
	    }
	}
