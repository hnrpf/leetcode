package leetcode;
public class Test {

	private int a[] = {1,2,3,4,5};//�����ʼֵ1 2 3 4 5

	public void delete(int n)//ɾ��������n��ֵ
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
	public void print()//��ӡ����
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
