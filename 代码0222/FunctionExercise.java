class FunctionExercise {
	public static void main(String[] args) {
		// �ж�һ�������ǲ�������
		for (int i = 2; i <= 100; i++) {
			if (check(i)) { 
				System.out.println(i);
			}
		}
	}

	public static boolean check(int num) {
		for(int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}

		return true;
	}
}
