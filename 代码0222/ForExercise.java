class ForExercise {
	// System.out.println();	// 输出括号中的内容，并换行
	// System.out.print();		// 输出括号中的内容，不换行
	public static void main(String[] args) {
		// 1. ***********
		// for (int i = 0; i < 10; i++) {
		// 	System.out.print("*");
		// }

		// 2. 五行五列的矩形
		// for (int line = 1; line <= 5; line++) {
		// 	for (int colum = 1; colum <= 5; colum++) {
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }

		// 3. 
		/*
			*		1	1
			**		2	2
			***		3	3
			****	4	4
			*****	5	5
		*/
		// for (int line = 1; line <= 5; line++) {
		// 	for (int colum = 1; colum <= line; colum++) {
		// 		System.out.print("*");
		// 	}	
		// 	System.out.println();
		// }

		// 4. 九九乘法表
		// for (int line = 1; line <= 9; line++) {
		// 	for (int colum = 1; colum <= line; colum++) {
		// 		System.out.print(colum + "x" + line + "=" + colum*line + "  ");
		// 	}
		// 	System.out.println();
		// }

		// 5. 
		/*
			*****		1 + 5
			****		2 + 4
			***			3 + 3
			**			4 + 2
			*			5 + 1
		*/
		// for (int line = 1; line <= 5; line++) {
		// 	for (int colum = 1; line + colum <= 6; colum++) {
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }

		// 6. 
		/*
			     *		1 4
				**		2 3
			   ***		3 2
			  ****		4 1
			 *****		5 0
		*/
		for (int line = 1; line <= 5; line++) {
			for (int colum = 1; colum <= 5; colum++) {
				if (line + colum <= 5) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		// 7.
		/*
			*****
			******
			*******
			********
			*********

			    *
			   ***
			  *****
			 *******
			*********

				*****
			   *****
			  *****
			 *****
			*****


			    EFGHI
			   DEFGH
			  CDEFG
			 BCDEF
			ABCDF

			*****
			 *****
			  *****
			   *****
			    *****

			*********
			 *******
			  *****
			   ***
			    *


				*
			   ***
			  *****
			 *******
			*********
			 *******
			  *****
			   ***
			    *

			
			*********
			**** ****
			***   ***
			**     **
			*       *
			**     **
			***   ***
			**** ****
			*********


			    *
			   * *
			  *   *
			 *     *
			*       *
			 *     *
			  *   *
			   * *
			    *


		// 究极
		杨辉三角
							1
						  1   1
						1   2   1
					  1   3   3   1
					1   4   6   4   1
				  1   5   10  10  5   1
				  ...


				  1
				  1 1
				  1 2 1
				  1 3 3 1
				  1 4 6 4 1

		*/
	}
}