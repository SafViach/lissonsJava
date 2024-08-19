package lesson004.lesson03exm1;
public class Main1 {
    public static void main(String[] args) {
        //Массив - совокупность элементов одного типа
        //Массив в Java считается объектом
        //Массив в Java является ссылочной величиной, создается только динамически
        //и хранится в heap

        //тип[] имя - общий вид создания ссылки на массив
        int[] arr1 = null;//int* arr1
        //здесь массив еще не создан. Создана ссылка по которой в дальнейм
        //будет храниться массив
        //null - обозначени того, что ссылка пока ни на что не указаывает

        arr1 = new int[5];//new - операция динамиченского выделения памяти (создание объекта)
        //при создании числовых массивов, все значения их элементов по умолчанию заполняются нулями

        //воторой способ создания массива, однако он считается устаревшим
        int arr2[] = new int[5];
        //третий списоб создания массива
        int[] arr3 = new int[]{4, 7, 9};//будет создани масисв на три элемента и все его элементы примут указанные
        // значения

        //int[] arr4 = new int[3]{4, 7, 9}; ошибка!!!

        //четвертый упрощенный способ создания массива без new
        int[] arr5 = {4, 7, 8, 80};

        int[] arr6 = arr5;//здесь новый массив не создается, создается ссылка и она получает адрес на уже
        //созданный массив(arr5 и arr6 две ссылка на один и тот же массив)
        System.out.println(arr5 == arr6);//(true)резултат операции сравнения - значение типа boolean (true, false)
        //при при сравнении ссылок через == сравниваются хранящиеся в них адреса
        System.out.println(arr1 == arr2);//false ссылки на разные массивы

        arr1 = arr5;//ссылка arr1 забывает адрес массива на который она ссылась, массив стаый остался в heap
        //и ждет пока его удалит из память gc

        //обращение к одному конкретному элементу
        //имя_массива[индекс_элемента]
        arr5[0] = 100;//первый элемент массива, на который ссылается ссылка arr5 получит значение 100
        System.out.println(arr1[0]);
        //System.out.println(arr1[4]); выход за пределы массива
    }
}
