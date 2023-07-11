/**
 * program
 */
// or //
// public class program {   
//     public static void main(String[] args) {
//         System.out.println("Goodbye world");
//     }
// }

/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         String s = null; // нужно положить значение s = 
//         System.out.println(s);
//     }
// }
// null

//  Типы данных
/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         short age = 10;
//         int salary = 123456;
//         System.out.println(age);   //10
//         System.out.println(salary); // 123456
//     }
// }

// public class program {

//     public static void main(String[] args) {
//         float e = 2.7f;
//         double pi = 3.1415;
//         System.out.println(e);   // 2.7
//         System.out.println(pi); // 3.1415
//     }
// }

// public class program {

//     public static void main(String[] args) {
//         char ch = '1';        
//         System.out.println(ch);   // 1
//         ch = 'a';
//         System.out.println(ch); // a
//     }
// }

// public class program {

//     public static void main(String[] args) {
//         int a = 13;
//         double d = a;
//         // a = d; нельзя, нужны преобразования
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         boolean flag1 = 123 <= 234;
//         System.out.println(flag1); // true
//         boolean flag2 = 123 >= 234 || flag1;
//         System.out.println(flag2); // true
//         boolean flag3 = flag1 ^ flag2;   // true если только одно true
//         System.out.println(flag3); // false
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         boolean f = true && false;  // || или
//         System.out.println(f); // false
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         String msg = "Hello world";
//         System.out.println(msg);  // Hello world
//     }
// }

    // Неявная типизация
/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         var i = 123;
//         System.out.println(i); // 123
//         var d = 123.456;
//         System.out.println(d); // 123.456
//         System.out.println(getType(i)); // Integer
//         System.out.println(getType(d)); // Double
//         d = 1022;
//         System.out.println(d);
//         //d = "mistake";
//         //error: incompatible types:
//         //String cannot be converted to double
//     }
//     static String getType(Object o) {
//         return o.getClass().getSimpleName();
//     }
// }

    // Классы-обертки
/**
 * Integer, Double, Float, Boolean и др.
 */
// public class program {

//     public static void main(String[] args) {
//         int i = 123;  // 23_456_741 - можно разделить разряды
//         System.out.println(Integer.MAX_VALUE); // 2147483647
//         System.out.println(Integer.MIN_VALUE); // -2147483648
//     }
// }

// public class program {

//     public static void main(String[] args) {
//         String s = "qwer";
//         s.charAt(2);
//         System.out.println(s.charAt(2));  // e
//     }
// }

    // Операции Java
// public class program {

//     public static void main(String[] args) {
//         int a = 123;
//         System.out.println(a++);  // 123 (a++) не первый приоритет
//         // но // (++a) первый приоритет = 124
//         System.out.println(a);  // 124

//     }
// }

// public class program {

//     public static void main(String[] args) {
//         int a = 5;
//         int b = 2;
//         System.out.println(a | b); // 7  // (a & b) - 0
//         // 101
//         // 010
//         // 111
//     }
// }

// public class program {

//     public static void main(String[] args) {
//         String s = "qwwe1";
//         boolean b = s.length() >= 5 && s.charAt(4) == '1';
//         boolean b = s.length() >= 5 & s.charAt(4) == '1';       
//         System.out.println(b); 
        
//     }
// }

    // Массивы
// одномерные
/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         int[] arr = new int[10];
//         System.out.println(arr); // [I@28a418fc
//         System.out.println(arr.length); // 10
//         arr[3] = 13;

//          arr = new int[] {1, 2, 3, 4 ,5};
//          System.out.println(arr.length); // 5
//     }
// }

// многомерные
/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         int[] arr[] = new int[3][5];
//         for (int[] line : arr) {
//             for (int item : line) {
//                 System.out.printf("%d", item);
//             }
//             System.out.println();
//         }
//     }
// }
// // 00000
// // 00000
// // 00000

// public class program {
//     public static void main(String[] args) {
        
//         int[][] arr = new int[3][5];

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.printf("%d ", arr[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }
// // 0 0 0 0 0
// // 0 0 0 0 0
// // 0 0 0 0 0


    // Преобразования

/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         int i = 123; double d = i;
//         System.out.println(i); // 123
//         System.out.println(d); // 123.0
//         d = 3.1415; i = (int)d;
//         System.out.println(d); // 3.1415
//         System.out.println(i); // 3
//         d = 3.9415; i = (int)d;
//         System.out.println(d); // 3.9415
//         System.out.println(i); // 3
//         byte b = Byte.parseByte("123");
//         System.out.println(b); // 123
//         b = Byte.parseByte("1234");
//         System.out.println(b); // NumberFormatException: Value out of range
//     }
// }

/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         int[] a = new int[10];
//         double[] d = a;
//     }
// }

    // Получение данных из терминала
// Строки
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!\n", name);
//         iScanner.close();
//     }
// }
// // name: Len
// // Привет, Len!

//Некоторые примитивы
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
//     }
// }
// int a: 1
// double a: 2
// 1 + 2,000000 = 3,000000


// Проверка на соответствие получаемого типа
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         boolean flag = iScanner.hasNextInt();
//         System.out.println(flag);
//         int i = iScanner.nextInt();
//         System.out.println(i);
//         iScanner.close();
//     } 
// }
// // int a: 1
// // true
// // 1

    // Форматированный вывод
/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = a + " + " + b + " = " + c;
//         System.out.println(res);
//     }
// }
// // 1 + 2 = 3

// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = String.format("%d + %d = %d \n", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c);
//         System.out.println(res);
//     }
// }
// // 1 + 2 = 3
// // 1 + 2 = 3

    // Виды спецификаторов
// %d: целочисленных значений
// %x: для вывода шестнадцатеричных чисел
// %f: для вывода чисел с плавающей точкой
// %e: для вывода чисел в экспоненциальной форме,
// например, 3.1415e+01
// %c: для вывода одиночного символа
// %s: для вывода строковых значений

// public class program {
//     public static void main(String[] args) {

//         float pi = 3.1415f;
//         System.out.printf("%f\n", pi); // 3,141500
//         System.out.printf("%.2f\n", pi); // 3,14
//         System.out.printf("%.3f\n", pi); // 3,141
//         System.out.printf("%e\n", pi); // 3,141500e+00
//         System.out.printf("%.2e\n", pi); // 3,14e+00
//         System.out.printf("%.3e\n", pi); // 3,141e+00
//     }
// }

    // Область видимости переменных
// У переменных существует понятие «область видимости».
// Если переменную объявили внутри некоторого блока фигурных 
// скобок { },
// то снаружи этого блока переменная будет недоступна.

// public class program {
//     public static void main(String[] args) {
//         {
//             int i = 123;
//             System.out.println(i);
//         }
//         System.out.println(i); // error: cannot find symbol
//     }
// }

    // Функции и методы
// Функции и методы — это технически одно и то же. Функции могут
// не принадлежать классам, а методы принадлежат.
// В java все функции являются методами.

// public class program {
//     static void sayHi() {
//         System.out.println("hi!");
//     }
//     static int sum(int a, int b) {
//         return a+b;
//     }
//     static double factor(int n) {
//         if(n==1)return 1;
//         return n * factor(n-1);
//     }
//     public static void main(String[] args) {
//         sayHi(); // hi!
//         System.out.println(sum(1, 3)); // 4
//         System.out.println(factor(5)); // 120.0
//     }
// }

    // Управляющие конструкции:
// условный оператор
// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//              c = a;
//         } else {
//              c = b;
//         }
//         System.out.println(c); // 2
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c = 0;
//         if (a > b) c = a;
//         if (b > a) c = b;
//         System.out.println(c); // 2
//     }
// }

// тернарный оператор
// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b;
//         System.out.println(min); // 1
//     }
// }

    // Оператор выбора
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         int mounth = value;
//         String text = "";
//         switch (mounth) {
//             case 1:
//                 text = "Autumn";
//                 break;
//             ...
//             default:
//                 text = "mistake";
//                 break;
//         }
//         System.out.println(text);
//         iScanner.close();
//     }
// }

        //Цикл while
// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         while (value != 0) {
//             value /= 10;
//             count++;
//         }
//         System.out.println(count); // 3
//     }
// }

        // Цикл do while
// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;
//         do {
//             value /= 10;
//             count++;
//         } while (value != 0);
//         System.out.println(count); // 3
//     }
// }

    // continue, break
// Операторы для управления циклами — continue и break.
// Выполнение следующей итерации цикла — continue.
// Прерывание текущей итерации цикла — break.
// * ближайшего к оператору

        // Оператор цикла for
// public class program {
//     public static void main(String[] args) {
//         int s = 0;
//         for (int i = 1; i <= 10; i++) {
//             s += i;
//         }
//         System.out.println(s); // 55
//     }
// }

    // Вложенные циклы
// public class program {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         // * * * * *
//         // * * * * *
//         // * * * * *
//         // * * * * *
//         // * * * * *
//     }
// }


    // for :
//Работает только для коллекций
// public class program {
//     public static void main(String[] args) {
//         int arr[] = new int[10];
//         for (int item : arr) {
//             System.out.printf("%d ", item);
//         }
//         System.out.println(); // 0 0 0 0 0 0 0 0 0 0
//     }
// }

    // Работа с файлами
//Создание и запись\ дозапись
// import java.io.FileWriter;
// import java.io.IOException;
// public class program {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     } 
// }
// // запись в файл file.txt


    // Работа с файлами
// Чтение, Вариант посимвольно
// import java.io.*;
// public class program {
//     public static void main(String[] args) throws Exception {
//         FileReader fr = new FileReader("file.txt");
//         int c;
//         while ((c = fr.read()) != -1) {
//             char ch = (char) c;
//             if (ch == '\n') {
//                 System.out.print(ch);
//             } else {
//                 System.out.print(ch);
//             }
//         }
//     } 
// }
// // line 1
// // 2
// // line 3


    // Работа с файлами
// Вариант построчно
// import java.io.*;
// public class program {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//         String str;
//         while ((str = br.readLine()) != null) {
//             System.out.printf("== %s ==\n", str);
//         }
//         br.close();
//     }
// }
// // == line 1 ==
// // == 2 ==
// // == line 3 ==