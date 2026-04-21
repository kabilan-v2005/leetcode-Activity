class Solution {
    public String convert(String s, int numRows) {

        // 1.Creating a array in StringBuilder for n number of rows. 
        // 2.Declear two variables curr_row(for moving rows form start to end) and isgoing(for moving alternative colum if curr_row reach end).
        // 3.if is going ture then curr_row + 1.if curr_row reach end then go backward curr_row - 1
        // 4.finaly inteate to rows add it new StringBuilder res
        // 5.convert StringBuilder into String.

        if(numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }
        int curr_row=0;
        boolean isgoing=true;
        for(char c:s.toCharArray()){
            rows[curr_row].append(c);

            if(curr_row==0){
                isgoing=true;
            }
            else if(curr_row==numRows-1){
                isgoing=false;
            }

            curr_row += isgoing ? 1 : -1;
        }

        StringBuilder res=new StringBuilder();
        for(StringBuilder row : rows){
            res.append(row);
        }

        return res.toString();
    }
}