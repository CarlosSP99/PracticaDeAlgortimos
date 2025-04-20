package org.example.d7_04_25;

public class FlowerArray {
    public static void main(String[] args) {
        int[] flowers = new int[]{1,0,1,1,0,0,0,1};

        int previuousPlace=0;
        int placesAvaible=0;
        boolean condition=true;

        for (int i = 0; i < flowers.length; i++) {
            if (i!=0){
                previuousPlace = flowers[i-1];
                if (previuousPlace==flowers[i] && previuousPlace==1){
                    condition=false;
                    placesAvaible--;
                }
                placesAvaible++;
            }
        }
        System.out.println("Lugares avaible:"+placesAvaible);
    }
}
// int[] flowers = new int[]{1,0,1,1,0,0,0,1};
//        int flowerPreviuosPosition=0;
//        boolean condition=true;
//
//        for (int i = 0; i < flowers.length; i++) {
//           if (i!=0){
//               flowerPreviuosPosition=flowers[i-1];
//           }
//           if (flowers[i]==flowerPreviuosPosition && flowerPreviuosPosition==1){
//               condition=false;
//           }
//        }
//
//        if (condition){
//             System.out.println("Se puede plantar sin problemas");
//        } else {
//            System.out.println("hay porblemas");
//        }