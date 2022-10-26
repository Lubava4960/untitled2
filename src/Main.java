public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием! ");
        } else {
            System.out.println("Извините, возраст совершеннолетия еще не наступил. Вам придётся  немного подождать. ");
        }
        int ageCh = 7;
        if (ageCh >= 7) {
            System.out.println("ребёнок ходит в школу ");
        } else {
            System.out.println("Ребёнок ходить в школу не может");
        }

        System.out.println("Человек может отправляться в университет");

        if (age >= 18) {
        } else {
            System.out.println("Человек ходить в университет не может");
        }
        int ageM = 24;
        if (ageM >= 24) {
            System.out.println("Человек окончил университет и ему пора искать работу ");
        } else {
            System.out.println("человеку ещё рано искать работу");
        }

        int v = 102;
        if (v <= 102) {
            System.out.println("есть сободные места ");
        } else {
            System.out.println(" свободных мест нет ");
        }
        int s = 60;
        if (s <= 60) {
            System.out.println("есть свободные сидячие места");
        } else {
            System.out.println(" свободных сидячих мест нет");
        }

        if (s >= 60 && s < 102) {
            System.out.println("есть свободные места, но сидячих мест нет ");
        }
        int ageB = 2;
        if (ageB >= 2 && ageB < 6) {
            System.out.println("если возраст человека от 2 до 6 лет, то ему нужно ходить в детский сад. ");
        } else {
            System.out.println("человек не может ходить в детский сад ");
        }
int ageH = 7;
        if (ageH >= 7 && ageH < 18) {
            System.out.println("если возраст человека от 7 до 18 лет, то человек может ходить в школу ");
        } else {
            System.out.println(" Человек не может ходить в школу");
        }
        int ageS=18;
        if (ageS>=18 && ageS <24){
            System.out.println("если человеку от 18 до 24 лет , то он  должен учиться в университете ");
        } else {
            System.out.println("человек не может ходить в университет ");
        }
        int ageMen=24;
        if (ageMen>=24){
            System.out.println("если человеку больше 24, то он может работать до победного конца ");
        }
        int ageBayby=5;
        if (ageBayby>=5){
            System.out.println("ребёнок  может кататься на каруселях");
        }else {
            System.out.println("ребёнок не может кататься не каруселях ");
        }
        int ageCha=5;
        if ( ageCha >=5 &&  ageCha < 14) {
            System.out.println("ребёнок может кататься только в сопровождении взрослого ");
        }else {
            System.out.println("ребенок кататься не может если нет взрослого ");
        }
        int ageT=14;
        if (ageT>=14){
            System.out.println("ребенок может кататься без сопровождения взрослого ");
        }
        int one=1;
        int two=2;
        int free=3;
        if (one<=1 && one <3 && one<2){
            System.out.println("самое меньшее число ");
        }else {
            System.out.println("решение не верно ");
        }
        if (two<=2 && two>1 && two<3 ){
            System.out.println( "среднее число " );}
            else {
                System.out.println("решение не верно" );
            }
            if (free>=3 && free >2 && free>1){
                System.out.println("самое большое число");
        }else {
                System.out.println( "решение не верно");
        }

        

    }
}