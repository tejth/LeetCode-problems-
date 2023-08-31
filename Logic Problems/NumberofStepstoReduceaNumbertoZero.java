public class NumberofStepstoReduceaNumbertoZero {
    public static int stepCalc(int num){
        int step = 0;
        while(num!=0){
            if(num%2==0){
                num = num/2;
                step++;
            }
            else{
                num-=1;
                step++;
            }
        }
        return step;
    }
    public static void main(String[] args) {
       System.out.println(stepCalc(14));
    }
    
}
