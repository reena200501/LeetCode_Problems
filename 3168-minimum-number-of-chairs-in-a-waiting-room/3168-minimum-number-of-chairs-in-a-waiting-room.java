class Solution {
    public int minimumChairs(String s) {
        int currentPeople =0;
        int maxChairs=0;
        for(int i=0;i<s.length();i++){
            char event=s.charAt(i);
            if(event =='E'){
                currentPeople++;
            }else if(event=='L'){
                currentPeople--;
            }
            if(currentPeople>maxChairs){
                maxChairs=currentPeople;
            }
        }
        return maxChairs;
    }
}