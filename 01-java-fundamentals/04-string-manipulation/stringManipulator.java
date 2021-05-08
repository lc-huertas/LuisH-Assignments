public class stringManipulator {    
    public String trimAndConcat(String textA,String textB){
        String textC = textA.trim() + textB.trim();
        return textC;
    }
    public Integer getIndexOrNull(String message, char letter){
        int result_C = message.indexOf(letter);
        if(result_C == -1){
            return null;
        } else {
            return result_C;
        }
    }
    public Integer getIndexOrNull(String mainMsg, String smllMsg){
        int result_C=mainMsg.indexOf(smllMsg);
        if(result_C==-1){
            return null;
        } else {
            return result_C;
        }
    }
    public String concatSubstring(String textA, int start, int finish, String textB){
        String x = textA.substring(start,finish) + textB;
        return x;
    }

}
