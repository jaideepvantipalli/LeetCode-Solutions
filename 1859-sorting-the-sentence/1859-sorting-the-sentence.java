class Solution {
    public String sortSentence(String str) {
        StringBuilder sb=new StringBuilder();
        String temp[]=str.split("\\s+");
        String a[]=new String[temp.length];
        
        int i=0;
        for(String ele:temp){
            i=(int)(ele.charAt(ele.length()-1)-'0');
            a[i-1]=ele.substring(0,ele.length()-1);
        }
        for(i=0;i<a.length-1;i++){
            sb.append(a[i]).append(" ");
        }
        sb.append(a[i]);
        return sb.toString();

    }
}