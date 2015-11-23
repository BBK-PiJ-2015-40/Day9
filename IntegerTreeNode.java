public class IntegerTreeNode implements IntegerTree {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	
	public void addInteger(int newInteger){
		if(newInteger>value){
			if(right==null){ right = new IntegerTreeNode(newInteger);
			} else{ right.addInteger(newInteger);
				}
		} else{
				if(left==null){left = new IntegerTreeNode(newInteger);
				} else {
				left.addInteger(newInteger);
				}
		}
	}

}