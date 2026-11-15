/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        

        int st =1;
        int end =n;

        while(st<end){
           int mid = st+(end-st)/2;
            if(isBadVersion(mid)){
                end = mid;
            }
            else{
                st = mid+1;
            }
        }
        return st;
    }
}





//   we are a product manager and i lead a team to develop for new products
//   when any single product is bad then all products are fault
//   








