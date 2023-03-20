class Solution {
    public int[] evenOddBit(int n) {
        int[] res=new int[2];
        String binaryString = Integer.toBinaryString(n);
        int len=binaryString.length();
        for(int i=binaryString.length()-1;i>=0;i--){
            if(binaryString.charAt(i)=='1'){
                if((len-i-1)%2==0){
                    res[0]++;
                }else{
                    res[1]++;
                }
            }
        }
        return res;
    }
}