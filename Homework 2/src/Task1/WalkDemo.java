package Task1;
//Описание занятия: - Создайте две переменные isWeekend и isRain.
// Создайте переменную canWalk, значение которой должно быть истинным,
// если это выходной день (isWeekend=true) и не идет дождь (isRain=false).

public class WalkDemo {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isRain = true;
        boolean canWalk;
        if (isWeekend && !isRain) {
            canWalk = true;
            System.out.println("Let's go for a walk!");
        } else {
            canWalk = false;
            System.out.println("Let's stay home and continue studding!");
        }
    }
}




