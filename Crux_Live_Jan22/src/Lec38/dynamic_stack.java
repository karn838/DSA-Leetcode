package Lec38;
import Lec37.stack;
public class dynamic_stack extends stack{

	@Override
	public void push(int item) throws Exception {
		if(super.isfull()) {
			int[]arr  = new int[2*super.data.length];
			for(int i=0;i<super.data.length;i++)
			{
				arr[i]=this.data[i];
			}
			super.data=arr;
		}
		super.push(item);
	}

}
