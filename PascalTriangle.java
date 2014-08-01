package leetcode;
import java.util.ArrayList;
import java.util.List;
public class PascalTriangle {

	/**
	 * @param args
	 */
	private ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        if(numRows<1)
            return res;
        for(int deep=1;deep<=numRows;deep++)
        {
            ArrayList<Integer> item=rec_generate(deep);
            res.add(item);
        }
        return res;
    }
    private ArrayList<Integer> rec_generate(int deep)
    {
        ArrayList<Integer> item=new ArrayList<Integer>();
        if(deep==1)
            item.add(1);
        else
        {
            item.add(1);
            int lastDep=deep-2;
            for(int i=1;i<deep-1;i++)
            {
                item.add(res.get(lastDep).get(i-1)+res.get(lastDep).get(i));
            }
            item.add(1);
        }
        return item;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
