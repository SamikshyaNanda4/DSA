/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<HashMap<Character, Integer>, ArrayList<String>> bigMap=new HashMap<>();

        for(String str: strs){
            HashMap<Character, Integer> fmap= new HashMap<>();
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                fmap.put(ch,fmap.getOrDefault(ch,0)+1 );
            }

            if(bigMap.containsKey(fmap)==false){
                ArrayList<String> list =new ArrayList<>();
                list.add(str);
                bigMap.put(fmap,list);
            }else{
                ArrayList<String> list =bigMap.get(fmap);
                list.add(str);
            }
        }
        ArrayList<ArrayList<String>> result =new ArrayList<>();
        for(ArrayList<String> val : bigMap.values()){
            result.add(val);
        }
        return new ArrayList<> (result);
    }
}
// @lc code=end

