class SwitchProgram 
{
	public static void main(String[] args) 
	{
		/*
		int a = 1;
		switch (a) {
			case 1:
				System.out.println("1");
				break;
			case 10: 
				System.out.println(10);
				break;
			case 100:
				System.out.println(100);
				break;
				
			default:
				System.out.println("û��ƥ��");
				break;
		}
		*/

		// ���󣺼���2019��11��20���ǽ���ĵڼ���
		// 2019����ƽ�껹������

		int year = 2000, month = 12, day = 31, days = 0;

		// ����ƽ�껹������
		// ���һ����ݿ��Ա�4�������Ҳ����Ա�100���������߿��Ա�400������
		boolean ret = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;


		// 2     1
		// 3	 1  2
		// 4	 1  2  3
		switch (month) {
			case 12:
				days += 30;
			case 11:
				days += 31;
			case 10:
				days += 30;
			case 9:
				days += 31;
			case 8:
				days += 31;
			case 7:
				days += 30;
			case 6:
				days += 31;
			case 5:
				days += 30;
			case 4:
				days += 31;
			case 3:
				days += ret ? 29 : 28;
			case 2:
				days += 31;
			case 1:
				days += day;
		}
		System.out.println(days);
	}
}
