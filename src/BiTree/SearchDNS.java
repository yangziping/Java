package BiTree;

public class SearchDNS {
    private final int CHAR_COUNT = 11;
    private TrieNode root = new TrieNode();
    class TrieNode{
        boolean isLeaf;
        String url;
        TrieNode[] child;
        public TrieNode(){
            this.isLeaf = false;
            this.url = null;
            this.child = new TrieNode[CHAR_COUNT];
            for(int i = 0; i < CHAR_COUNT; i++)
                child[i] = null;
        }
    }
    public int getIndexFromChar(char c){
        return (c == '.')?10:(c-'0');
    }
    public char getCharFromIndex(int i){
        return (i == 10)?'.':(char)('0' + i);
    }
    public void insert(String ip,String url){
        int len = ip.length();
        TrieNode pCrawl = root;
        int level;
        for(level = 0; level < len; level++){
            int index = getIndexFromChar(ip.charAt(level));
            if(pCrawl.child[index] == null)
                pCrawl.child[index] = new TrieNode();
            pCrawl = pCrawl.child[index];
        }
        pCrawl.url = url;
        pCrawl.isLeaf = true;
    }
    public String searchDNSCache(String ip){
        TrieNode pCrawl = root;
        int len = ip.length();
        int level = 0;
        for(level = 0; level < len; level++){
            int index = getIndexFromChar(ip.charAt(level));
            if(pCrawl.child[index] == null)
                pCrawl.child[index] = new TrieNode();
            pCrawl = pCrawl.child[index];
        }
        if(pCrawl != null && pCrawl.isLeaf)
            return pCrawl.url;
        return null;
    }
    public static void main(String[] args){
        String[] ipAddrs = {"10.57.11.127","121.57.61.129","66.125.100.103"};
        String[] urls = {"www.samsung.com","www.samsung.net","www.google.com"};
        int n = ipAddrs.length;
        SearchDNS cache = new SearchDNS();
        for(int i = 0; i< n; i++)
            cache.insert(ipAddrs[i],urls[i]);
        String ip = "121.57.61.129";
        String url = cache.searchDNSCache(ip);

        System.out.println(url);
    }
}
