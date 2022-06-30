class Solution {
    static final int MOD=(int)1e7+7,MAX=(int)1e4+1;
    static final int[] F=new int[MAX];
    static{
        F[0]=1;
        F[1]=2;
        for(int i=2;i<MAX;++i){
            F[i]=(F[i-1]+F[i-2])%MOD;
        }

    }
    public int countHousePlacements(int n) {
        return (int)((long)F[n]*F[n]%MOD);
    }
    public static void main(String[] args) {
        System.out.println(new Solution().countHousePlacements(1000));
    }
}