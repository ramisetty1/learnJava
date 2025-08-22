public class NumbersOne {
    public static void main(String[] args){

        int count =0;

        count = count + 1;
        System.out.println(count); //1

        count = count + 2;
        System.out.println(count); //3

        count = count + 1;
        System.out.println(count); //4

        count +=1;
        System.out.println(count); //5

        count++;
        System.out.println(count); //6

        count = 1 + count++;       //post increment
        System.out.println(count); //7
        System.out.println(1 + ++count); // pre increment


        int num = 10;

        num = num - 1;
        System.out.println(num);
        num -= 1;
        System.out.println(num);
        num--;
        System.out.println(num);



    }
    
}
