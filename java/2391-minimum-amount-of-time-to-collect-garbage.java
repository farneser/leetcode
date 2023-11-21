class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int[] prefixTravel = new int[garbage.length];
        
        for(int i=1; i < garbage.length; i++){
            prefixTravel[i] = prefixTravel[i-1] + travel[i-1];
        }
        
        int m=0, p=0, g=0;
        int mLast=0, pLast=0, gLast=0;
        
        for(int i = 0; i < garbage.length; i++){
            String str = garbage[i];
            
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == 'M'){
                    m++;
                    mLast = i;
                }
                if(str.charAt(j) == 'G'){
                    g++;
                    gLast = i;
                }
                if(str.charAt(j) == 'P'){
                    p++;
                    pLast = i;
                }
            }
        }
 
        return prefixTravel[pLast] + prefixTravel[mLast] + prefixTravel[gLast] + m + p + g;
    }
}
