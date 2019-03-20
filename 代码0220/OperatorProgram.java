class OperatorProgram 
{
	public static void main(String[] args) 
	{
		/*
		int a = 10, b = 20;
		System.out.println(a + b);	// 30
		System.out.println(a - b);	// -10
		System.out.println(a * b);	// 200
		System.out.println(a / b);	// 0.5
		// ������ǿת�����ͣ�
		// ֱ����ȥС����������е����֣�ֻ������������
		// % ģ���㣬��ģ������
		System.out.println(a % b);	// 10

		// ++  --
		// ++ : �������������ĳһ��������ֵ+1
		// -- : �Լ����������ĳһ��������ֵ-1
		a++;
		System.out.println(a);		// 11
		a--;
		System.out.println(a);		// 10



		// �����ڱ�����
		// ��ʹ�����������ֵ��Ȼ���ٶ������������+1����
		System.out.println(a++);	// 10
		System.out.println(a);		// 11
		// �����ڱ���ǰ��
		// �ȶ������������+1������Ȼ����ʹ�����������ֵ
		System.out.println(++a);	// 12
		System.out.println(a);		// 12


		int c = 10;
		System.out.println(c++);	// 10	11
		System.out.println(--c);	// 10	10
		System.out.println(++c);	// 11	11
		System.out.println(c--);	// 11	10
		System.out.println(c);		// 10
		*/

/*
		int a;
		System.out.println(a = 10);	// 10

		System.out.println(a += 10);	// a = a + 10
		System.out.println(a -= 10);	// a = a - 10
		System.out.println(a *= 10);	// a = a * 10
		System.out.println(a /= 10);	// a = a / 10
		System.out.println(a %= 10);	// a = a % 10
*/

/*
		int a = 10, b = 11;
		System.out.println(a > b);		// false
		System.out.println(a < b);		// true
		System.out.println(a >= b);		// false
		System.out.println(a <= b);		// true
		System.out.println(a == b);		// false
		System.out.println(a != b);		// true
*/
/*

		// & | !
		// ��(and)�����漴Ϊ�棬������һ��Ϊ�٣������Ϊ��
		// ��(or)�����ټ�Ϊ�٣�������һ��Ϊ�棬�����Ϊ��
		// ��(not)������ȼ٣��Ǽټ���
		System.out.println(true & false);	// false
		System.out.println(true | false);	// true
		System.out.println(!true);			// false

		// ^:
		// ���(xor): ������ͬΪfalse, ������ͬΪtrue
		System.out.println(true ^ true);	// false
		System.out.println(false ^ false);	// false
		System.out.println(true ^ false);	// true
		System.out.println(false ^ true);	// true

		// &&  ||
		// && : ��·��
		// || : ��·��
		

		// &&��&
		// ��ͬ�㣺����Ľ����һ����
		// ��ͬ�㣺
		// ����ڽ����߼������ʱ��ǰ��Ĳ����Ѿ����Ծ�������Ľ������ʱ��
		// ��·�������ڶ����ֽ�����������
		// ��ͨ�������ڶ�������Ȼ��������
		// System.out.println(false & ___);	// false

		int a = 10, b = 20;
		boolean result = a++ > b-- && a-- > b++;

		System.out.println(result);							// false
		System.out.println("a = " + a + ", b = " + b);		// a = 10, b = 20

*/
/*
		// λ�����
		// & | ^ ~
		// & : λ��
		// | : λ��
		// ^ : λ���
		// ~ : ��λȡ��, �ͷ��벻ͬ��ÿһλ��Ҫ��λȡ������������λ
		// λ������߼���
		// ������������������͵ı�����������룬��ÿһλ�����ֽ�������
		// 1: �൱����true, 0: �൱����false
		int a = 10, b = 20;
		// 0000 0000 0000 0000 0000 0000 0000 1010
		// 0000 0000 0000 0000 0000 0000 0001 0100
		// 0000 0000 0000 0000 0000 0000 0000 0000
		System.out.println(a & b);	// 0
		// 0000 0000 0000 0000 0000 0000 0001 1110
		System.out.println(a | b);	// 30
		// 0000 0000 0000 0000 0000 0000 0001 1110
		System.out.println(a ^ b);	// 30
		// 0000 0000 0000 0000 0000 0000 0000 1010
		// 1111 1111 1111 1111 1111 1111 1111 0101
		// 1000 0000 0000 0000 0000 0000 0000 1011
		System.out.println(~a);		// -11

		// ^ : 
		// �������һ�γ��򣬽�������������ֵ
		// 1. �����м����
		// 2. �������м����-��ͷ�
		// a = a + b;		// a = 30  b = 20
		// b = a - b;		// a = 30  b = 10
		// a = a - b;		// a = 20  b = 10
		// 3. �������м����-���
		// ���ɣ�һ�����ֺ�����һ������������Σ�һ����������ͬ
		// 100 ^ 78 ^ 100 = 78
		// -100 ^ 7 ^ 7 = -100
		// a = a ^ b;	// 10 ^ 20    20
		// b = a ^ b;	// 10 ^ 20    10 
		// a = a ^ b;	// 20	10
		
		// ��λ�����
		// << : ���������
		// ��һ�����֣�������룬��ÿһλ�����ƶ�ָ����λ��
		// 0000 1010
		// 0010 1000	32 + 8 = 40
		System.out.println(a << 2);
		// ������θ�Ч�ʵļ���3*8
		// 3 << 3
		System.out.println(-10 << 2); 

		// >> : ���������(�з�������)
		// ���λ������λ
		// 0000 0010
		System.out.println(9 >> 2);	// 2	
		// 1111 0111
		System.out.println(-9 >> 2); // -3

		// >>> : ���������(�޷�������)
		// ���λ��0
		// 1000 0000 0000 0000 0000 0000 0000 1001
		// 1111 1111 1111 1111 1111 1111 1111 0111
		// 0011 1111 1111 1111 1111 1111 1111 1101
		System.out.println(-9 >>> 2); // -3
*/

		int a = 10, b = 20;
		// �������a��b�����ֵ
		int c = a > b ? a : b;
		System.out.println(c);
	}
}
