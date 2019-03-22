# Java学习总结 ---2019.03.18
##  Java基础
### 进制
1. 进制介绍:  
	* 二进制：逢二进一，以0b开头，计算机只认识0和1  
	* 八进制：逢八进一，以0开头  
	* 十六进制：逢十五进一，以0X/0x开头，0到9，A到F,**是否区分大小写,为什么会采用这两种进制,请解释原因**  
2. 进制转换: 1111----8421  
	* 十进制与其他进制转换：
		* 十转二：辗转相除法--除二（要转成的进制）取余倒序（从下到上）相连--取余取倒数，小数点后面的小数取余后要从下到上相连
	其余进制转十进制;  
		* 八进制对应三位二进制；十六进制对应四位二进制；注意补0；  
3. 原码反码:  
	* 一个二进制代表一个比特位（bit)，8bit=1byte(字节);1024byte=1kb;MB,GB,PB,EB,ZB，
	数据的存储与运算以补码的形式，计算机只会加法  
	* 原码：二进制码
	* 反码：正数：和原码相同；负数：符号位不变，其他位取反
	* 补码：正数：和反码相同；负数：反码加1
	* 正负数：最高位不是用来表示数的大小，而是表示数的正负（0正1负） 
	* 运算时，相加八位变成了九位，溢出，舍弃多余的第九位；所得结果依然是补码形式，若最高位为1，则需要减1取反得原码;**由补码得原码：对补码再求一次补码即可得到**  
### Java基本语法
#### Java基本常识
* JDK--Java Development Kit(Java开发框架)： 
* JRE--Java Runtime Mechine(Java运行平台)：
* JVM--Java Virtual Mechine(Java虚拟机)：
* Java环境变量配置;**为什么要配置-->在不同路径下运行**
* jdk中，javac.exe是编译程序，java.exe是执行程序
* 步骤：我的电脑--属性--高级系统设置--环境变量--系统环境--Path--添加C:\Program Files\Java\jdk1.8.0_191\bin即可
* EditPlus使用：Ctrl+n：新建项目；Ctrl+s:保存
* class后需要有类名：类名用大驼峰命名法；文件名和类名保持一致；
#### 数据类型
1. 基本数据类型（值类型）：  
	* 整型：整数； 1byte表示[-128(1000 0000 本来是0 人为定为-128),127]---具体演算一遍；整型表示范围规律：[-2^(二进制位数-1)，2^(二进制位数-1)-1]
		* byte--字节型：1byte
		* short--短整型：2byte
		* int--整型：4byte
		* long--长整型：8byte
	* 浮点型：小数---以科学计数法的方式存储（例：3.14---314e-2）  
		* float--单精度：4byte
		* double--双精度：8byte
	* 布尔型 boolean：逻辑结果，真假true/false---不支持隐式转换
	* 字符型 char：
2. 引用数据类型（引用类型）：
#### 标识符：区分大小写(例INT)
1. 命名规则：可由字母数字下划线和$组成；不能以数字开头；不能是关键字(例byte,int)/保留字(已被系统占用还未使用，例goto)  
2. 命名方法：望文知意；遵循驼峰命名法(大驼峰：所有单词首字母都大写，类接口枚举；小驼峰：从第二个单词开始首字母大写，变量方法包，一般默认使用小驼峰)；
#### 变量常量
1. 变量：程序运行时，数值可以发生变化
2. 常量：程序运行时，数值不变
#### 数据类型转换：
1. 自动类型(隐式)转换  
	* 由取值范围小的数据类型向取值范围大的数据类型转换；
2. 强制类型(显式)转换  
	* 由取值范围大的数据类型向取值范围小的数据类型转换--具体转换结果涉及到最基本的底层二进制类型运算。
3. byte short char 运算时自动转换成int 类型
#### 字符类型
1. 字符-char  
	* 字符型变量赋值时要用单引号引起来，而且一次只能是一个字符且必须要有一个字符；
	* 如何将一个字符变量存储到内存中：所有的字符，在计算机的存储中都是以一个数字来进行的；字符存储时对应哪一个数字取决于程序所使用的字符集charset，最常见的字符集是ASCII码，GBK（国标码）；Unicode（万国码）；UTF-8（不同语种会分配不同的长度）
	* 字符型与整型之间可以自由转换；
2. 转义字符：\  
	* 在字符类型中，单引号有着特殊含义，是用来匹配一个字符的开头和结尾的；
	* 作用：将某些具有特殊含义的字符变为普通字符\'；配合特定的字符用来表示特定的含义\n；
3. 字符串-String（引用数据类型）  
	* 声明：String str="  ";字符串中内容用双引号引起来；内容长度不限,可以为空；单引号不需转义；  
	* 常用操作：字符串连接：直接用 + 即可，字符串在拼接时会将其他类型转成字符串然后接在一起；
	* String.format()：字符串的格式化
#### 常用运算符
1. 算数运算符  
	* + - * / % ++ --
	* 整型与整型的运算结果为整型；浮点型转为整型（直接舍弃小数部分，只保留整数部分)；
	* ++自增运算：将变量值加1；--自减运算；
	* 在变量后：先使用变量值，最后再变量加1/减1；
	* 在变量前：变量值先加1/减1，再使用变量；
2. 赋值运算符  
	* =  在赋值时注意左右数据类型相匹配；赋值运算一定会有运算结果，即赋值完成后变量的值；组合运算符：+= -= *= /= %=  
3. 逻辑运算符  
	* &and |or !not ^xor(相同false，不同true)   boolean型
	* &&短路与 ||短路或  
	* 两者计算结果一样；在进行逻辑运算时，若前半部分可判断，则短路操作后半部分可省略，普通操作不可省略；
4. 关系运算符  
	* > < == >= <= != 
	* 运算结果为true/false
5. 位运算符  
	* &位与 |位或 ^位异或 ~按位取反（每一位都要取反，包括符号位）
	* <<左移  >>有符号右移(最高位补符号位)  >>>无符号右移(最高位补0)   **???**
	* 将参与运算的整型变量求出补码用每一位的二进制数字进行位运算 0-false 1-true 
	* <<左移：求出补码，将每一位向左移动指定的位数(相当于在末尾补了指定位数的0)，相当于原数乘以指定位数个的2，不分原数是否为正；
	* --如何高效率的计算2*8或者3*8---**左移3即可(为什么效率高)**
	* 右移：相当于原数除以指定位数的2，补码每一位右移指定的位数---**?-9/4=-2**
6. 三目运算符   
	* bool？true：false 
7. 一元二元三元运算符：既是二元也是一元的运算符：+ -
8. 运算符的优先级：  
	* 赋值最低；一元高于二元高于三元；可用小括号改变优先级，括号优先级最高；
#### 流程控制
改变执行结构的语句,执行结构：顺序结构(从上到下依次执行，默认结构);分支结构;循环结构;  

1. 分支  
	* 语法    
		* if-else：  
		if(condition){}  
		else{}     
			* condition:boolean类型
			* else不是必须的；代码段语句只有一句时，花括号可以省略；else if语句;
		* switch-case：  
		  switch(variable){  
		case value1:  
		case value2:
		...
		default:}  
			* variable:boolean,int,String,char类型;
			* default:默认执行代码
			* variable的类型与value的类型应该一致;switch case语句有穿透性(从执行的case语句会一直运行到最后);default不是必须的,位置不一定要放在最后，位置没影响;
	* 使用场景  
		* 如果条件是一个范围区间用if-else;如果条件是一个确切的值，用switch-case;
2. 循环  
	* 语法  
		* for:  
		for(;;){}  
			* 初始值；循环条件；步长
			* 关键字continue(仅仅跳出本次循环，本次循环接下来的程序不再执行，不跳出循环体);break(跳出整个循环体);在嵌套循环中，break只会结束内层循环;
			* 可以在for的上一行加一个全大写的标签: 跳出该循环时可写为break 标签；//跳出指定循环，continue同理;---？具体实践一下
		* while：
		* do-while;
3. 循环总结  
判断一个字符是不是一个数字字符，如果是，将数字乘以100输出  
int num = char - '0'; 
	* for 嵌套  
		* 循环体中的代码若只有一句则花括号可以省略；在for循环中，小括号中的内容可以不写，循环条件默认是true，分号不可省略；
	* while循环  
		* while(condition){}  
	* do-while循环  
		* do{} while(condition)  
		* 与while的不同之处：do先执行一次循环体在开始判断循环条件；  
	* 循环次数是明确的，使用for循环；若循环次数不明确但循环结束的条件明确，使用while循环；
#### 全局变量与局部变量
1. 局部变量：  
	* 声明在某一个代码段中；作用域从声明开始到所在区域的花括号结束；两个同名局部变量作用域不可重叠；  
2. 全局变量：  
	* 声明在类中，与方法平级的变量； 
### 方法
#### 定义
1. 语法: [访问权限修饰符][其他修饰符]返回值类型 方法名（[参数列表]）{}  
2. 访问权限：public,private,protected  
3. 其他修饰符：static,default,abstract，
#### 调用
1. 程序从主函数开始执行，主函数结束，程序结束；  
#### 参数-paramter
1. 声明：  
2. 实参：  
	* 实参的改变需要用到返回值return；
3. 形参：
4. 传参：
#### 返回值
1. void:该方法无返回值;  return;表示方法结束;
2. return关键字：表示方法执行的结果，后面加返回值;返回值最多只能有一个;return表示结束一个方法的结束；
3. 如果一个方法的返回值类型不是void，则函数体必须要有return；
#### 重载overload
1. 在一个类中的不同方法满足:  
	* 方法名相同，参数不同（数量不同，类型不同，顺序不同）
	* 与返回值类型无关
### 数组
#### 定义
1. 元素类型一致,数组名就是指针，代表的是地址
2. 特点：  
	* 数组的长度(数组元素的最大数量);  
	* 数组一旦实例化完成，长度不可再修改;
3. 声明与实例化(在内存中开辟一段空间，并且存储元素数据):  
	* new：在堆空间中开辟一段内存  
	* int[] array; int array[];
	* 实例化
		* int[] array=new int[5];会自动填充默认值（整型为0，浮点型为0.0，字符型为'\0'--一般输出为空格，布尔型为false）;array在栈中开辟空间，等号右边的才是在堆中开辟的空间
		* int[] array=new int[]{1,2,3,4,5}; 填充指定值;
		* int[] array={1,2,3,4,5}; 数组长度为元素个数;
		* void show(int... array){	//int... 实际上array是一个数组;在调用方法时，可以将数组元素直接写到实数参数列表中;int...必须放在形参列表的最后，且只能有一个；	
#### 元素访问
1. 通过下标(在数组中的位置,从0开始)访问;用**array.length**表示长度;  
5. 遍历数组:  
	* 遍历下标（[0,array.length);  
	* 增强for循环for(int ele : array){S...(ele));},ele是迭代变量,array中的元素依次赋值给迭代变量,对于array本身的值没有影响;
#### 引用数据类型：---指针????
1. array存储的是数组首元素的地址
#### 常见操作
1. 数组排序  
	* 冒泡
	* 选择
2. 数组查找  
	* 顺序查找：从数组中查询指定元素的下标,不存在一般返回-1;---对于存在多个等值的元素查找  
	* 二分查找
#### 动态参数
1. 当参数是一个数组的时候，可以将数组中的元素直接写到实参的列表中  
2. （例：get（array）;或者get(1,2,3,4,5);）；
#### 二分查找法：
1. 目的：查询一个元素在数组中的下标，若出现了多次则只会查询到一个；
2. 方式：每次取中间值，要求数组是有序的；升序
#### Arrays工具类
1. 一个用来操作数组的类，提供很多对数组操作的方法(例如:排序，二分)；
2. 使用时，需要import java.util.Arrays或者import java.util.*;
3. 方法描述参数：  
	* sort:对数组中的元素进行排序;对数组中指定范围的元素进行排序，
	* binarySearch:二分查找法查询指定元素的下标;二分查找法在指定范围内查询;
	* copyOf:拷贝原数组中指定位数的元素;属于深拷贝
	* copyOfRange:拷贝原数组中指定范围的元素
	* fill:使用指定的元素来填充数组;使用指定的元素来填充数组指定范围
	* toString:返回数组的字符串表示形式
	* equals:判断两个数组中的元素是否相同;
#### 数组拷贝
1. 浅拷贝：地址拷贝int[] ret=array;两个数组指向同一个地址
2. 深拷贝：在内存(堆)上开辟一个新的地址，将原数组中的元素依次拷贝到新的地址空间中;两个数组指向不同的地址;
#### 二维数组
1. 在二维数组中存储的元素类型是数组类型
2. 声明与实例化:int[][] array;int array[][];int[] array[](一般是不会这样写的);
3. 实例化:  
	* int array[][]=new int[3][];  
	* 在实例化时，前[]是array的长度=array.length,不能为空;  
	* 后[]是被嵌套的数组长度,可以省略;
4. NULL:空，只能用于引用类型;表示没有地址指向;是默认值new int[2][]; **注意空指针的异常**
5. 访问元素:  
	 * array[0]=new int[]{1,2,3,4,5};  
	 * array[1]=new int[]{1,2,3};  
	 * 注意元素个数与第二个[]内的数字无关;
### 键盘录入
1. Scanner类的使用:  
	* Scanner scanner=new Scanner(System.in);
	* boolean bool=scanner.nextBoolean();//不区分大小写,只认true和false  
	* 没有nextChar,String str=scanner.nextLine();//读一行，结果为字符串类型;char c=str.charAt(0);
2. 字符串类型与整型类型的转换  
	* 基本数据类型->字符串类型:例:String str1=String.valueOf(10);
	* 字符串转基本:int a2=Integer.valueOf("qqq");//(long/short/Byte/Float/Double/Boolean).valueOf() **（如果字符串中的内容无法转化为指定的类型，会抛出异常；）**  
	* String.format()：格式化字符串的方法  
		* %d是一个整型的占位符;  
		* %f是一个浮点型占位符;  
		* %s是一个字符串的占位符;  
		* %c是一个字符型占位符  
		* %02d凑够两位，不够两位前面补0;  
		* %.3f保留小数点后面3位；
## 面向对象
### 面向对象基础
#### 面向过程
着眼点在于问题如何一步步解决
#### 面向对象  
着眼点在于借助方法解决问题
#### 编程思想
#### 类
1. 若干个具有相同属性和行为的对象集合;
2. 对象：万物皆对象;一个具有特殊功能可以解决特定问题的类的实体;
3. 类的设计：  
	* 类是一种自定义的类型;类是一种引用数据类型,new前面的都是堆上的--地址;同一个包里面不可以有同名类出现;
	* 一个java文件中，只有和文件名相同的类能用public修饰（只有一个）;每一个类在编译时都会生成一个.class文件;类成员即为在类中可以写什么（属性--变量和行为--方法不要有static）;
	* public的主函数可以出现在任意一个类中;但在一个文件中,只能有一个;不能重载
	* [访问权限修饰符] class 类名{}
	* 访问权限修饰符:
	* 关键字class 
	* 类名：标志符，遵循大驼峰命名法
4. 对象的实例化：  
	* 关键字new;
	* 成员访问：.
#### 包-package
1. 是对一个程序中指定功能的部分代码进行包装;描述文件在哪一个包中;表明文件的具体路径;在不同的包中可以命名同名类--路径不同;  
2. import：  
	* 导包,在当前的类中用到了其他类，会优先从当前包中查找是否有该类，如果该类在其他包中：可使用该类的权限命名(.)或者用import关键字进行导包(说明在当前这个类中需要使用某一个包中的文件，最后一个是文件名);
	* import 包名.*;只会导入当前包中的文件，不会包含子包中的文件;同名类一般只能用权限命名法访问
#### static关键字
1. 表示静态，可以修饰属性（静态属性，类属性）和方法（静态方法，类方法）；被static修饰的部分被称作静态成员或类成员；不是被static修饰的部分被称为非静态成员或实例成员；
2. 的：非静态属性，成员属性，实例属性（在堆上开辟空间，在实例化（new）时开辟）；用对象来访问；
3. 静态属性：在常量池中开辟空间；在类第一次被加载到内存中时（第一次使用该类时）；用类来访问；
4. 在静态方法中可以直接访问静态成员，不能直接访问非静态成员；
5. 在非静态方法中，可以直接访问静态/非静态成员；
6. 如果希望属性值随着不同对象而变化（姓名，身高）设计为非静态
7. 如果希望方法属于一个对象的行为（sb吃饭）设计为非静态
8. 如果希望方法不依赖于对象，只是作为实现某一通用功能的工具类，设计为静态
#### this关键字：
1. 代表对当前对象（需要用在某一个方法中）的引用；只能用在非静态方法中；非静态方法需要用对象来访问，哪个对象调用该方法this就是哪个对象；
2. this可以省略：在类中访问当前类中的非静态成员，
3. 就近原则：
4. 当前类.静态方法;
#### 构造方法
1. 是一个方法；
2. 特殊点：没有返回值（返回值类型不是void）;方法名和类名相同；不能用static修饰；在实例化一个对象的时候自动调用；
3. 意义：对对象的一些属性的初始化赋值；
4. 在构造方法中调用其他的构造方法：通过this(name,age);调用本类中其他构造方法(此语句应是构造方法的第一句,所以只能嵌套一个);
5. 无参构造方法：一个类中若没写构造方法，则该类有一个默认的Public权限的无参的构造方法；一个类中写了构造方法，则默认的构造方法将会消失；
#### 实例化对象的过程
1. Person xiaobai=new Person();
2. new表示在堆上开辟空间；然后执行非静态代码段；然后执行构造方法，执行初始化操作；
#### 代码块
1. 静态代码段：static{}当这个类第一次被加载到内存中时执行（实例化，调用静态方法...）；
####面向对象基本内容
类的设计，对象的实例化(构造方法)，成员访问(静态/非静态),类是一种自定义引用数据类型
### 封装性
#### 思想
高内聚低耦合
#### 狭义上的封装
1. 一个类中的某一些属性，不希望被外界直接访问，可将此属性私有化(private)，还需要提供用来访问该属性的方法（setter，getter)--Shift+Alt+s：实现对数据的过滤
2. private：访问权限修饰符，修饰属性和方法；只能在当前类中被访问
3. filed：属性，字段
### 继承
#### 定义
1. 在上一层进行架构，将共同的属性和方法单独写到一个类（父类-基类-超类）；  
2. 在子类（-派生类）中进行具体分化  
3. extends关键字：描述两个类之间的继承关系；
#### 特点
1. java是单继承的，一个类只能有一个父类，可以有多个子类；  
2. c++是支持多继承的；  
3. 多继承会存在二义性的问题；  
4. java中使用接口实现了类似多继承的功能；
5. 子类可以访问父类中的部分（）成员；
6. 构造方法不能继承；
7. java中的所有了都直接或间接的继承自Object类
#### 意义
可以降低代码冗余度；子类可以在父类的功能基础上进行功能的扩展；
#### 继承中的构造方法
1. 一个对象在实例化的时候需要先去实例化从父类继承到的成员；在实例化父类部分时默认会调用父类中的无参构造；先调用父类构造再调用自身构造；
2. 若父类中没有无参构造或者是Private权限时：手动调用父类构造方法；给父类加无参构造；
3. this关键字：this();对当前对象构造的引用
4. super关键字：super();对父类构造方法的引用；
### 访问权限
#### 基本内容
1. 类，方法，属性，接口，枚举，，，
2. 访问权限一共四种：公开，保护，包，私有
3. 对应的访问权限修饰符共有三个：public ,protecred,(default/package) ,private
4. 注意：包权限没有访问权限修饰符，如果没有使用任意的修饰符来修饰，则访问权限是包权限；
5. private：类成员--只能在当前类中访问
6. default：类成员、类--只能在当前包中访问
7. protected：类成员--可以在当前包中/也可以在跨包的子类中访问
8. public：类成员、类--可在项目中的任意位置访问
9. 子类的访问权限一般是小于等于父类的，但不做强制要求；
10. 类:一般用public
11. 属性/方法：权限能小就小；
12. 好处:  
	* 为了降低代码冗余度
	* 为了给一个类拓展功能  
		* 如果某一个类给我们提供的功能不能满足我们的需求了，而且此时我们还不能修改这个类。那么我们要第一时间想到继承
#### 重写
1. Override：对同样的一个方法用子类的实现覆盖父类的实现;
2. @Override：注解，常用在方法的重写中，表示在方法的重写之前，进行一个验证，验证这个方法，到底是不是在重写父类中的方法，一般情况下会写上，但不是强制的；
3. 访问权限子类方法不能比父类方法的低，要大于等于；
4. 关于返回值类型：  
	* 要求方法名和参数必须和父类方法一样；  
	* 子类方法的返回值类型可以和父类方法返回值类型一样，也可以是父类方法返回值类型的子类型--当返回值类型为类对象时；
5. final关键字:	  
	* 修饰变量，值不能改变；  
	* 修饰类，是一个最终类不能被继承；  
	* 修饰一个方法，是一个最终方法，不能被重写；
### Object类
#### 定义
是所有类的最终父类；定义了一些比较常用的方法
#### 方法
1. public String toString();  
	* 返回一个对象的字符串表示形式--在一个对象需要转型成字符串类型时自动调用，例如 控制台的输出/和字符串做拼接(+两边至少有一个是字符串时);
2. 输出对象时看到每一个属性值：  
	* 重写toString()方法;
	* 格式化this.name中this可以省略;
	* 可以快速生成；
3. public Class<?> getClass();获取类型用的--判断两个对象是否同属一个类;
4. public boolean equals(Object other);  
	* 用来比较两个对象是否相同;
	* 在Object类中，实质上默认还是比较两个对象的地址(==比较的是地址);
	* 可以重写equals改变比较方式--如果other是null，则返回结果是false，如果this==other，则返回结果是true，如果this和other类型不同，则为false，如果x.equals(y)==true,则y.equals(x)==true,如果x.equals(y)==true,y.equals(z)==true,则x.equals(z)==true;
5. 如果两个基本数据类型比较相同，用==；如果两个对象比较相同，使用equals；this一般是可以省略的；
6.  public int hashCode();  
	* 获取一个对象在哈希码;
	* 如果一个对象没有在一个散列序列的话，没有任何作用，当一个对象存储在一个散列序列中时才有作用;
	* 散列序列：HashSet，HashMap...
7. protected void finalize() throws Throwable{};  
	* 析构方法，在实例化一个对象的时候执行构造方法，在一个对象在被销毁释放空间之前执行析构方法;
### 多态初步
#### 体现
1. 父类的引用可以指向子类的对象
2. Animal animal=new Dog();
3. 接口的引用可以指向实现类的对象；
#### 转型
1. 声明一个新的变量将原来的值给其赋值，并不是将原变量的类型改变；
2.  向上转型：子类类型转为父类类型；  
	实现类类型转型为接口类型；  
	隐式转换；  
	向上转型后的对象将只能访问父类/接口中的成员
3. 向下转型：一般需要强制转换，可能会失败；  
	可以访问子类/实现类中特有的成员
4. 仅针对于向下转型
	* 转型失败ClassCastException;
	* 避免方式:转型前先判断:
	* instanceof关键字 if(animal instanceoc Dog){是个dog}--此处必须要有花括号;
5. 如果一个类中重写了父类的某一个方法，此时：  
	* 如果用这个类的对象来调用这个方法，最终执行的是子类的实现；
	* 如果用向上转型后的对象来调用这个方法，执行的仍然是子类的实现--因为向上转型后的对象，归根到底还是子类的对象。
**在java中，所有的方法默认都是虚函数，在某一些语言(如C#)中方法的默认都不是虚函数，这些方法可以被子类重写/隐藏**
### 抽象类
abstract关键字;抽象类中可以写非抽象方法;
#### 抽象类
1. 用abstract修饰的类，抽象类不能实例化对象(即不能new);
2. 抽象类中可以写非静态成员，非静态成员可以继承给子类;
3. 抽象类中可以包含构造方法的，但依然不能实例化对象;
#### 抽象方法
1. 有abstract修饰的方法，只有声明，没有实现--无花括号;
2. 只能够写在抽象类中;
3. 修饰符顺序:无所谓;一般情况下先写权限修饰符;
4. 使用场景:  
	* 使用抽象类和抽象方法实现一些简单规则的制定(强制子类实现相应的方法);
	* 如果仅用抽象类和抽象方法进行制定约束，
5. 注意:  
	* 非抽象子类在继承抽象父类时要实现父类中所有的抽象方法;
	* 如果多重继承过程中曾抽象方法重写过，则最后的类可以不在重写该抽象方法;
	* final和abstract不能同时出现，不论是类还是方法----？？？？？;
	* private和abstract不能同时修饰方法;
### 接口
interface关键字;
#### 语法
1. [访问权限修饰符] interface 接口名字{}  
2. 只能有public和default两种权限；
3. 不是类，不能实例化对象；
4. 暂时和类平级，不相互嵌套；
5. 一个文件可以写多个接口，但是用public修饰的只能有一个；
6. 编译后也会生成.class文件；
7. 接口名字遵循大驼峰命名法；
#### 接口中成员的定义
1. 属性:默认修饰符是 public static final；
2. 构造方法：接口中不能有构造方法
3. 方法：  
	* 接口中的方法都是抽象方法--默认的；
	* 接口中的方法访问权限修饰符都是public；
4. 接口需要被类实现的:  
	* 关键字implements
	* 非抽象类实现接口时要实现接口中所有的抽象方法；
	* 一个类在继承一个父类后，还可以再去实现接口--父类在前，接口在后；
	* 一个类可以实现多个接口；
	* 如果在多个接口中有相同的方法，则该方法只需要实现一次即可；
	* 接口也可以继承接口--而且是多继承的；
5. 根据功能性设计接口，一个具体的功能一个接口；
#### default
1. JDK1.8之后新添加的特性，可以用来修饰接口中的方法，可以有部分实现
2. 在实现类实现接口的时候，default方法不是必须实现的；如果重写这个方法，则可以用自己的实现覆盖接口中的实现；如果没有重写这个方法，则会采用接口中默认的实现方式；
#### lambda表达式
1. JDK1.8添加的新特性，是一个语法糖，想让语法更加简单(傻瓜);配合接口使用--是对一个接口中方法的简单实现;
2. 语法:  
	* ->lambda运算符，分隔参数列表和方法体
	* (数据类型 参数1,数据类型 参数2,...)->{... return 返回值};
	* 简化：  
		* 参数的类型可以简化，因为在接口方法的定义中，已经声明了参数的类型了；
		* 如果参数列表中只有一个形参，则小括号可以省略；
		* 如果方法体中只有一句代码，大括号可以省略，且此时这一句代码最后的分号也要省略；
		* 如果方法体中只有一句代码，且这一句代码是返回值，则省略掉大括号的同时，return关键字也必须省略









## 设计模式
开闭原则：对扩展开发，对修改封闭；
### 单例设计模式
用来解决在不同的模块中访问同一个类的同一个对象；  
设计一个静态的当前类型的属性（private）；  
私有化构造方法：此操作在单例中是不必须的；
#### 饿汉式
1. ```class User{private static User instance=new User(); public static User getUser(){return instance;}}  ```
2. 在单例设计中，只要用到了这个User类，instance都会被实例化，此时，instance可能我们并不会被用到，所以会造成一定程度上的性能损耗；  
3. 声明一个私有的静态的当前类的对象，并实例化，因为instance是静态的，实例化的过程只会执行一次；  
4. 提供一个public权限的静态的返回当前类对象的方法；  
5. 将刚才实例化的instance返回，因为这个instance只会实例化一次，所以无论这个方法执行多少次，最终返回的结果都是同一个对象
#### 懒汉式
1. ```class User{private static User instance;public static User getUser(){if(instance==null)instance=new User(); return instance;}} ```
2. 使用的时候再去实例化instance，没有多余的资源浪费；  
3. 这种方法在多线程环境中有问题；  
4. 声明一个私有的静态的当前类的对象，不对它进行实例化；  
5. 什么时候需要获取这个对象的时候，再去实例化；  
6. 提供一个public权限的静态的返回当前类对象的方法；  
7. 在使用的时候，判断instance是不是null，如果是，对他做实例化，如果不是直接使用即可；
### 工厂模式
#### 简单工厂模式
1. 违反开闭原则
2. 若为非静态，一般和单例结合；
#### 工厂模式
1. 对于产品族问题无法解决---抽象父类的抽象方法继承；
2. 上层接口(较常用)；
#### 抽象工厂
1. 工厂方法可以看做抽象工厂的子类
2. 优先考虑接口
### 生产者消费者模式--多线程
#### 基本内容
1. wait() 、notify() 、notifyAll()
	* wait(): 等待。使得当前的线程释放锁标记，进入等待队列。可以使当前的线程进入阻塞状态。
	* notify(): 唤醒，唤醒等待队列中的一个线程
	* notifyAll(): 唤醒，唤醒等待队列中所有的线程。
2. wait和sleep的区别
	* 两个方法都可以使一个线程进入阻塞
	*  区别：wait方法会释放锁标记，sleep则不会释放锁标记。


## java进阶
### 内部类
> 在一个类中写的类；可多次嵌套--没意义；内部类对象实例化格式
#### 成员内部类
1. 写在一个类中，非静态，与外部类中的其他方法平级
2. 特点:  
	* 内部类的访问权限:四种权限都可以；
	* 此时，这个类就是外部类对象的一个成员，类似于属性、方法；
	* 对象的实例化需要通过外部类对象.new的方式；
	* 编译后生成OutterClass$InnerClass的字节码文件；
	* 关于属性访问:（仅局限于外部类属性、内部类属性、方法参数同名的情况）--参数；内部类属性this.；外部类属性；
#### 静态内部类
1. 写在一个类中，静态，与外部类其他方法平级；
2. 特点:  
	* 内部类的访问权限：可以是任意权限
	* 对象的实例化直接new的方式就可以/也可以用直接用import .InnerClass导入的形式；  
		`OutterClass.InnerClass inner = new OutterClass.InnerClass();`
		`import OutterClass.InnerClass;`
	*  编译后生成OutterClass$InnerClass.class字节码文件
	* 关于属性访问：静态内部类中不能直接访问外部类中的非静态成员
#### 局部内部类
1. 写在某一段代码段中(如一个方法中)的类；
2. 特点:  
	* 权限：只能用abstract/final/省略
	* 实例化：只能在该代码段中可以进行访问
	* 编译后生成的字节码文件：外部类$序号.class字节码文件
	* 关于属性访问：同成员内部类
#### 匿名内部类:
1. 没有名字的类
2. 一般情况下是配合抽象类或者接口使用的--该两者均不能实例化对象；
3. 接口是实例化的实现类对象，并向上转型;
4. 编译后会生成一个外部类$序号.class文件
### 用类
> 工具类一般都是静态方法类
#### Math类
1. 数学计算方法
	* abs()--绝对值;
	* max()--最大值;
	* min()--最小值;
	* pow(a,b)--a的b次方;
	* sqrt(a)--开方;
	* floor(a)--;
	* Math.random()--[0,1)浮点型:
#### Random类
1. 随机数的生成：是由一个随机种子，带入到一个固定的随机数算法中，生成一个数字序列；
2. 如果随机种子相同，产生的随机数列也相同；
#### BigInteger--没有无参构造,实现大数的基本计算/BigDecimal类
> 用来处理非常大的数字的基本运算  
	
* add();
* subtract();
* multiply();
* divide();
#### Date/SimpleDateFormat类
1. Date:时间日期类;  
	* Date():获取当前时间
	* Date(long time):获取指定时间戳对应的时间；
	* void setTime(long time)：使用指定时间戳设置一个日期对象；
	* long getTime():获取一个指定日期对象的时间戳
	* equals(Object obj):判断是否和另外一个日期相同
	* boolean before(Date Other):判断是否在另一个时间之前
	* boolean after(Date Other):判断是否在另一个日期之后  
2. SimpleDateFormat类：做日期格式化的;  
	* yyyyMMddHHmmss--date转字符串输出；
	* 将符合格式的date字符串转成date
	* 可以将一个Date格式化为指定格式的字符串；可以将一个自定义的字符串解析为一个Date
	* 常用方法:  
		* impleDateFormat(String pattern):使用指定的格式来实例化一个对象
		* String format(Date date):将一个日期格式化为指定的字符串；
		* ate parse(String str):将一个指定格式的字符串解析为一个日期
3. Calendar类  
	* set方法不做修正，add方法会做修正；用来操作日期的类
	* 常用静态常量，用来描述一些字段：  
		* YEAR：年，
		* MONTH：月（月份从零开始计算），
		* DAY_OF_MONTH：日，
		* HOUR：时（12小时制），
		* HOUR_OF_DAY：时（24小时制）,
		* MINUTE：分，
		* SECOND：秒
	* 方法  
		* getInstance():获取一个当前日期的Calendar对象
		* get(int filed):获取指定ID的值  
		* set(int filed,int value):设置指定ID的值
		* set(int year,int month,int date):设置年月日
		* set(int year,int month,int date,int hourOfday,int minute,int second):设置年月日时分秒
		* add(int filed,int amount):对某个ID的值进行增（若值为负数，操作为减）
		* setTime(Date date):通过一个Date对象，对一个日期进行赋值
		* getTime():通过一个日起对象，获取一个Date对象
		* boolean bafore(Object other):判断是否在一个日期之前
		* boolean after(Object other):判断是否在一个日期之后
		* boolean equals(Object other):判断是否和另外一个日期相同
### 包装类
#### 类型
1. 包装类是将基本数据类型，用一个类进行了一层包装，可以按照引用类进行使用，同时还提供了若干用来进行数据转换到操作；  
	* byte(Byte),short(Short),int(Integer),long(Long),float(Float),double(Double),boolean(Boolean),char(Character);
2. 装箱，拆箱；基本数据类型与字符串之间的互相转换  
	* Integer i=Integer.valveOf(a);Integer i=new Integer(a);
3. 装箱：由基本数据类型转型为包装类型  
	* 通过构造方法进行装箱：Integer i=new Integer(10);
	* 通过valueOf方法进行装箱：Integer i=Integer.valueOf(10);
	* 在1.5之后的自动装箱中，Integer a = 100; 这一句话相当于自动调用了 Integer a = Integer.valueOf(100);
	* 阅读valueOf原码，发现如果要包装的数字是[-128, 127]之间，那么会从一个预设好的Integer数组中来获取元素（java.lang.Integer.IntegerCache.chache），所以每次获取的元素都是相同的。所以地址也是相同的。但是如果要包装的数字不在这个范围内，那么就会实例化一个新的Integer对象。
4. 拆箱：由包装类型转型为基本数据类型  
	* `Integer i=new Integer(10);`
	*  `int a=i.intvalue();`
5. 在JDK1.5之后，装箱和拆箱都是自动完成的  
	* `Integer a=10;int b=new Integer(10);`
6. 基本数据类型转字符串：  
	* `String s2=String.valueOf("aa");String s3=Integer.valueOf("aa").toString();`
7. 字符串转基本数据类型  
	* int a=Integer.valueOf("123");
	* int b=Integer.parseInt("123");
### 枚举
#### 定义
> 是jdk1.5之后新增的特性  
> 数据类型，关键字enum
#### 语法
1. [访问权限修饰符] enum 枚举名字{ }
2. 枚举一般情况下是用来描述一些取值范围有限的数据；例如：星期几
#### 常用方法
* name()
* compareTo()
* toString()
* ordinal()
* values()  
在枚举中定义属性和方法（包括构造方法）
### 异常处理
#### 定义
1. 异常：就是程序在运行的过程中遇到的种种不正常的情况。
2. 特点：如果一个程序在运行中遇到了一个未经处理的异常，则这个异常会终止程序的运行。
3. 但是如果程序出现的异常被处理了，此时程序不会被终止。所以我们需要知道怎么去处理异常。
4. 其实在Java中，异常也是一个类
5. 类的体系  
	* Throwable: 是所有的异常的根类  
		* Error: 发生在编译器级别的，我们程序无法处理的错误。
		* **Exception**:  我们可以去处理的异常
		* **RuntimeException**
6. 异常的分类：可以分成两种异常  
	* 运行时异常（Runtime Exception）  
		* 发生在程序运行的过程中的异常
		* 如果不处理这种异常，程序可以正常编译，但是当执行到异常产生的时候，会终止程序的运行
		* 例如：NullPointerException、IndexOutOfBoundsException、ArithmeticException...
	* 非运行时异常（Non-Runtime Exception）  
		* 发生在程序编译的过程中的异常。（编译时异常）
		* 如果不处理这种异常，程序将无法进行编译
		* 例如：ParseException...
#### 异常处理
1. 需要使用语法：**try-catch-finally**
2. 语法:  
	> try {
	>   
	> // 这里写可能会产生异常的代码  
	> 
	> 一旦这里面的代码产生了异常，从异常产生开始往后所有try中的代码都不再执行，直接执行指定的catch  
	> }  
	> catch(需要捕获的异常类型 标识符) {   
	> 
	> / 捕获异常，如果try中产生的异常类型和我们要捕获的异常类型匹配，此时会执行这个代码段中的内容  
	> 
	> // 如果执行到这里了，相当于这个异常被捕获、处理了，这个异常将不再终止程序的运行。  
	> }  
	> finally {  
	> // 这里的代码始终会执行。  
	> // 无论try中的代码有没有异常产生，这里的代码都会执行。  
	> // 在这里我们一般情况下是做一些资源释放的工作。  
	> }
3. 备注  
	* 以上，是完整的try-catch-finally语句。但是实际在用的时候，try后面可以只有catch， 也可只有finally，但是不能什么都没有。
	* 一般情况下，catch我们是不会省略不写的。
	* 如果try中的代码可能产生的异常不止一种  
		* 如果需要对产生的不同异常进行不同的处理，可以使用多个catch语句  
			* 多个catch语句的先后顺序  
				* 如果多个catch中的异常，没有继承关系，则先后顺序没有影响
				* 如果多个catch中的异常，有继承关系，则子类异常在前，父类异常在后
			* 如果需要对某些异常做同样的处理，可以在同一个catch中，用 | 拼接所有要处理的异常。  
				* 这些用|拼接起来的异常之间，不能有继承关系
			* 如果需要对所有的异常做同样的处理，可以在一个catch中捕获一个父类异常。
	* 在try和catch中都有return语句
	* finally中的代码始终会执行，但是针对这种情况，他的执行时机：
	* 先执行return语句，此时，将需要返回的值缓存起来。然后再去执行finally语句中的代码，执行结束后，返回刚才缓存的那个值。
#### 关键字
1. throw  
	* 常用在某一个方法中，表示抛出一个异常对象。等在调用这个方法的时候去处理这个异常。
	* 一个异常对象被实例化完成后，不具备任何意义。只有被throw关键字抛出了，才具备异常的功能。
2. throws  
	* 常用在方法的声明部分，用来描述这个方法可能会抛出什么异常，给调用这个方法的部分看的。  
		* 如果在方法中使用throw抛出了一个Runtime Exception:
			* throws可以写，也可以不写
			* 备注：一般情况下，我们还是会按照实际情况进行描述的。
		* 如果在方法中使用throw抛出了一个Non-Runtime Exception:
			* 此时throws必须写
	* 可以在方法中不去处理异常，将异常处理提到调用这个方法的时候
	* 注意：在方法重写中  
		* 如果重写的方法抛出的是一个Non-Runtime Exception  
			* 子类方法抛出的异常需要父类方法抛出异常的子类型，或者等同于父类方法抛出的异常类型
			* 不能让子类重写的方法抛出异常的类型高于父类方法抛出的异常类型
#### 自定义异常
1. 系统给我们提供了很多的异常类，但是这些异常类并不能够满足我们所有的需求。这种情况下，我们就需要去自定义异常。继承自异常类，写一个子类即可
2. 自定义RuntimeException  
	* 继承自RuntimeException类，写一个子类。这个子类异常就是一个运行时异常。
3. 自定义Non-Runtime Exception
	* 继承自Exception类，写一个子类。这个子类异常就是一个非运行时异常
4. 在自定义异常类的时候，类名最好使用Exception作为结尾
### 字符串类--String
#### 定义
1. 是若干个字符组成的一个有序序列。字符串String是一个引用数据类型。
2. 字符串是在常量池中开辟的空间，例如：当程序第一次使用到“123”这个字符串，会去常量池中开辟空间，存储“123”，然后再使用到”123“的时候，直接找到上次开辟好的空间去使用即可
3. **结论：对于两个字符串是否相同的判断，最好使用equals方法来判断，而不是直接通过==来判断**
4. **关于字符串的所有操作，都不会直接修改字符串本身，会将修改之后的结果用返回值的形式返回。所以如果需要获取到修改之后的字符串，那么需要去接收返回值。**
5. 方法和描述:  
	* String() 获取一个空字符串
	*  String(String original) 通过一个字符串，实例化另外一个字符串   
	*  String(char[] arr)  将一个字符数组拼接成一个字符串 
	*   String(char[] array, int offset, int count) 将一个字符数组中的指定部分拼接成一个字符串 
	*   String(byte[] arr) 将一个字节数组转换成一个字符串 
	*   String(byte[] arr, int offset, int count) 将一个字节数组的指定部分拼接成一个字符串 
	*   String concat(String other) 将两个字符串进行拼接 
	*    String subString(int beginIndex, int endIndex) 截取[beginIndex, endIndex)范围的子串   
	*   String subString(int beginIndex)   截取从beginIndex位开始往后所有的子串
	*   String replace(CharSequence oldCharSequence, CharSequence newCharSequence) 用指定的字符序列替换原字符串中指定的字符序列  
	*   char charAt(int index) 获取指定下标的字符
	*   char[] toCharArray()   转成字符数组
	*   byte[] getBytes() 转成字节数组
	*   int indexOf(char c) 获取一个字符第一次出现的下标
	*   int indexOf(char c, int index) 查询指定的字符，从指定位开始，第一次出现的下标
	*  int lastIndexOf(char c)   查询指定的字符最后一次出现的下标
	*  int lastIndexOf(char c, int index) 查询指定的字符，从指定位开始，最后一次出现的下标 
	*  int indexOf(String c) 查询指定的字符串第一次出现的下标
	*  int indexOf(String c, int index)  查询指定的字符串，从指定位开始，第一次出现的下标  
	*  int lastIndexOf(String c)  查询指定的字符串最后一次出现的下标
	*  int lastIndexOf(String c, int index)  查询指定的字符串，从指定位开始，最后一次出现的下标
	*  String toUpperCase()  将小写字母转成大写字母 
	* String toLowerCase()   将大写字母转成小写字母
	*  boolean isEmpty()  判断一个字符串是否是空串 length() == 0 
	*  boolean contains(String str)   判断一个字符串中是否包含指定的子串 
	*  boolean startsWith(String prefix)  判断一个字符串是否以指定的字符串开头
	*  boolean endsWith(String shulfix)  判断一个字符串是否以指定的字符串结尾 
	*  String trim()  去除字符串前后的空格字符 
	*  boolean equalsIgnorCase()  判断两个字符串是否相同（忽略大小写）
	*  int compareTo(String str) 比较两个字符串的大小关系
	*  int compareToIgnoreCase(String str)  比较两个字符串的大小关系（忽略大小写）  
### 字符串操作类--StringBuffer,StringBuilder
#### 定义
1. 这两个类是用来做字符串操作的类，给我们提供了若干个用来操作字符串的方法。类似于String类中方法。
#### 不同之处：  
	*  可以直接修改字符串中的内容
#### 方法:  
	*  append: 字符串拼接，将一个指定的部分拼接到字符串的结尾
	*   insert: 字符串插入，将指定的部分插入到一个字符串中指定的位置
	*  delete: 字符串删除，删除指定部分的子串
	*  deleteCharAt: 删除指定下标的字符
	*  replace: 字符串替换，使用一个新的字符串，替换掉原字符串中指定范围的字符串
	*  reverse: 字符串翻转
	*  setCharAt: 修改指定位的字符为一个新的字符
	*  toString: 将StringBuffer转成字符串
#### StringBuffer和StringBuilder的区别
1.  StringBuffer是线程安全的，StringBuilder是线程不安全的。
2.  StringBuilder的执行效率比StringBuffer高
### 正则表达式---见最后补充内容
> 是用来做校验的。校验一个字符串是否满足我们预设的一些规则
#### 语法
[https://baike.baidu.com/item/%E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8F/1700215?fr=aladdin](https://baike.baidu.com/item/%E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8F/1700215?fr=aladdin)
### 泛型---见最后补充内容
### 集合---更全面内容见最后补充内容
#### 定义
> 也是一个容器，用来存储相兼容的数据类型的容器。
#### 集合和数组的区别
1.  数组中可以存储基本数据类型和引用数据类型。集合中只能存储引用数据类型。
2.  集合是一个可变长度的容器。可以随时对集合做增、删操作。数组是一个定长的容器。
3.  数组中元素操作比较单一。集合提供了很多用来操作元素的方法
4. 集合框架:  
	* Collection  
		* List  
			* ArrayList
			* LinkedList
			* Vector
				* Stack
			* Set
				* HashSet  
					* LinkedHashSet
				* TreeSet
			* Map 
				* HashMap
					* LinkedHashMap
				* TreeMap
				* Hashtable
					* Properties
#### Collection接口
1. 如果使用增强for循环去遍历一个集合，在遍历的过程中，不允许对集合中的元素进行增、删的操作
2. 增强for循环的底层实现，就是用迭代器实现的。
#### 迭代器
1. 是一个类，是用来遍历一个集合的
2. 迭代器的工作原理   
3. boolean hasNext(): 判断当前指向的元素后面还有没有元素
4. T next(): 指向集合中的下一个元素，并且返回这个元素
5. 如果指向了一个超出下标范围的地方，会抛出异常 NoSuchElementException
6.  实例化一个新的对象，默认指向集合中一个不存在的位置（-1）然后，使用next方法依次向后指向每一个元素并获取，直到hashNext判断为false，表示最后已经没有元素了，此时停止迭代。
7.  remove(): 删除迭代器当前指向的这个元素。可以在迭代的过程中使用这个方法进行元素的删除
#### List接口
1. 是Collection接口的子接口，是用来存储元素的集合。
2. 特点:  
	* 存储的元素是有序的。元素添加的顺序和底层存储的顺序是一致的。
	* 存储的元素是可以重复的
#### List接口实现类
* ArrayList
* LinkedList
* Vector
* Stack
1. 关于ArrayList和LinkedList  
	* 他们都是List接口的实现类，都能实现元素的存储，以及List接口中定义的所有的方法
	* 区别
		* ArrayList底层实现是数组，查询效率高，增删效率低。
		* LinkedList底层实现是双链表，查询效率低，增删效率高
2. 关于数组和链表  
	* 他们都是常用的数据结构之一
	* 链表:  
		* 是常见数据结构之一。分为单链表和双链表（单向链表和双向链表）
		* 链表存储的特点  
			* 在链表中存储的每一个元素，地址是不连续的。区别于数组。
			* 每一个节点在存储的时候，除了存储要存储的值之外，还要再存  
				* 单链表：下一个节点的地址
				* 双链表：上一个节点的地址、下一个节点的地址。
### Collection框架
#### List接口的常用实现类
1. LinkedList、Vector、Stack
#### Collections
#### Set接口和Set接口常用的实现类
1. Set集合，是Collection框架中非常重要的一种集合
2. 特点  
	* 集合中存储的元素是不允许重复的。
	* HashSet中存储的元素顺序和添加顺序是不一致的。
	* 在Set集合中，没有下标的概念
3. set集合的去重规则：  
	* 需要有两个方法来辅助：hashCode() 、equals()
	* 先比较两个对象的hashCode()， 如果不同，则不是相同的对象
	* 如果hashCode()相同，再比较equals，如果equals也相同，则视为同一个对象
4. LinkedHashSet  
	* 是HashSet的子类，是由哈希表和链表实现的一个集合。这个集合中存储的元素是有序的（元素存储的顺序和添加的顺序是一致的）。但是：虽然说LinkedList集合中的元素是有序的，在这个集合中依然没有下标的概念。

#### TreeSet
1.  特点  
	* 这个集合是Set集合的实现类之一，所以具有所有的Set集合的共性：去重
	* 这个集合是一个自带排序的集合，元素在添加到集合中时，会自动的进行排序
2.  关于排序  
	* 无参的构造方法：要求存储的元素对应的类，需要实现Comparable接口。
	* TreeSet(Comparator<? extends E> c)` 在实例化一个TreeSet的同时，定制一个元素比较大小的规则
#### Map框架
1. Map<K,V>接口
2. Map中存储的元素，是以**键值对**的形式存在的。
	* 键值对：是由一个键（Key）和一个值（Value）组成的一种数据结构。
	* 在Map中，元素是一个个的键值对。一个键对应一个值。不允许一个键对应多个值，也不允许一个键没有值。
3. Map集合注意事项  
	* 在一个map中，不允许出现重复的Key
4. HashMap和Hashtable的区别  
	* Hashtable是线程安全的，HashMap是线程不安全的。
	* Hashtable的效率低，HashMap的效率高
	* HashMap允许以null作为键，Hashtable不允许以null作为键
	* HashMap是Map集合的新实现，父类是AbstractMap；Hashtable是老的实现，父类是Dictionary
	* 算法效率不同。HashMap的算法比Hashtable的效率高。
5. TreeMap: 是一个带有排序的集合。所谓的排序，在这里指的是按照Key进行排序
6. 这里的排序，与TreeSet基本相同  
	* 让Key对应的类去实现Comparable接口
	* 在实例化TreeMap的时候，设置一个Comparator接口实现类
#### 集合部分重点
1. **Collection部分**
	* **增、删、改、查**
	* **元素排序（自定义排序）**
		* **Comparable**
		* **Comparator**
	* **Set集合的去重（hashCode()、equals()）**
2. **Map**
	* **Map集合中存储的元素是键值对**
	* **增、删、改、查**
### File类
#### 定义
1. 这个类对一个文件（夹）的描述
2. 关于路径分隔符：  
	* 路径分隔符是对目录的分隔。表示一层嵌套关系  
	* 在windows系统下，分隔符是：`\`
	* 在UNIX体系下，分隔符是：`/`
#### 构造方法
1. File(String pathName)  使用一个指定的文件路径来实例化一个File对象         
2. File(String parent, String name) 给定一个父目录路径和一个子文件名字，系统会自动的将其拼接在一起
3. File(File parent, String child) 给定一个父目录和一个子文件的名字，系统自动拼接路径
#### 常用方法
1. boolean exists()  用来描述指定的路径下到底有没有文件（夹）存在。 
2. boolean isFile()  判断指定路径的内容是不是一个文件 
3. boolean isDirectory() 判断指定路径的内容是不是一个文件夹 
4. boolean mkdir()   在指定的路径创建文件夹，返回值代表创建成功还是失败 
5.  boolean mkdirs()  在指定的路径创建文件夹，可以创建多级目录       
6.  boolean createNewFile() 在指定的路径创建一个空文件，会有一个IOException 
7.   boolean isHidden() 判断一个文件是否是隐藏的     
### I/O流
#### 定义
1. IO : Iuput 、Output
2. 如果我们需要在程序中，进行文件的处理操作。（读取一个文件中的内容、向一个文件中写入内容）
#### 分类
1. 方向：输入流和输出流
2. 数据单元：字节流和字符流  
	* InputStream：		字节输入流
	* OutputStream：		字节输出流
	* Reader：			字符输入流
	* Writer：				字符输出流
3. 无论是使用什么流，在使用结束之后，一定要记得关闭这个流。
#### InputStream
1. `int read(byte[] arr)：`  
	* 参数：从流中读取数据，需要使用到一个字节数组。read方法会将读取到的数据填充到这个字节数组中。所以，读取完成后，我们直接从这个字节数组中取数据即可。
	* 返回值：每次读取数据后，返回这一次读取到了多少个字节的数据。如果这个方法返回值为-1，说明本次没有读取到任何数据，读取完成。
2. 
> ```java  
> // 先声明  
> InputStream is = null;  
> try {  
> 	// 实例化一个流  
> 	is = new FileInputStream(new File("file\\test"));  
> 	// InputStream: 字节输入流，数据是以字节为单位  
> 	// 从管道中读取数据：  
> 	// 实例化一个数组，用来存储每次读取到的数据  
> 	byte[] contents = new byte[100];  
> 	// 用来记录每次读取到了多少数据  
> 	int length = 0;  
> 	// 循环读取，将每次读取到的数据长度给length赋值，并判断是否为-1  
> 	while ((length = is.read(contents)) != -1 {    
> 		// 通过一个字节数组实例化一个字符串  
> 		String str = new String(contents, 0, length);  
> 		System.out.print(str);  
> 	}  

> } catch (FileNotFoundException e) {  
> 	e.printStackTrace();  
> } catch (IOException e) {  
> 	e.printStackTrace();  
> } finally {  
> 	// 判断是否为空，因为如果最开始实例化的时候，文件不存在，则is实例化失败，依然为null  
> 	// 此时，如果is是null，那么再去关闭的时候，就会出现NullPointerException  
> 	if (is != null) {  
> 		try {  
> 			is.close();  
> 		} catch (IOException e) {  
> 			e.printStackTrace();  
> 		}  
> 	}  
> }  
> ```  
### 缓冲流
#### 定义
1.  BufferedInputStream、BufferedOutputStream、BufferedReader、BufferedWriter  
2.  缓冲流：是一个用来操作文件的流，对咱们昨天学习的流进行了一个包装。在包装的类中，做了一个缓存数组。当我们在读取或者写文件的时候，直接和这个数组交互。最直观的一点体现：**缓冲流，由于这个缓冲数组的存在。他的效率比昨天学的流要高**
#### BufferInputStream、BufferedOutputStream:
1. 在实例化一个缓冲字节流的时候，构造方法需要有一个字节流  
2. 此时，这个字节流存在的意义，只是为了去实例化这个缓冲流。在使用完成后，缓冲流需要我们手动关闭。但是用来实例化这个缓冲流的字节流，我们不需要手动关闭。在缓冲流内部，已经实现了对其进行关闭的方法  
3. `BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("file\\test")));`  
4. `BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file\\out"));`
#### BufferReader、BufferedWriter ####
1. 构造方法和流的关闭部分：同上方字节流
### 转换流
#### InputStreamReader、OutputStreamWriter
1. 转换流：保留了字符流对文本进行操作时候的便利性，保留了字节流的安全性。产生的一种新的流，主要用来做关于文本文件的处理。还可以解决：关于采用了不同字符集的文本之间的处理问题。可以使用指定的字符集来读取一个文本，也可以使用指定的字符集来写一个文本。  
### 标准输入输出流
#### System.in、System.out
#### PraintStream
#### Scanner类
### 对象流
#### 定义
1. 将一个对象序列化和反序列化
#### 序列化
1. 将一个对象的信息（属性值）以文件的形式保存到磁盘上
#### 反序列化
1. 读取磁盘上的某一个文件信息，并将其解析为一个对象，并给这个对象的属性进行赋值
#### 注意事项
1. 需要序列化的类，要实现**Serializable**接口
2. 如果要序列一个集合，则要保证集合中的每一个元素都必须是**Serializable**接口的实现类对象
### Properties
#### 定义
1. 是一个集合。是Hashtable的子类
2. 是一个Map，存储的元素也是一个键值对。是将这些键值以一个文件的形式存储的
### NIO
#### 定义
1. NIO（New IO）
2. 从 JDK 1.4 开始引入的一个用来替代传统IO的API。NIO与传统的IO具有相同的作用，但是使用的方式是不一样的。NIO是面向缓冲区（Buffe）的、基于通道（Channel）
3. 从 JDK 1.7 开始加入了一些新的元素。被称作 NIO.2
#### NIO 和 IO区别
1. IO是面向流（Stream）的，NIO是面向缓冲区（Buffer）的
2. IO是阻塞型的，NIO是非阻塞型的
### 缓冲区Buffer
#### 定义
1. 是一个用来存储基本数据类型的容器。（类似一个数组）。
2. 按照其存储的数据类型不同，缓冲区有着不同的分类：（没有boolean）  
	* ByteBuffer、ShortBuffer、IntBuffer、LongBuffer、FloatBuffer、DoubleBuffer、CharBuffer  
3. 以上，这些缓冲区有着相同的方法来进行获取和数据的管理。因为所有以上的缓冲区都是继承自Buffer类的。
#### 常用属性和方法
1. 获取缓冲区：不是通过new的方式，而是通过静态方法 allocate(int capacity) 来获取缓冲区。
2. 属性  
	* capacity: 容量。表示缓冲区最多可以存储多少数据。一旦设置后，将不能改变  
	* limit: 界限。表示缓冲区可以操作的数据数量。（实际上存储了多少数据）。
	* position: 位置。缓冲区中正在进行操作的数据的位置。
	* mark: 使用mark()方法标记的位置。
		 * mark <= position <= limit <= capacity
3. 常用方法
	* put()：将数据放入缓冲区
	* get()：从缓冲区中获取数据
	* flip()：切换成读模式
	* rewind()：重新读取（position重置为0）
	* clear()：清空缓冲区。将缓冲区中limit和position重置为allocate之后的状态。
		* clear方法只是重置了一下标记，缓冲区中的数据还在。
	* mark()：在指定的position做一个标记
	* reset()：将position的位置重置为mark时指定的标记处
4. 直接缓冲区和非直接缓冲区：（了解）
	* 非直接缓冲区：通过allocate(int capacity)方法开辟的缓冲区，叫做非直接缓冲区。将缓冲区建立在JVM中。
	* 直接缓冲区：通过allocateDirect(int capacity)方法开辟的缓冲区，叫做直接缓冲区。将缓冲求建立在物理内存。效率高。只有ByteBuffer有。
### 通道Channel
#### 定义
1.  建立文件和程序的连接。在NIO中负责配合缓冲区进行数据的传输。通道本身是不具备数据传输功能的
2.  Channel是一个定义在 java.nio.Channels 包下面的接口，
#### 常用实现类
1. FileChannel：文件操作
2. SocketChannel、ServerSocketChannel、DatagramChannel
#### 获取通道
1. 可以使用支持通道的类，提供的方法 getChannel()  获取
	*  支持通道的类：
		* 本地IO：FileInputStream、FileOutputStream
		* 网络IO：Socket、ServerSocket、DatagramSocket
2. 在 JDK 1.7 之后 NIO.2 中，针对各种通过提供了静态方法 open()
3.  在 JDK 1.7 之后 NIO.2 中，Files工具类中 newByteChannel()
### 分散与聚合
#### 分散读取
> 将一个通道中的数据读取到多个缓冲区中。
#### 聚合写入
> 将多个缓冲区中的内容写入到一个通道中。
### 进程与线程
#### 前提基础
1. 串行：多个任务排成队，依次执行
2. 并发：多个任务同时执行。例如：一个电脑可以同时执行多个应用程序。但是在程序中，我们也会在很多种情况下使用到并发任务。例如：某些情况下，我们要执行的某一个任务可能耗时比较长。此时，我们不希望程序会因此而暂停，无法进行其他的操作，所以我们就希望可以在执行一个耗时长的任务的同时，再去进行其他的处理。
3. 在程序中实现并发：  
	* 最常用的两种方式：使用进程、使用线程。
4.  进程：程序执行需要用到所有资源的抽象描述
	* 一个进程可以理解为是一个程序，但是反之，一个程序就是一个进程，这句话是错误的
#### 线程
1. 线程是进程中的执行单元，一个进程可以包含多个线程，并且一个进程中至少有一个线程。（如果一个进程中没有线程了，那么这个进程会终止）。（一个进程在开辟完成后，会自动创建一个线程。这个线程叫做主线程，在主线程中开辟的所有的其他的线程叫做子线程）（线程与线程之间是并发的关系）。
2. 优点 
	* 让任务并发，可以提高程序的执行效率; 
	* 因为有时候要处理一些需要并发的任务，所以我们需要使用到线程。
3. 缺点
	* 线程的开辟需要消耗资源（内存）
	* 线程多了，每个线程能抢到的CPU时间片就短了
#### 开辟线程
1. 线程，在Java中，用**Thread**类来表示。
2. 开辟线程
	* 继承自Thread类，写一个Thread的子类。并且在这个子类中，重写run方法，在这个重写run方法中，定义这个线程需要执行的任务。
	* 实现Runnable接口，写一个Runnable接口的实现类。通过Thread类的构造方法Thread(Runnable r) 实例化一个Thread对象。此时，Runnable接口的实现类需要实现接口中的run方法。
3. 两种方式的对比
	* 使用继承Thread类的方式：
		* 优点：代码的可读性较强。
		* 缺点：单继承，如果一个类继承自Thread类，则无法再继承自其它类
	* 使用Runnable实现类的方式:
		* 优点：不会对类原有的继承关系造成影响。
		* 缺点：代码的可读性没有Thread子类高
4. 总结：更多情况下我们使用Runnable接口的实现类方式来开辟线程
5. 开启一个线程中的任务，需要使用的方法是：start()，而不是run()
6. 如果显示调用run方法，其实是将run中的任务，在当前的线程中执行了，而不会开辟新的线程
#### 线程使用的方法
1.  start()  开启一个线程。
2.  sleep(int timeMillus) 线程休眠。将线程休眠指定的时间。--静态方法
3.  currentThread()  获取当前线程。--静态方法
4.  getName()   获取一个线程的名字  
5.  setName(String name) 设置一个线程的名字   
6.  Thread(Runnable r, String name) 在实例化一个线程的同时，给他设置一个名字
7.  setPrivority(int c) 设置线程的优先级 
#### 线程的生命周期
1. 声明周期：指的是一个线程对象从最开始被实例化出来，到最后销毁。中间经历的种种的状态
2. New（新生态）：一个线程对象被实例化完成。此时这个线程处于新生态
3. Runnable（就绪状态）：调用start()，此时这个线程可以去争抢CPU时间片
4. Run（运行状态）：如果线程抢到CPU时间片，此时就是一个Run状态
5. Blocked（阻塞状态）：线程被挂起
6. Dead（死亡）

### 临界资源问题
#### 定义
1. 由于线程之间是资源共享的。如果有多个线程，同时对一个数据进行操作，此时这个数据会出现问题
#### 解决方法
1. 如果有一个线程在访问一个临界资源，在访问之前，先对这个资源“上锁”，此时如果有其他的线程也需要访问这个临界资源，需要先查这个资源有没有被上锁，如果没有被上锁，此时这个线程可以访问这个资源；如果上锁了，则此时这个线程进入阻塞状态，等待解锁。
	* 同步代码块  
		* 小括号：就是锁
		* 大括号：同步代码段，一般情况下，写需要对临界资源进行的操作
		* `synchronized () {}`
		* 关于同步锁：可以分成两种：对象锁、类锁
	* 同步方法  
		* 使用synchronized关键字修饰的方法就是同步方法
		* 将一个方法中所有的代码进行一个同步  
		* 相当于将一个方法中所有的代码都放到一个synchronized代码段中
		* 同步方法的锁  
			* 如果这个方法是一个非静态方法：锁是this
			* 如果这个方法是一个静态方法：锁是类锁（当前类.class）
		* private synchronized void sellTicket() {}  
	* 显式锁  
		* 就是一个类RenntrantLock
2. 在解决临界资源问题的时候，我们引入了一个"锁"的概念。我们可以用锁对一个资源进行保护。实际，在多线程的环境下，有可能会出现一种情况:**死锁**
### 线程池
#### 定义
1. ThreadPoolExecutor类是线程池最核心的类。这个类的构造方法中的几个参数：
	* int corePoolSize: 核心线程数量。核心池大小。
	* int maxmiunPoolSize: 线程池中最多的线程数量。
	* long keepAliveTime: 核心线程之外的临时线程，能存活的时间。（从这个线程空闲的时候开始算）
	* TimeUnit unit: 上面的时间单位
		* NANOSECONDS: 纳秒;MICROSECONDS: 微秒;MILLISEONDS: 毫秒;SECONDS: 秒;MINUTES: 分;HOURS: 时;DAYS: 天
	* BlockingQueue<Runnable> workQueue: 等待队列
		* ArrayBlockingQueue;LinkedBlockingQueue;SynchronousQueue
	* RejectedExecutionHandler handler：拒绝访问策略  
		* ThreadPoolExecutor.AbortPolicy: 丢弃新的任务，并抛出RejectedExecutionException  
		*  ThreadPoolExecutor.DiscardPolicy: 丢新新的任务，但是不会抛出异常  
		* ThreadPoolExecutor.DiscardOldestPolicy: 丢弃等待队列中最前面的任务，重新尝试执行任务  
		* ThreadPoolExecutor.CallerRunsPolicy: 由调用线程执行这个任务
2. 使用Executors工具类提供的工具方法




# 补充之Array工具类：  
提供针对数组Array的一些操作，比如排序，查找，将数组Array转换为列表List等，都为静态static方法 **方法调用均为Arrays.function();**   
数组(Array)与列表(List)可以相互转换，通过Arrays工具类的asList方法和List接口的toArray方法

1. **asList**：  
 * 语法：  
 `public static <T> List<T> asList(T... a)`  
 `{ return new ArrayList<>(a); }`  
  **注意**：此方法返回的ArrayList不是我们常用的集合类java.util.ArrayList;这里的ArrayList是Arrays的一个内部类java.util.Arrays.ArrayList；  
  * 返回的ArrayList数组是一个定长列表，没有add()/remove()方法，只能进行查看和修改(set方法)不能增加或者删除  
  `String[] str={"a","b","c"};`  
	`List<String> liststr=Arrays.asList(str);`  
  `System.out.println(liststr.toString());`//[a,b,c]
  * **基本数据类型是不能作为泛型的参数的，只有引用类型才可以**
  * 返回的列表ArrayList里面的元素都是引用，不是独立出来的对象  
  `liststr.set(0,"d");`  
	`System.out.printin(Arrays.toString(str));`//[d,b,c]  
	**修改集合的内容，原数组的内容也发生了变化，所以传入的是引用类型**  
  * **已知数组数据，快速获取一个可进行增删改查的列表List**：  
  `List<String> liststr=new ArrayList<>(Arrays.asList(str));`  
  `liststr.add("d");`  
  `System.out.println(liststr.size());`//4  
  * Arrays.List比较适合哪些已经有数组数据或者一些元素，而需要快速构建一个List，只用于读取操作，而不进行添加或者删除操作
2. **sort**：  
  * 用于数组排序，可对七种基本数据类型排序，还有Object类型(实现了Comparable接口)以及比较器Comparator
  * **基本数据类型**以 int[] num为例，会将原数组按照升序的顺序排列  
  `int[] num={1,5,9,4,8,6,7};`  
	`Arrary.sort(num);`
	`System.out.println(Arrays.toString(num))`//num变为{1,4,5,6,7,8,9}  
  * **对象类型数组**:可以实现Comparable接口，重写compareTo方法进行排序  
   `String[] str={"a","f","c","d"};`  
	`Array.sort(str);`  
	`System.out.println(Arrays.toString(str));`//[a,c,d,f]  
	**String类型实现了Comparable接口，内部的compareTo方法是按照字典码进行比较的**  
  * 没有实现Comparable接口的(一般都是自定义类)，可以通过Comparator<T>实现排序(通过内部类/兰布达表达式)
3. **binarySearch**：  
 * 查找数组中的某个元素，可用于各种基本数据类型以及对象  
 二分法是对**有序数组**的元素查找(比如先用Arrays.sort()进行排序，然后调用此方法进行查找)；找到元素返回下标，没找到返回-1  
 `System.out.println(Arrary.binarySearch(num,5));`//返回元素的下标1 **元素下标从0开始算起**  
4. **copyOf和copyOfRange**：  
  * 拷贝数组元素，底层采用System.arraycopy()实现，是一个native方法;System.arraycopy()方法是一个浅拷贝；对象数组的拷贝，只是拷贝了对象的引用，并没有重新new每一个对象
  * 语法：public static native void arraycopy(Object src,int srcPos,Object dest,int destPos,int length);  
  src:源数组 ；srcPos:源数组要复制的起始位置; dest:目的数组; destPos:目的数组放置的其实位置；length:复制的长度  
	**src和dest都必须为同类型或者可以进行转换类型的数组**  
  * `int[] num1={1,2,3};int[] num2=new int[3];`  
   `System.arraycopy(num1,0,num2,0,num1.length);`  
	`System.out.println(Arrays.toString(num2));`//[1,2,3]  
  * copyOf(T[] original,int newLength) 返回值为T[]  
    copyOfRange(T[] original,int from,int to) 返回值为T[]
5. **equals**:  
 * 用来比较两个数组中对应位置的每个元素是否相等；八种基本数据类型以及对象都能比较
 * boolean equals(int[] n1,int[] n2);/ boolean equals(Object o1,Object o2);
 * 过程：比较引用是否相同(==)；比较是否有NULL；比较长度是否相同；挨个比较元素
6. **fill**：  
 * 用于给数组赋值，并能指定某个范围**[)**赋值
 * void fill(int[] a,val);void fill(int[] a,int fromIndex,int toIndex,int val)
7. **toString**:  
 * 用来打印一维数组的元素；基本数据类型以及Object类型均可以
 * String toString(int[]/Object[] a);通过创建StringBuilder，调用append方法实现
8. **hashCode**：  
9. **parallelSort**:  
 * 对指定下标范围内的元素**[)**进行指定排序方法的排序
 * `Arrays.parallelSort(array,0,4,(x,y)->y.compareTo(x));`

# 补充之String-StringBuffer-StringBuilder类详解：
## 原理解释：
1. **String类初始化后是不可变的(immutable)**：  
 * String使用private final char value[]来实现字符串的存储，也就是说String对象创建之后，就不能再修改对象中存储的字符串内容，因此String类型是不可变的；  
 * String类对象有编辑字符串的功能，比如replace()，这些编辑功能是通过创建一个新的对象来实现的，并不是对原有对象进行的修改
2. **引用变量和对象**：  
 * 例：A aa;此语句声明一个类A的引用变量aa(也可以称之为句柄)，而对象一般通过new创建，所以aa并不是对象
3. **常见字符串的方式**：  
 * 使用""引号创建字符串；单独使用此方法创建的字符串都是常量，编译器就已经确定存储到String Pool中
 * 使用new关键字创建字符串；使用该方法创建的对象会存储到heap(堆)中，是在运行时新创建的；*new创建字符串时首先查看池中是否有相同值的字符串，如果有，则拷贝一份到堆中，然后返回堆中的地址；如果池中没有，则在堆中创建一份，然后返回堆中的地址；****此时不需要从堆中复制到池中，否则，将使得堆中的字符串永远都是池中的子集，导致浪费池的空间***
 * 使用只包含常量的字符串连接符如"aa"+"aa"创建的也是常量，编译期就能确定，已经确定存储到String Pool中
 * 使用包含变量的字符串连接符如"a"+s1创建的对象是在运行期才创建的，所以存储在heap中
4. **使用String不一定创建对象**:  
 * 执行到双引号包含字符串的语句时，如String a="123"，JVM会先到常量池中查找，若有的话返回常量池中的这个实例的引用，否则的话创建一个新实例并置入常量池中(**双引号内的会置入常量池，new的不置入吗？**)，因此，可能并没有创建对象而只是指向了一个先前已经创建的对象
5. **使用new String，一定会创建对象**：  
  * 执行String a=new String("123")时，先走常量池取得一个实例的引用，再在堆上创建一个新的String实例，走相应的String构造函数，将实例引用赋值给a；此过程中虽然新创建了一个String的实例，但是Value是等于常量池中的实例的value，即并没有new一个新的字符数组来存放"123"
6. **关于equals和==**：  
 * 对于==：若作用于基本数据类型的变量（8个），则直接比较其存储的‘值’是否相等；若作用于引用类型的变量(String)，则比较的是所指向的对象的地址（即是否指向同一个对象--双引号代表的一般是常量池中对象的地址，new方法代表的一般是堆上对象的地址）
 * equals方法：是基类Object中的方法，因此对于所有的继承于Object的类都会有该方法；在Object类中，equals方法是用来比较两个对象的引用是否相等，即是否指向同一个对象
 * 对于equals方法，并不作用于基本数据类型的变量；如果没有对equals方法进行重写，则比较的是引用类型的变量所指向的对象的地址；而String类对equals方法进行了重写，用来比较字符串对象所存储的字符串是否相等；其他的一些类如Date，Double，Integer等都对equals进行了重写用来比较执指向的对象所存储的**内容**是否相等
7. **String相关的+**：  
 * 字符串连接是从左向右依次进行的，首先以最左边的字符串为参数创建StringBuilder对象，然后依次对右边进行append操作，最后将StringBuilder对象通过toString()方法转换成堆上的一个String对象（中间的多个字符串常量并不会自动拼接），最后将刚生成的String对象的堆地址存放在变量c中
 * 即String c="xx"+"yy"+str1+"zz"+"mm"+str2;实质上的实现过程是：String c=new StringBuilder("xxyy").append(str1).append("zz").append("mm")+append(str2).toString();
 * 所以，当进行+进行多个字符串连接时，实际上是产生了一个StringBuilder对象和String对象
8. **String的不可变性导致字符串变量使用+的代价**：  
  + 凡是+两边有一方不是双引号形式的，都会导致只能在运行期执行，例s+="a";在该语句中，每做一次+就需要产生一个StringBuilder对象，然后append后就扔掉，若在循环中则下次循环到达时会重新产生一个StringBuilder对象，然后append字符串，如此循环直至结束。
  + 若直接采用StringBuilder对象进行append的话，可以节省N-1次创建和销毁对象的时间
  + 所以在循环中要进行字符串连接的应用一般都是用StringBuilder或者StringBuffer对象来进行append操作
9. **String、StringBuffer、StringBuilder的区别**：
 + String为不可变字符串对象；StringBuffer和StringBuilder是可变字符串对象（即其内部的字符数组长度可变）
 + 是否多线程安全：String中的对象是不可变的，也就可以理解为常量，显然线程安全；StringBuffer与StringBuilder中的方法和功能完全是等价的，只是StringBuffer中的方法大都采用了synchronized关键字(同步)进行修饰，因此是线程安全的；StringBuilder没有这个修饰，可以被认为是非线程安全的
 + 执行效率：StringBuilder>StringBuffer>String ；当然这个是相对的，不一定在所有情况下都是这样；当字符串相加操作或者改动较少的情况下，建议使用String str="hello"这种形式；当字符串相加操作较多时，建议使用StringBuilder，如果使用了多线程，则使用StringBuffer
10. **String中的final用法和理解**：  
 * final只对引用的“值”（即内存地址）有效，它迫使引用指向初始指向的那个对象，改变它的指向会导致编译期错误。代码示例:
 		```
	final StringBuffer a = new StringBuffer("111");  
	final StringBuffer b = new StringBuffer("222");\n
	a=b;//此句编译不通过
	final StringBuffer a = new StringBuffer("111");
	a.append("222");//编译通过
		```
11. **String str=new String("abc")创建了多少个对象**:  
 * new只调用了一次，即只创建了一个对象；这段代码在运行期间确实只创建了一个对象，即在堆上创建了"abc"对象；
 * 该段代码执行过程和类的加载过程是有区别的：在类的加载过程中，确实会在常量池中创建一个"abc"对象，而在代码执行过程中却是只创建了一个String对象。故在代码执行过程中涉及到了两个类但只创建了一个String对象
12. **字符串池的优缺点**：  
 * 优点：避免了相同内容的字符串的创建，节省了内存，省去了创建相同字符串的时间，同时提升了性能
 * 缺点：牺牲了JVM在常量池中遍历对象所需要的时间，不过其时间成本相对而言比较低
13. **补充**：
 * 运行期内的两个String对象相加，会产生新的对象，新对象存储在堆heap中
 * String类是final类，不可被继承，其成员方法都默认为final方法
 * String类其实是通过char数组来保存字符串的
 * java中的常量池，实际上分为两种：静态常量池和运行时常量池；静态常量池即*.class文件中的常量池，不仅包含字符串(数字)字面量，还包含类，方法的信息，占用class文件绝大部分空间；运行时常量池，则是JVM虚拟机在完成类装载操作后，将class文件中的常量池载入到内存中，并保存在方法中；我们常说的常量池，就是指方法区中的运行时常量池。
 * JVM对String str="abc"对象放在常量池中是在编译时做的；而String=str1+str2是在运行时才知道的，new对象也是在运行时才做的
 * 字面量+拼接是在编译期间进行的，拼接后的字符存放在字符串池中；而字符串引用的+拼接运算是在运行时进行的，新创建的字符串放在存堆中

# 补充之String-StringBuilder-StringBuffer类常用方法：
## String常用类--学会连点法：
1. **求字符串长度**：  
public int length()  //返回字符串的长度
2. **求字符串某一位置**：  
public char charAt(int index) //返回字符串中指定位置的字符；**注意字符串中第一个字符索引是0，最后一个是length()-1**
3. **提取子串**：  
用String类的substring方法可以提取字符串中的子串，该方法有两种常用参数：
 * public String substring(int beginIndex)//该方法从beginIndex位置起，从当前字符串中取出剩余的字符作为一个新的字符串返回
 * public String substring(int beginIndex,int endIndex)//该方法从beginIndex位置起，从当前字符串中取出到**endIndex-1**位置的字符作为一个新的字符串返回  
4. **字符串比较**：
 * public int compareTo(String anotherString)//该方法是对字符串内容按字典顺序进行大小比较，通过返回的整数值指明当前字符串与参数字符串的大小关系；若当前对象比参数对象大则返回正整数，反之返回负整数，相等返回0
 * public int compareToIgnore(String anotherString)//与compareTo方法相似，但忽略大小写
 * public boolean equals(Object anotherObject)//比较当前字符串和参数字符串，在两个字符串相等的时候返回true，否则返回false
 * public boolean equalsIgnoreCase(String anotherString)//与equals方法相似，但忽略大小写
5. **字符串连接**:  
public String concat(String str)//将参数中的字符串str连接到当前字符串的后面，效果等价于+
6. **字符串中单个字符查找**：
 * public int indexOf(int ch);public int indexOf(String str)//用于查找当前字符串中字符或者子串，返回字符或者子串在当前字符串中从左边起首次出现的位置，若没有出现则返回-1
 * public int indexOf(int ch,int fronIndex);public int indexOf(String str,int fromIndex)//该方法与第一条类似，区别在于该方法从fromIndex位置向后查找
 * public int lastIndexOf(int ch);public int lastIndexOf(String str)//该方法与第一种类似，区别在于该方法从字符串的末尾位置向前查找
 * public int lastIndexOf(int ch,int fromIndex);public int lastIndexOf(String str,int fromIndex)//该方法与第二种类似，区别在于该方法从fromIndex位置向前查找
7. **字符串中字符的大小写转换**：
 * public String toLowerCase()//返回将当前字符串中所有字符转换成小写后的新串
 * public String toUpperCase()//返回将当前字符串中所有字符串转换成大写后的新串
8. **字符串中字符的替换**：
 * public String repalce(char oldChar,char newChar)//用字符newChar替代字符串中所有的oldChar字符，并返回一个新的字符串
 * public String repalceFirst(String regex,String replacement)//该方法用字符replacement的内容替换当前字符串中遇到的第一个和字符串regex相匹配的子串，应将新的字符串返回
 * public String replaceAll(Sring regex,String replacement)//该方法用字符replacement的内容替换当前字符串中遇到的所有和字符串regex相匹配的子串，应将新的字符串返回
9. **其它类方法**：
 * String trim()//去除字符串两端的空格，对于中间的空格不做处理
 * boolean startWith(String prefix);boolean endWith(String suffix)//用来比较当前字符串的起始字符或者子字符串prefix和终止字符或者子字符串suffix是否和当前字符串相同，重载方法中同时还可以指定比较的开始位置offset
 * regionMatches(boolean b,int firstStart,String other,int otherStart,int length)//从当前字符串的firstStart位置开始比较，取长度为length的一个子字符串，other字符串从otherStart位置开始，指定另外一个长度为length的字符串，两字符串比较，当b为true时字符串不区分大小写
 * contains(String str)//判断参数str是否被包含在字符串中，并返回一个布尔类型的值(true/false)
 * String[] split(String str)//将str(双引号内的内容)作为分隔符进行字符串分解，分解后的子字符串在字符串数组中返回
## 字符串与基本类型的转换：
1. **字符串转换为基本类型**：java.lang包中有Byte,Short,Float,Double类的调用方法：
 * public static byte parseByte(String s)
 * public static short parseShort(String s)
 * public static short parseInt(String s)
 * public static long parseLong(String s)
 * public static float parseFloat(String s)
 * public static double parseDouble(String s)  
 `double d=Double.parseDouble("1.123");`
2. **基本类型转换为字符串类型**：String类中提供了String valueOf()方法，用作基本类型转换为字符串类型
 * static String valueOf(char data[])
 * static String valueOf(char data[],int offset,int count)
 * static String valueOf(boolean b)
 * static String valueOf(char c)
 * static String valueOf(int i)
 * static String valueOf(long l)
 * static String valueOf(float f)
 * static String valueOf(double d)  
 `String s1=String.valueOf(123);`
3. **进制转换**：使用Long类中的方法得到整数之间的各种进制转换的方法：
 * Long.toBinaryString(long l)
 * Long.toOCtalString(long l)
 * Long.toHexString(long l)
 * Long.toString(long l,int p)//转为P进制数
## StringBuffer常用方法：
1. **StringBuffer类概述**：
 * 对字符串进行拼接，每次拼接都会构造一个新的String对象，既耗时又浪费空间；StringBuffer可以解决此问题
 * 线程安全的可变字符序列
 * 长度和内容可变；String则均不可变
2. **构造方法**：
 * public StringBuffer():无参构造;**默认容量为16**
 * public StringBuffer(int capacity):指定容量的字符串缓冲区对象
 * public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
3. **StringBuffer的方法**：
 * public int capacity():返回当前容量，理论值
 * public int length():返回长度(字符数)，实际值
4. **StringBuffer类的成员方法**：
 1. **添加**：
 		* public StringBuffer append(String str):可以把任意类型数据添加到字符串缓冲区里面，并返回字符串缓冲区本身  
 		`StringBuffer sb=new StringBuffer();`  
		`sb.append("hello").append(" dog");`
 		* public StringBuffer insert(int offset,String str):在指定位置把任意类型的数据插入到字符串缓冲区里面，并返回字符串缓冲区本身  
 		  `sb.insert(5,"hi");`
 2. **删除**：
  		* public StringBuffer deleteCharAt(int index):删除指定位置的字符，并返回本身，**从0开始计数**  
  		`sb.deleteCharAt(3);`
  		* public StringBuffer delete(int start,int end):删除从指定位置开始到指定位置结束的内容，并返回本身，**范围[)**  
  		`sb.delete(1,3);`
 3. **替换**：
  		* public StringBuffer replace(int start,int end,String str):使用给定String中的字符串替换词序列的子字符串中的字符  
  		`sb.replace(2,7,"xrr");`//用xrr替换源字符串中的五个字符
 4. **反转**：
 		* public StringBuffer reverse():将此字符序列用其反转形式取代，并返回对象本身  
 		`sb.reverse();`//sb会有原来的"123"变为"321"；
 5. **截取**：
  		* public String substring(int start):返回一个新的String，它包含此字符序列当前所包含的字符子序列  
  		`String str=sb.substring(5);`
  		* public String substring(int start,int end):返回一个新的String，它包含此序列当前所包含的字符子序列
  		`String str=sb.substring(5,10);`
  		* 返回值类型为**String类型**，本身没有发生改变
 6. **String与StringBuffer的转换**：
  		* 不能把字符串的值直接赋值给StringBuffer
  		* String转StringBuffer：通过构造方法；通过append方法
  		* StringBuffer转String：通过toString()方法
 7. **StringBuilder**：
 		* 用在字符串缓冲区被单个线程使用的时候（这种情况很普遍）。如果可能，建议优先采用该类，因为在大多数实现中，它比 StringBuffer 要快
 8. **形式参数问题**：
 		* String 和 StringBuilder均为引用类型
 		* String作为参数传递，效果和基本类型作为参数传递是一样的；作为形参是不会改变实参的
 		* StringBuffer作为形参，如果直接赋值(即使用=)则不会影响实参，但是如果是使用方法改变形参则会影响实参

# 补充之正则表达式：
判断一个字符串是否和指定的正则规则匹配：`boolean ret = "hello world".matches("hello world");`
## 基本语法：
1. ^: 用来匹配一个字符串的开头 `System.out.println("hello world".matches("^hello world"));`
2. $：用来匹配一个字符串的结尾 `System.out.println("hello world".matches("hello world$"));`
3. 如果需要对一个字符串进行完整的校验, 最好把^和$都加上去 `System.out.println("hello world".matches("^hello world$"));`
4. []: 表示用来匹配一位字符
	1. [abc]: 表示这一位字符可以是a，也可以是b，也可以是c `System.out.println("aello world".matches("^[abch]ello world$"));`
	2. [a-z]: 表示这一位字符可以是所有的小写字母 [a, z]  `System.out.println("aello world".matches("^[a-z]ello world$"));`
	3. [a-zABC]: 表示这一位字符可以是所有的小写字母，或者A，或者B，或者C `System.out.println("Bello world".matches("^[a-zABC]ello world$"));`
	4. [a-zA-Z]: 表示这一位字符可以是所有的大小写字母
	5. [a-zA-Z0-9]: 表示这一位字符可以是所有的大小写字母或者数字
	6. [^a]: 表示这一位字符可以是任意的字符，唯独不是a `System.out.println("aello world".matches("^[^a]ello world$"));`
	7. [^abc]: 表示这一位是除了a、b、c之外的任意字符
	8. **[^a-z[h-w]]:**  `System.out.println("uello world".matches("^[^a-z[h-w]]ello world$"));`
5. .: 是一个通配符，可以匹配任意的字符 
	`System.out.println("hello world".matches("^.ello world$"));`
6. \: 是一个转义字符，备注：因为这个符号在字符串中也是一个转义字符，所以我们需要再加一个转义
	`System.out.println("hello world".matches("^hello\\.world$"));`
7. \d: [0-9] 可以匹配任意的数字; 
	`System.out.println("hello world1".matches("^hello world\\d$"));` 
8. \D: [^0-9] 可以匹配任意的非数字
9. \w: 可以匹配任意的一个单词字符 [a-zA-Z0-9_]
10. \W: 可以匹配任意的一个非单词字符
11. + : 前面的一位或者一组字符连续出现了1次或多次
12. ? : 前面的一位或者一组字符连续出现了1次或0次
13. \* : 前面的一位或者一组字符连续出现了0次或多次(包含1次)
	`System.out.println("hello world".matches("^hel+o world$"));`
	`System.out.println("hello world".matches("^hell?o world$"));`
	`System.out.println("helo world".matches("^hel*o world$"));`
	`System.out.println("hello world".matches(".*"));`
14. {}次数限制：
	1. {m}  前面的一位或者一组字符，连续出现了m次
	2. {m,}	前面的一位或者一组字符，连续出现了至少m次	
	3. {m,n}	前面的一位或者一组字符，连续出现了至少m次，最多n次
	`System.out.println("hello world".matches("^hel{2,5}o world$"));`
15. ()分组：可以将一个字符串按照指定的规则进行分组


# 补充之泛型：
## 概述
1. **定义**：泛型即参数化类型；就是将类型由原来的具体的类型参数化，类似于方法中的变量参数，此时类型也定义为参数类型(类型形参)，然后在使用/调用时传入具体的类型(类型实参)
2. **为什么使用泛型**：泛型的本质是为了参数化类型(在不创建新类型的情况下，通过泛型指定的不同类型来控制形参具体限制的类型，即在泛型使用过程中，操作的数据类型被指定为一个参数，这种参数类型可以用在类，接口和方法中，分别被称为泛型类，泛型接口，泛型方法)
##特性
1. 泛型只在编译阶段(与之相对的是运行阶段)有效；在编译之后程序会采取去泛型化的措施；也就是说java中的泛型，只在编译阶段有效。在编译过程中，正确检验泛型结果之后，会将泛型的相关信息擦除，并且在对象进入和离开方法的边界处添加类型检查和类型转换的方法。即泛型信息不会进入到运行时阶段。  
**泛型类型在逻辑上可以看成是多个不同的类型，实际上都是相同的基本类型**
## 泛型的使用
### 泛型类
1. 用于类的定义中，通过泛型可以完成对一组类的操作对外开放相同的接口；最典型的就是各种容器类，如List、Set、Map
2. 泛型类的基本写法： class 类名 <泛型标识符>{}
3. 泛型的类型参数只能是类类型(包括自定义类)，不可以是简单类型
4. 传入的实参类型需与泛型的类型参数类型相同  
	`Generic<Integer> genI=new Generic<Integer>(123456);`  
	`Generic<String> genS=new Generic<String>("key");`
5. 定义的泛型类，不一定要传入泛型类型实参；在使用泛型的时候如果传入泛型实参，则会根据传入的泛型实参做相应的限制，此时泛型才会起到本应该起到的限制作用。如果不传入泛型类型实参的话，在泛型类中使用泛型的方法/成员变量定义的类型可以为任何的类型  
	`Generic gen1=new Genetic(55.55);`
6. 泛型的类型参数只能是类类型，不可以是简单类型  
   不能对确切的泛型类型使用instanceof操作：  
	`if(ex_num instanceof Generic<Number>){}`//编译时会出错
### 泛型接口
1. 泛型接口常被用于各种类的生产器中：  
 * 定义：`public interface Generator<T>{ public T next(); }`
2. 当实现泛型接口的类未传入泛型实参时：  
	此时与泛型类的定义相同，在声明类的时候，需要将泛型的声明也一起加到类中  
	即`class FruitGenerator<T> implements Generator<T>`  
	如果不声明泛型，如`class FruitGenerator implements Generator<T>`,编译器会报错：Unknown class  
	`{public T next(){return null;}}`
3. 当实现泛型接口的类，传入泛型实参时：  
	定义一个生产器实现这个接口时，虽然我们只创建了一个泛型接口Generator<T>  
	但是我们可以为T传入无数个实参，形成无数种类型的Generator接口  
	在实现类实现泛型接口时，若已将泛型类型传入实参类型，则所有使用泛型的地方都要替换成传入的实参类型  
	即`public class FruitGenerator implements Generator<String>`  
	`{String fruits="apple";public String next(){return fruits;}}`  
### 泛型通配符
* Integer是Number的一个子类，但是在使用Generic<NUmber>作为形参时，不能使用Generic<Intefer>的实例传入，即Generic<Integer>不能被看做Generic<Number>的子类；  
* 同一种泛型可以对应多个版本(因为参数类型是不确定的),不同版本的泛型类实例是不兼容的
* 类型通配符一般是使用**？**代替具体的**类型实参**，此处，**？**是类型实参，可以把？看成所有类型的父类
* 可以解决当具体类型不确定的时候，这个通配符就是？;  
	当操作类型不需要使用类型的具体功能时，只使用Object类中的功能时，可以用？通配符表示未知类型
###  泛型方法
1. 大多数泛型类中的成员方法也都使用了泛型，有的甚至泛型类中也包含着泛型方法；  
	泛型类：是在实例化类的时候指明泛型的具体类型  
	泛型方法：是在调用方法的时候指明泛型的具体类型
2. **泛型方法的基本用法：**
	* public 与返回值中间<T>非常重要，可以理解为声明此方法为泛型方法
	* 只有声明了<T>的方法才是泛型方法，泛型类中的使用了泛型的成员方法并不是泛型方法
	* <T>表明该方法将使用泛型类型T，此时才可以在方法中使用泛型类型T
	* 与泛型类定义一样，此处可以随便写为任意标志符，如T，E，K，V
	* `public T getKey(){return key;}`  
		虽然在方法中使用了泛型，但是这并不是一个泛型方法；  
		这只是类中一个普通的成员方法，只不过他的返回值是在声明泛型类已经声明过的泛型  
		所以在这个方法中才可以继续使用T这个泛型
	* `public E setKey(E key){this.key=key;}  
		此方法是有问题的，编译器`会给我们提示错误信息"cannot reslove symbol E"  
		因此在类的声明中并未声明泛型E，所以在使用E做形参和返回值类型时，编译器会无法识别
	* `public <T> T showKeyName(Generic<T> container)`  
		这是真正的泛型方法；首先public与返回值之间的<T>必不可少，这表明这是一个泛型方法，并且声明了一个泛型T  
		这个T可以出现在这个泛型方法的任意位置；泛型的数量可以为任意多个  
	* `public void showkey(Generic<?> obj)`  
		这不是一个泛型方法，只是使用了泛型通配符？ 
	* `public <T> T showKey(Generic<E> container)`  
		这个方法是有问题的，编译器提示错误信息：“UnKnown class 'E'”  
		虽然声明了<T> ,也表明了一个可以处理泛型的类型的泛型方法  
		但是只声明了泛型类型T，并未声明泛型类型E，因此编译器并不知道该如何处理E这个类型
3. **类中的泛型方法**：
 * 因为泛型方法在声明的时候后声明泛型<E>，因此即使在泛型类中并为声明泛型，编译器也能够正确识别泛型方法中的泛型
 * 若在泛型类中声明了一个泛型方法，也使用了泛型T，则这个T是一种全新的类型，可以和泛型类中声明的T不是同一种类型
4. **静态方法与泛型**：
 * 在类中的静态方法使用泛型：静态方法无法访问类上定义的泛型；若果静态方法操作的引用数据类型不确定的时候，必须要将泛型定义在方法上；即如果静态方法要使用泛型的话，必须将静态方法也定义为泛型方法
 * 如果在类中定义使用泛型的静态方法，需要额外的泛型声明(将这个方法定义为泛型方法)；即使静态方法要使用泛型类中已经声明过的泛型也不可以  
 	`public static void show(T t){...}`//编译器会提示错误
 * 正确方法为：`public static <T> void show(T t){...}`
5. **泛型方法总结**：
 * 泛型方法能使方法独立于类而产生变化，基本指导原则：  
 	无论何时，如果可以做到，那就应该尽量使用泛型方法；即如果使用泛型方法将整个类型泛型化，则应该使用泛型方法；对于一个static的方法，无法访问泛型类型的参数，所以如果static方法要使用泛型能力，就必须使其成为泛型方法
6. **泛型上下边界**：
 * 使用泛型时，还可以为传入的**泛型类型实参**进行上下边界的限制,如类型实参只准传入某种类型的父类/子类；  
 	为泛型添加上边界，即传入的类型实参必须是指定类型的子类型
 * 泛型的上下边界添加，必须与泛型的声明在一起：  
 	在**泛型方法**添加上下边界限制的时候，必须在权限声明和返回值之间的<T>上添加上下界，记载泛型声明的时候添加：  
	`public <T extends Number> T showKey(Generic<T> container);`
### 泛型数组：
 * 在java中是不能创建一个确切的泛型类型的数组的；而使用通配符创建泛型数组是可以的；  
 	`list<String>[] ls=new ArrayList<String>[10];`//错
	`List<?>[] ls=new ArrayList<?>[10];`//对
	`List<String>[] ls= new ArratList[10]`//对  
	因为JVM泛型的擦除机制，在运行时JVM是不知道泛型信息的，使用通配符的方式，最后取出数据如果需要类型转化的话是要做显示类型转换的
### 补充
1. 通过List<String>，直接限定了list集合中只能含有String类型的元素


# 补充之集合概述
## 各个接口之间的关系：
![](https://i.imgur.com/igXCCcp.jpg)
![](https://i.imgur.com/JkLjr6Y.jpg)
## collection接口
Collection是最基本的集合接口，不提供直接的实现；    
在Java中所有实现了Collection接口的类都必须提供两套标准的构造函数，一个是无参的，用于创建一个空的Collection，一个是带有Collection参数的有参构造函数，用于创建一个新的Collection，这个新的Collection与传入进来的Collection具备相同的元素。 
![](https://i.imgur.com/a6oEDqO.png)
![](https://i.imgur.com/Or68DAf.png)
## List接口
List接口为Collection直接接口。List所代表的是有序的Collection，即它用某种特定的插入顺序来维护元素顺序  
可以根据元素的整数索引（在列表中的位置）访问元素，并搜索列表中的元素  
实现List接口的集合主要有：ArrayList、LinkedList、Vector、Stack。
###ArrayList
ArrayList是一个动态数组；  
允许任何符合规则的元素插入甚至包括null。每一个ArrayList都有一个初始容量（10），该容量代表了数组的大小；  
在每次向容器中增加元素的同时都会进行容量检查，当快溢出时，就会进行扩容操作；  
所以如果明确所插入元素的多少，最好指定一个初始容量值，避免过多的进行扩容操作而浪费时间、效率；  
size、isEmpty、get、set、iterator 和 listIterator 操作都以固定时间运行；  
add 操作以分摊的固定时间运行，也就是说，添加 n 个元素需要 O(n) 时间（由于要考虑到扩容，所以这不只是添加元素会带来分摊固定时间开销那样简单）；  
ArrayList擅长于随机访问。同时ArrayList是非同步的；
### LinkedList
LinkedList是一个双向链表；  
除了有ArrayList的基本操作方法外还额外提供了get，remove，insert方法在LinkedList的首部或尾部；  
LinkedList不能随机访问，它所有的操作都是要按照双重链表的需要执行；  
在列表中索引的操作将从开头或结尾遍历列表（从靠近指定索引的一端）。这样做的好处就是可以通过较低的代价在List中进行插入和删除操作。   
LinkedList也是非同步的。如果多个线程同时访问一个List，则必须自己实现访问同步。一种解决方法是在创建List时构造一个同步的List：  List list = Collections.synchronizedList(new LinkedList(...));  
### Vector
Vector是同步的。所以说Vector是线程安全的动态数组。它的操作与ArrayList几乎一样。
### Stack
Stack继承自Vector，实现一个后进先出的堆栈；  
Stack提供5个额外的方法使得Vector得以被当作堆栈使用；  
基本的push和pop 方法，还有peek方法得到栈顶的元素，empty方法测试堆栈是否为空，search方法检测一个元素在堆栈中的位置；  
Stack刚创建后是空栈  
![](https://i.imgur.com/pP95dDM.png)
![](https://i.imgur.com/TWwQqD7.png)
## Set接口
Set是一种不包括重复元素的Collection。它维持它自己的内部排序，所以随机访问没有任何意义；  
与List一样，它同样运行null的存在但是仅有一个；   
所有传入Set集合中的元素都必须不同，同时要注意任何可变对象，如果在对集合中元素进行操作时，导致e1.equals(e2)==true，则必定会产生某些问题；  
实现了Set接口的集合有：EnumSet、HashSet、TreeSet。  
### EnumSet
是枚举的专用Set。所有的元素都是枚举类型
### HashSet
HashSet堪称查询速度最快的集合，因为其内部是以HashCode来实现的；  
内部元素的顺序是由哈希码来决定的，所以它不保证set 的迭代顺序；特别是它不保证该顺序恒久不变；  
![](https://i.imgur.com/VMrT8Rs.png)
![](https://i.imgur.com/l5kp9zq.png)
## Map接口
由一系列键值对组成的集合，提供了key到Value的映射，也没有继承Collection；  
在Map中它保证了key与value之间的一一对应关系。也就是说一个key对应一个value，所以它不能存在相同的key值，当然value值可以相同；  
实现map的有：HashMap、TreeMap、HashTable、Properties、EnumMap。  
### HashMap
以哈希表数据结构实现，查找对象时通过哈希函数计算其位置，它是为**快速查询**而设计的；  
其内部定义了一个hash表数组（Entry[] table），元素会通过哈希转换函数将元素的哈希地址转换成数组中存放的索引；  
如果有冲突，则使用散列链表的形式将所有相同哈希地址的元素串起来，可能通过查看HashMap.Entry的源码它是一个单链表结构
### TreeMap
键以某种排序规则排序，内部以red-black（红-黑）树数据结构实现，实现了SortedMap接口；
### HashTable
也是以哈希表数据结构实现的，解决冲突时与HashMap也一样也是采用了散列链表的形式，不过性能比HashMap要低  
![](https://i.imgur.com/qR9qLwo.png)
![](https://i.imgur.com/uFWk2So.png)
## 总结
### List
#### ArrayList
1. 以数组实现。节约空间，但数组有容量限制  
	超出限制时会增加50%容量，用System.arraycopy（）复制到新的数组  
	默认第一次插入元素时创建大小为10的数组
2. 按数组下标访问元素－get（i）、set（i,e） 的性能很高，这是数组的基本优势；  
3. 如果按下标插入元素、删除元素－add（i,e）、 remove（i）、remove（e），则要用System.arraycopy（）来复制移动部分受影响的元素，性能就变差了；  
	越是前面的元素，修改时要移动的元素越多；  
	直接在数组末尾加入元素－常用的add（e）；  
	删除最后一个元素则无影响
#### LinkedList
1. 以双向链表实现  
	链表无容量限制，但双向链表本身使用了更多空间，每插入一个元素都要构造一个额外的Node对象，也需要额外的链表指针操作
2. 按下标访问元素－get（i）、set（i,e） 要悲剧的部分遍历链表将指针移动到位 （如果i>数组大小的一半，会从末尾移起）
3. 插入、删除元素时修改前后节点的指针即可，不再需要复制移动。但还是要部分遍历链表的指针才能移动到下标所指的位置；  
4. 只有在链表两头的操作－add（）、addFirst（）、removeLast（）或用iterator（）上的remove（）倒能省掉指针的移动；  
#### 遗憾
1. 无论哪种实现，按值返回下标contains（e）, indexOf（e）, remove（e） 都需遍历所有元素进行比较，性能可想像的不会太好；  
2. 没有按元素值排序的SortedList
### Map
#### HashMap
1. 以Entry[]数组实现的哈希桶数组，用Key的哈希值取模桶数组的大小可得到数组下标;  **???**  
2. 插入元素时，如果两条Key落在同一个桶（比如哈希值1和17取模16后都属于第一个哈希桶），我们称之为哈希冲突;  
	JDK的做法是链表法，Entry用一个next属性实现多个Entry以单向链表存放。查找哈希值为17的key时，先定位到哈希桶，然后链表遍历桶里所有元素，逐个比较其Hash值然后key值  
	在JDK8里，新增默认为8的阈值，当一个桶里的Entry超过閥值，就不以单向链表而以红黑树来存放以加快Key的查找速度  
3. 取模用与操作（hash & （arrayLength-1））会比较快，所以数组的大小永远是2的N次方， 你随便给一个初始值比如17会转为32。默认第一次放入元素时的初始值是16
4. iterator（）时顺着哈希桶数组来遍历，看起来是个乱序
#### LinkedHashMap
1. 扩展HashMap，每个Entry增加双向链表，号称是最占内存的数据结构  
2. 支持iterator（）时按Entry的插入顺序来排序（如果设置accessOrder属性为true，则所有读写访问都排序）
3. 插入时，Entry把自己加到Header Entry的前面去。如果所有读写访问都要排序，还要把前后Entry的before/after拼接起来以在链表中删除掉自己，所以此时读操作也是线程不安全的了  **??**
#### TreeMap
1. 以红黑树实现，红黑树又叫自平衡二叉树
2. 对于任一节点而言，其到叶节点的每一条路径都包含相同数目的黑结点。 上面的规定，使得树的层数不会差的太远，使得所有操作的复杂度不超过 O（lgn），但也使得插入，修改时要复杂的左旋右旋来保持树的平衡
3. 支持iterator（）时按Key值排序，可按实现了Comparable接口的Key的升序排序，或由传入的Comparator控制。可想象的，在树上插入/删除元素的代价一定比HashMap的大。
4. 支持SortedMap接口，如firstKey（），lastKey（）取得最大最小的key，或sub（fromKey, toKey）, tailMap（fromKey）剪取Map的某一段。
### Set
1. 所有Set几乎都是内部用一个Map来实现, 因为Map里的KeySet就是一个Set，而value是假值，全部使用同一个Object即可  
2. Set的特征也继承了那些内部的Map实现的特征:  
	HashSet：内部是HashMap  
	LinkedHashSet：内部是LinkedHashMap  
	TreeSet：内部是TreeMap的SortedSet  
	
## Eclipse快捷键
1. Alt+Shift+A: 快选
2. Ctrl+F11 运行
3. Ctrl+D 删除一行
4. Ctrl+/ 注释多行
5. Alt+Shift+S 快捷生成get,set,构造,toString方法
6. Ctrl+ 代码:查看源码




