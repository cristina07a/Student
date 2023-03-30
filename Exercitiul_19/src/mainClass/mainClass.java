package mainClass;

import java.io.Console;
import java.util.Scanner;
import java.util.Vector;
import java.lang.Float;
import Student.*;

public class mainClass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Numar studenti:");
		int n = in.nextInt();
		Vector<Student> S = new Vector<Student>(n);
		for (int i = 0; i < n; i++) {
			String m = in.nextLine();
			System.out.println("Nume: ");
			String name = in.nextLine();
			System.out.println("Nota: ");
			float grade = in.nextFloat();
			S.add(new Student(name, grade));
		}
		S.sort((a, b) -> {
			return Float.compare(a.GetGrade(), b.GetGrade());
		});
		System.out.println("Studentii sortati dupa nota(crescator): ");
		for (int i = 0; i < n; i++) {
			System.out.println(S.get(i).GetName());
		}

	}
}
