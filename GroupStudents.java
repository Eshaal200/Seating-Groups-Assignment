
public class GroupStudents{

    public static void InsertionSort(int[] arr){
        for(int i = 1; i < arr.length;i++){
            int current = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > current){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;

        }
    }


        public static void groupStudents(int[] arr){

            InsertionSort(arr);
            int totalDifference = 0;

            System.out.println("Groups: ");


            for(int i = 0; i < arr.length; i += 2){
                int a = arr[i];
                int b = arr[i + 1];

                int diff = Math.abs( a - b);

                totalDifference += diff;

                System.out.println("(" + a + " , " + b + ") difference = " + diff);
                
            }
            
            System.out.println("Total difference: " + totalDifference);
        }

            public static void main(String [] args){
                int[] students = {6, 3, 5, 2, 1, 8};

                groupStudents(students);


            }

        



    }









    





