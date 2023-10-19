import java.sql.SQLOutput;

public class Arrays {
    public static void main(String[] args) {
        int number = 10;
        int[] numbers = new int[5];
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = i*10;
            System.out.println(numbers[i]);
        }
        System.out.println();
        int [][] twoDimArray = {{5,7,3,17,9}, {7,0,1,12}, {8,1,2,3}};//объявили массив и заполнили его элементами
        for (int a = 0; a < twoDimArray.length; a++) {  //идём по строкам
            for (int j = 0; j < twoDimArray[a].length; j++) {//идём по столбцам
                System.out.print(twoDimArray[a][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
    }
}
