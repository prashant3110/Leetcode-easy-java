class Solution {
    public String longestCommonPrefix(String[] strs) {
        String output = "";

        for(int i=0;i<strs[0].length();i++){     //loop for first string traverse
            char ch =strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){   // loop for strings in array.
                if(i==strs[j].length()||strs[j].charAt(i)!=ch){
                    return strs[0].substring(0,i);
                }
            }

        }
    return strs[0];
        
    }
}
