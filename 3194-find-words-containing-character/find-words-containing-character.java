class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> w = new ArrayList<>();
        for(int i=0; i<words.length;i++){
            for(char c1:words[i].toCharArray())
            {
                if(c1==x)
                {
                    w.add(i);
                    break;
                }
            }
        }
        return w;
    }
}