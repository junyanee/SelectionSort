import java.util.Scanner;

// Selection Sort (��������)

public class Main {

	public static void main(String[] args) {
		
		int i, j, min, index=0, temp, num;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("�����ϰ��� �ϴ� �迭�� ���� �Է��ϼ���: ");
		num = sc.nextInt();
		
		int arr[] = new int[num];
		
		System.out.println("�迭�� ���� ���� �Է��ϼ���: ");
		for (int a = 0; a < num; a++) {
			arr[a] = sc.nextInt();
		}
		
		for (i = 0; i < num; i++) {
			// �ּҰ��� �Է¹��� ������ �� ũ�� ����
			min = num+1;
			for (j = i; j < num; j++) {
				if (min > arr[j]) {
					// �ּҰ� ����, �ּҰ��� �ִ� �ε��� ����
					min = arr[j];
					index = j;
				}
			}
			// ���� �� �ε����� �ּҰ��� �ִ� �ε��� ����
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		for (int k = 0; k < num; k++) {
			System.out.println(arr[k]);
		}
		
	}

}
