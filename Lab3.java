package Test2;

import java.util.*; //подключаем весь пакет java.util


public class Lab3 {
	
	public static void GoMas(ArrayList <Integer> mas) {
			for (int i = 0; i < mas.size(); i++){
				System.out.println(i+"-й"+" элемент: "+ mas.get(i));
			}
    }
	
	public static void CreatArr(ArrayList <Integer> mas, int n, int m) {
		Random random = new Random();//создаем объект-генератор случ. чисел
		for (int i = 0; i < n; i++){
			mas.add(random.nextInt(m));
		}
		GoMas(mas);
	}
	
	
	public static void main (String [] args){
		int Num_ex;
		Scanner Ex = new Scanner(System.in); 
		System.out.print("Введите номер задания: "); 
		Num_ex = Ex.nextInt();
		int n;
		ArrayList <Integer> mas = new ArrayList<>();
		Scanner in = new Scanner(System.in); 
		System.out.print("Введите размерность массива: "); 
		n = in.nextInt();
		switch(Num_ex) {
			case 1:
				CreatArr(mas, n, 6);
				System.out.println("Задание 1");
				for (int i = 0; i < mas.size(); i++){
					switch (mas.get(i)) {
						case 0:
							while (mas.get(i) == 0) {
								mas.remove(i);
								if (i == mas.size()) {
									break;
								}
								if (mas.get(i) == 5) {
									mas.add( i+1, 1);
									break;
								}
							}
							break;
						case 5:
							mas.add( i+1, 1);
							break;
					}
				}
				
				GoMas(mas);
				break;
				
			case 2:
				CreatArr(mas, n, 6);
				System.out.println("Задание 2");
				int t_2;
				Scanner a = new Scanner(System.in); 
				System.out.print("Введите элемент a: ");
				int min_2 = a.nextInt();
				Scanner b = new Scanner(System.in); 
				System.out.print("Введите элемент b: ");
				int max_2 = b.nextInt();
				
				if (min_2 > max_2) {
					t_2 = min_2;
					min_2 = max_2;
					max_2 = t_2;
				}
				
				for (int i = 0; i < mas.size(); i++){
					while(min_2 <= i && i < max_2 && mas.get(i) % 2 == 0) {
						mas.remove(i);
						if (i == mas.size()) {
							break;
						}
					}
				}
				
				GoMas(mas);
				break;
				
			case 3:
				CreatArr(mas, n, 6);
				System.out.println("Задание 3");
				int min_3, max_3, t_3;
				Scanner min = new Scanner(System.in); 
				System.out.print("Введите максимальный/минимальный элемент 1: ");
				min_3 = min.nextInt();
				Scanner max = new Scanner(System.in); 
				System.out.print("Введите максимальный/минимальный элемент 2: ");
				max_3 = max.nextInt();
				
				if (min_3 > max_3) {
					t_3 = min_3;
					min_3 = max_3;
					max_3 = t_3;
				}
				
				for (int i = 0; i < mas.size(); i++){
					while(min_3 <= mas.get(i) && mas.get(i) <= max_3) {
						mas.remove(i);
						if (i == mas.size()) {
							break;
						}
					}
				}
				GoMas(mas);
				break;
				
			case 4:
				CreatArr(mas, n, 6);
				System.out.println("Задание 4");
				for (int i = 0; i < mas.size()/2; i++){
					Collections.swap(mas,i ,mas.size() - i -1);
				}
				
				GoMas(mas);
				break;
				
			case 5:
				CreatArr(mas, n, 6);
				System.out.println("Задание 5");
				int num_of_even_nums = 0;
				for (int i = 0; i < mas.size(); i++){
					if(i % 2 == 0 && mas.get(i) % 2 == 0) {
						num_of_even_nums++;
						System.out.println( i +"-й"+" элемент: "+ mas.get(i));
					}
					
				}
				
				System.out.print("Количество четных элементов массива, стоящих на четных местах: " + num_of_even_nums);
				break;
				
			case 6:
				CreatArr(mas, n, 100000);
				System.out.println("Задание 6");
				//String str = String.valueOf(mas.get(0));
				//int count = str.length();
				int count;
				int final_num = mas.get(0) % 10;
				int temp;
				for (int i = 0; i < mas.size(); i++){
					temp = mas.get(i);
					count = 0;
					while(temp > 0) {
						if (temp % 10 == final_num) {
							count++;
						}
						if (count == 2) {
							System.out.println( i +"-й"+" элемент: "+ mas.get(i));
							break;
						}
						temp /= 10;
					}
				}
				break;
				
			case 7:
				CreatArr(mas, n, 100000);
				System.out.println("Задание 7");
				for (int i = 0; i < mas.size(); i++){
					if(mas.get(i) % 5 == 0 && mas.get(i) % 3 == 0) {
						System.out.println( i +"-й"+" элемент: "+ mas.get(i));
					}
					
				}
				break;
				
			case 8:
				CreatArr(mas, n, 100000);
				System.out.println("Задание 8");
				int enter;
				int count_enter = 0;
				Scanner E_Num = new Scanner(System.in); 
				System.out.print("Введите искомую цифру: "); 
				enter = E_Num.nextInt();
				int temp_num;
				for (int i = 0; i < mas.size(); i++){
					temp_num = mas.get(i);
					
					while(temp_num > 0) {
						if (temp_num % 10 == enter) {
							count_enter++;
						}
						temp_num /= 10;
					}
				}
				System.out.println("Введенная с клавиатуры цифра встречается в массиве " + count_enter + " раз(а)");
				break;
				
			case 9:
				CreatArr(mas, n, 10);
				System.out.println("Задание 9");
				//for (int i = 0; i < mas.size() - 1; i++){
				//	for (int j = 0; j < mas.size() - i - 1; j++){
				//		if(mas.get(j) > mas.get(j + 1)) {
				//			int t_8 = mas.get(j);
				//			mas.set(j, mas.get(j + 1));
				//			mas.set(j + 1, t_8);
				//		}
				//	}
				//}
				//GoMas(mas);
				Map <Integer, Integer> countMap = new HashMap<>();
				for (int i = 0; i < mas.size() - 1; i++){
					countMap.put(mas.get(i), countMap.getOrDefault(mas.get(i), 0) + 1);
				}
				System.out.println("Частота чисел: " + countMap);
				break;
				
			case 10:
				CreatArr(mas, n, 10);
				System.out.println("Задание 10");
				for (int i = 0; i < mas.size() - 1; i++){
					if (mas.get(i) >= i) {
						System.out.println(i +"-й"+" элемент: "+ mas.get(i));
					}
				}
				break;
			}

		}

}
