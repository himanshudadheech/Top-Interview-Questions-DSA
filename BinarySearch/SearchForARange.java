public class SearchForARange {
    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        ArrayList<Integer> res=new ArrayList<Integer>();
       res.add(bSearch(A,B,true));
       res.add(bSearch(A,B,false));
       return res;
   }
     public int bSearch(final List<Integer> A,int B,boolean first)
   {
       int n=A.size();
       int low=0,mid=0,high=n-1;
       int index=-1;
       while(low<=high)
       {
           mid=(low+high)/2;
           if(B==A.get(mid))
           {
               index=mid;
               if(first)
                   high=mid-1;
               else
                   low=mid+1;
           }
           else if(B<A.get(mid))
               high=mid-1;
           else
               low=mid+1;
       }
       return index;
   }
}
