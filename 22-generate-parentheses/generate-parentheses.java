class Solution {
    List<String> resultList = new ArrayList<>();
    List<String> subList = new ArrayList<>();
    int limit;
    public List<String> generateParenthesis(int n) {
       // if (n==1) return new ArrayList<>("()"); 
        limit=n;
        generateParenthesis(0,0);
        return resultList;
    }
    public void generateParenthesis(int openN, int closeN) {
        if (openN == limit && closeN==limit) {
            resultList.add(String.join("", subList));
            return;
        }
        if (openN<limit) {
            subList.add("(");
            generateParenthesis(openN+1, closeN);
            subList.remove(subList.size() - 1);
        }
        if (closeN < openN) {
            subList.add(")");
            generateParenthesis(openN, closeN+1);
            subList.remove(subList.size() - 1);
        }
        
    }
}