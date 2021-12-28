class Solution {
   public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
    res.add(new ArrayList<>());
    res.add(new ArrayList<>());
       
	for(int i=0; i < colsum.length; i++){
		if(colsum[i] == 2){
			res.get(0).add(1);
			res.get(1).add(1);
			upper--;
			lower--;
		}else if(colsum[i] == 1){
			if(upper > lower){
				res.get(0).add(1);
				res.get(1).add(0);
				upper--;
			}else{
				res.get(0).add(0);
				res.get(1).add(1);
				lower--;
			}
		}else{
			res.get(0).add(0);
			res.get(1).add(0);
		}
	}

	if(lower != 0 || upper != 0){
		return Collections.emptyList();
	}

	return res;       
}
}