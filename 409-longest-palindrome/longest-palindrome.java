    class Solution {
        public int longestPalindrome(String s) {
            int n = s.length();
            int freq[] = new int[128];

            for(char ch : s.toCharArray()){
                
                // if(Character.isUpperCase(ch))
                //     freq[ch - 'A']++;
                 freq[ch]++;
            }
            int count = 0;
            int max = 0;
            int flag = 0;
            boolean odd = false;
            for(int f : freq){
                if(f % 2 == 0){
                    count+= f;
                }
                else{
                    count+=f - 1;
                    // odd = true;
                    flag = 1;
                }
            }
        
            return flag == 1 ? count + 1 : count;
        }
    }