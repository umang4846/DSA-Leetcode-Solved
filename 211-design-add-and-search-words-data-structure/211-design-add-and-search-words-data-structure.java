class WordDictionary {

        
    class Node{
        Node[] children = new Node[26];
        boolean isWord;
    }
    Node root = new Node();

    /** Initialize your data structure here. */
    public WordDictionary() {
        
    }
    
    public void addWord(String word) {
        Node curr = root;
        for(int i =0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(curr.children[ch-'a'] == null){
                curr.children[ch - 'a'] = new Node();
            }
            curr = curr.children[ch - 'a'];
        }
        curr.isWord = true;
    }
    
    public boolean search(String word) {
        return searchHelper(word, root, 0);
    }
    
    public boolean searchHelper(String word, Node curr, int pos){
            if(curr == null){
                    return false;
                }
        
        if(pos == word.length()){
            return curr.isWord;
        }
        
        char ch = word.charAt(pos);
            if(ch == '.'){
                for(int j =0; j<26; j++){
                        if(searchHelper(word, curr.children[j], pos + 1)){
                            return true;
                        }
                }
            }else{
                if(searchHelper(word, curr.children[ch - 'a'], pos + 1)){
                    return true;
                }
            }
        
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */