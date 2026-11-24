class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        

           // int max = Integer.MIN_VALUE;

        //    for(int i=0;i<letters.length;i++){
        //       char ch = letters[i];
        //    }
        //    for(int i=0;i<letters.length;i++){
        //       if(letters[i] != target){ 
        //        return letters[0];
        //       }

            int st =0;
            int end = letters.length;

            while(st<end){
                int mid = st+(end-st)/2;

                if(letters[mid] == target){
                    st = mid+1;
                }
                else if( letters[mid] < target){
                    st = mid+1;
                }else{
                    end = mid;
                }
            }
           
              return letters[st % letters.length];
    }
}





//       Return the smallest character in letters that is lexicographically greater than target
//  such a character does not exist, return the first character in letters.

 


 //   traverse
 //   if the character does not exist then return first character in letters.
 //   if character is present then return greater letter according to that letter