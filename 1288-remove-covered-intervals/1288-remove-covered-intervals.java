class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
     Arrays.sort(intervals, (a, b) -> {
   		if (a[0] == b[0])
   			return b[1] - a[1];
   		else
   			return a[0] - b[0];
   	});

   	int count = 0;

   	int min = intervals[0][0];
   	int max = intervals[0][1];

   	for (int i = 1; i < intervals.length; i++) {

   		if (min <= intervals[i][0] && max >= intervals[i][1]) {
   			++count;
   		} else {
   			min = intervals[i][0];
   			max = intervals[i][1];
   		}
   	}

   	return intervals.length - count;
    }
}