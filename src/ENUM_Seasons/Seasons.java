package ENUM_Seasons;

//  а) Создать перечисление, содержащее названия времен года.
//  б) Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
//  в) Создать метод, который принимает на вход переменную созданного вами enum типа. Если значение равно Лето,
//     выводим на консоль “Я люблю лето” и так далее Используем оператор switch.
//  г) Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
//  д) Добавить конструктор принимающий на вход среднюю температуру.
//  е) Создать метод getDescription, возвращающий строку “Холодное время года”.
//     Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
//  ж) В цикле распечатать все времена года, среднюю температуру и описание времени года.

public enum Seasons {
    WINTER(-15), SPRING(5) {
        @Override
        public String getDescription () {
            return "теплое время года";
        }
    }, SUMMER(20) {
        @Override
        public String getDescription () {
            return "теплое время года";
        }
    }, AUTUMN(2);

    private final int temperature;

    Seasons (int temperature) {
        this.temperature = temperature;
    }


    public String getDescription () {
        return "холодное время года";
    }

    public static void information(Seasons myFavSeason){
        System.out.println("Мое любимое время года: " +  myFavSeason);
        System.out.println("Средняя температура: " + myFavSeason.getTemperature());
        System.out.println("Какое это время года: " + myFavSeason.getDescription());
    }

    public static void allSeasons(){
        for (Seasons season: Seasons.values()) {
            System.out.println(season + " " + season.getTemperature() + " " + season.getDescription());
        }
    }

    public static void iLove(Seasons season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            default:
                System.out.println("Неверный ввод");
        }
    }

    public int getTemperature() {
        return temperature;
    }
}
