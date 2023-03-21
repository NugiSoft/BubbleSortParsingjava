import java.util.Arrays;
import java.util.Random;
class bubble {
    static void bubble(int array[]){
        int ukuran = array.length;
        for (int x=0;x<ukuran-1; x++)
            for (int y=0 ;y<ukuran-x-1;y++)
                if (array[y]>array[y+1]){
                    int simpan = array[y];
                    array[y]=array[y+1];
                    array[y+1]=simpan;
                }
                /*else{
                    if (array[y]<array[y+1]){
                        int simpan = array[y];
                        array[y]=array[y+1];
                        array[y+1]=simpan;
                    }
                }*/
    }

    public static void main(String[] args) {
        Random no = new Random();
        int[] NoArray = new int[20];
        //int [] simpanan=new int[args.length];
        for (int p = 0; p < NoArray.length; p++) {
            NoArray[p] = no.nextInt(0 + 10) + 1;
        }
            bubble.bubble(NoArray);

            System.out.println("sudah urut");
            System.out.println(Arrays.toString(NoArray));


    }
}
