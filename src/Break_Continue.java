public class Break_Continue {
    public static void main(String[] args) {

        //break = Loop ko todna
        int i =0;
        while (i < 1000){
            System.out.println(i);
            if (i == 400){
                break;
            }
            i++;
        }

        System.out.println("HEllo");

        //countinue = moves to next iteration (updation ho raha ho i.e i++)
        int i2 = 1;
        while(i2 <=10){
            if (i2 == 5){
                i2++;
                continue;
            }
            System.out.println(i2);
            i2++;
        }






    }



}
