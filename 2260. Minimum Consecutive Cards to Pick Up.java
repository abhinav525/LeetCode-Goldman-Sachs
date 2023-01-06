class Solution {
    public int minimumCardPickup(int[] cards) {
        int [] previndex=new int[1000001];//array size 10^6+1;
        Arrays.fill(previndex,-1);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<cards.length;i++){
            if(previndex[cards[i]]!=-1){//for pair identified i-lastoccurence+1
                ans=Math.min(i-previndex[cards[i]]+1,ans);
            }
            previndex[cards[i]]=i;//update last index of the card to be i
        }
        return ans == Integer.MAX_VALUE?-1:ans;
        //explanation copy m likha hai<3
       
        
    }
    
}
