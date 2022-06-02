public class Main {
    public static void main(String[] args) {
        // Задание 1

        int[] age = new int[3];
        age[0]= 1;
        age[1]= 2;
        age[2]=3;

        float[] weights = {1.57f, 7.654f, 9.986f};

        int [] arr = {4,5,6};

        //Задача 2

        for (int i =0;i<age.length;i++) {

            if(i !=age.length-1) {
                System.out.print(age[i] + ", ");
            }
            else {System.out.print(age[i]);}


        }
        System.out.println();
        for (int c =0;c<weights.length;c++){
            if(c !=weights.length-1){
                System.out.print(weights[c] + ", ");}
            else
            {System.out.print(weights[c]);}}
            System.out.println();

            for (int a =0;a<arr.length;a++){
                if(a !=arr.length-1){
                    System.out.print(arr[a] + ", ");}
                else
                {System.out.print(arr[a]);}

        }
        // Задача 3
        System.out.println();
        for (int i =age.length-1;i>=0;i--) {

            if(i !=0) {
                System.out.print(age[i] + ", ");
            }
            else {System.out.print(age[i]);}


        }
        System.out.println();
        for (int c =weights.length-1;c>=0;c--){
            if(c!=0){
                System.out.print(weights[c] + ", ");}
            else
            {System.out.print(weights[0]);}}
        System.out.println();

        for (int a =arr.length-1;a>=0;a--){
            if(a!=0){
                System.out.print(arr[a] + ", ");}

            else
            {System.out.print(arr[a]);}
 // Задача 4
            System.out.println();
            for (a=0;a< arr.length;a++);{
                if (arr[a]%2==1){
                    arr[a]+=1;
                }
                if(a !=arr.length-1)
                    System.out.print(arr[a]+",");
                else
                    System.out.print(arr[a]);
            }

    }
}}