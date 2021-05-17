public class Clean_Code{
    static class Parent {
        private int min;
        private int max;
        public int getMin(){
            return min;
        }
        public void setMin(int value){
            this.min = value;
        }
        public int getMax(){
            return max;
        }
        public void setMax(int value){
            this.max = value;
        }
    }

    static Parent Total_Number(int arr[], int length) {
        Parent object = new Parent();
        int i;

        if (length == 1) {
            object.setMax(arr[0]);
            object.setMin(arr[0]);
            return object;
        }

        if (arr[0] > arr[1]) {
            object.setMax(arr[0]);
            object.setMin(arr[1]);
        }
        else {
            object.setMax(arr[1]);
            object.setMin(arr[0]);
        }

        for (i = 2; i < length; i++) {
            if (arr[i] > object.getMax()) {
            object.setMax(arr[i]);
            }
            else if (arr[i] < object.getMin()) {
            object.setMin(arr[i]);
            }
        }

    return object;
    }

    public static void main(String args[]) {
        int total_distance[] = {1000, 11, 445, 1, 330, 3000};
        int length = 6;/*Total Length of above array*/
        Parent Object = Total_Number(total_distance, length);
        /*Print Minimum Distance*/
        System.out.printf("\n Smallest Value is %d", Object.getMin());
        /*Print Maximum Distance*/
        System.out.printf("\n Largest Value is %d", Object.getMax());
    }
}