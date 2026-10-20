class Solution {
    public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
        // code here
        
        TreeSet<Integer> list = new TreeSet<>();
        
        for(int i=0;i<arr1.length;i++){
            list.add(arr1[i]);
        }
            for(int j=0;j<arr2.length;j++){
                list.add(arr2[j]);
            }
               // Arrays.sort(arr1[i][j]);
            
        
       // return list;
       return new ArrayList<>(list);

    }
}
