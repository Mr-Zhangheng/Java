class LoopKeywordsProgram 
{
	public static void main(String[] args) 
	{
		// ѭ���еĹؼ��֣�contninue, break

		// break: ����ѭ���У���ʾ��������ѭ����(����ѭ�������Ƿ����)
		// for (int meter = 1; meter <= 100; meter++) {
		// 	System.out.println("С���ڲٳ����ܲ�������" + meter + "��");
		// 
		// 	if (meter == 50) {
		// 		System.out.println("С���ܵ���50�ף������ˣ����ܼ�������");
		// 		break;
		// 	}
		// }

		// continue: ����ѭ���У���ʾ����ֹͣ����ѭ������ʼ��һ�ε�ѭ��
		// for (int meter = 1; meter <= 100; meter++) {
		// 
		// 	if (meter == 50) {
		// 		System.out.println("С�����ֵ����и��ӣ�����ȥ");
		// 		continue;
		// 	}
		// 
		// 	System.out.println("С���ڲٳ����ܲ�������" + meter + "��");
		// }


		// ��չ ��һ������£�breakֻ�������ڵ�ǰ��ѭ����
		// �������ǿ�����ϱ�ǩ��ʹ�ã�ʹ������ָ����ѭ��
		FLAG_OUTTER:
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("i = " + i + ", j = " + j);

				if (j == 2) {
					continue FLAG_OUTTER;
				}
			}
		}
	}
}
